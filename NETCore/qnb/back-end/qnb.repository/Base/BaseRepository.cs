using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using Microsoft.EntityFrameworkCore;
using NodaTime;

public class BaseRepository<T,IdType>:IBaseRepository<T,IdType>  where T : class, IEntity<IdType> {
     
    protected readonly QnbCoreDbContext currentDbcontext;

        protected BaseRepository(QnbCoreDbContext dbContext)
        {
            currentDbcontext = dbContext;
        }

        public ICollection<T> find(Expression<Func<T, bool>> filter = null,params string[] includes)
        {
            IQueryable<T> queryable = currentDbcontext.Set<T>();
            if (includes.Any()) includes.ToList().ForEach(i => { queryable = queryable.Include(i); });
            
            if (filter != null) queryable = queryable.Where(filter);
            
            return queryable.ToList();
        }


        public T findById(IdType Id)
        {
            return currentDbcontext.Set<T>().FirstOrDefault(e => e.Id.Equals(Id));
        }

        public T Create(T entity)
        {
            currentDbcontext.Set<T>().Add(entity);
            entity.CreatedAt = ZonedDateTime.FromDateTimeOffset(DateTimeOffset.Now);
            currentDbcontext.SaveChanges();
            return entity;
        }

        public T Update(T entity)
        {
            currentDbcontext.Set<T>().Update(entity);
            entity.UpdatedAt = ZonedDateTime.FromDateTimeOffset(DateTimeOffset.Now);
            currentDbcontext.Entry(entity).Property(p => p.CreatedAt).IsModified = false;
            currentDbcontext.SaveChanges();
            return entity;
        }

        public void Delete(T entity)
        {
            currentDbcontext.Set<T>().Remove(entity);
            entity.DeletedAt = ZonedDateTime.FromDateTimeOffset(DateTimeOffset.Now);
            currentDbcontext.SaveChanges();
        }

        public void DeleteById(IdType Id)
        {
            currentDbcontext.Set<T>().Remove(findById(Id));
            currentDbcontext.SaveChanges();
        }

        public void SoftDelete(IdType Id)
        {
            var item = findById(Id);
            item.IsDeleted = true;
            item.DeletedAt = ZonedDateTime.FromDateTimeOffset(DateTimeOffset.Now);
            currentDbcontext.Set<T>().Update(item);
            currentDbcontext.SaveChanges();
        }

        public bool Exist(IdType Id)
        {
            return currentDbcontext.Set<T>().Any(e => e.Id.Equals(Id) && !e.IsDeleted);
        }

        public int GetTotalRecordCount()
        {
            return currentDbcontext.Set<T>().Count(c => !c.IsDeleted);
        }
}