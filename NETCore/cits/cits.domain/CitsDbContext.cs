using cits.domain;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Design;

public class CitsDbContextDbContextFactory : IDesignTimeDbContextFactory<CitsDbContext>
    {
    internal static string connectionString = "Server=localhost;Database=citsDB;User Id=sa;Password=P@ssw0rd;";
        public CitsDbContext CreateDbContext(string[] args)
        {
            var optionsBuilder = new DbContextOptionsBuilder<CitsDbContext>();
            optionsBuilder.UseSqlServer(connectionString);
            return new CitsDbContext(optionsBuilder.Options);
        }
    }
public class CitsDbContext : DbContext
{
    public CitsDbContext(DbContextOptions<CitsDbContext> ctx) : base(ctx)
    {

    }

    public DbSet<User> Users { get; set; }
    public DbSet<Category> Categories { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if (!optionsBuilder.IsConfigured)
        {
            optionsBuilder.UseSqlServer(CitsDbContextDbContextFactory.connectionString);
        }
        base.OnConfiguring(optionsBuilder);
    }
    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {

    }
}