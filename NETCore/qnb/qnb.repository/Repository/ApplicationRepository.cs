using System;

public class ApplicationRepository : BaseRepository<Application, Guid>
{
    public ApplicationRepository(QnbCoreDbContext dbContext) : base(dbContext)
    {
    }
}