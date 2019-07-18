using System;
using System.Collections.Generic;
using System.Linq.Expressions;

public interface IBaseRepository<T,IdType>
{
        ICollection<T> find(Expression<Func<T, bool>> filter = null,params string[] includes);

        T findById(IdType Id);

        T Create(T entity);

        T Update(T entity);

        void Delete(T entity);
        void DeleteById(IdType Id);

        void SoftDelete(IdType Id);

        bool Exist(IdType Id);

        int GetTotalRecordCount();
}