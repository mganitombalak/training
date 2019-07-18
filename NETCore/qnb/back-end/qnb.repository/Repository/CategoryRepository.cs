using System;

public class CategoryRepository : BaseRepository<Category, Guid>
{
    public CategoryRepository(QnbCoreDbContext dbContext) : base(dbContext)
    {
    }
}