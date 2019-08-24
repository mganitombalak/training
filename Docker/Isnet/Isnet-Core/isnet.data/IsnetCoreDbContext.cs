using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Design;

public class IsnetCoreDbContextFactory : IDesignTimeDbContextFactory<IsnetCoreDbContext>
{
    internal static string ConnectionString = "Host=localhost;Database=IsNetDB;Username=postgres;Password=P@ssw0rd";
    public IsnetCoreDbContext CreateDbContext(string[] args)
    {
        var optionsBuilder = new DbContextOptionsBuilder<IsnetCoreDbContext>();
        optionsBuilder.UseNpgsql(ConnectionString);
        return new IsnetCoreDbContext(optionsBuilder.Options);
    }
}

public class IsnetCoreDbContext : DbContext
{

    public IsnetCoreDbContext(DbContextOptions<IsnetCoreDbContext> ctx) : base(ctx)
    {
    }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if (optionsBuilder.IsConfigured) return;
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.ForNpgsqlUseIdentityColumns();
    }

    public DbSet<Category> Categories { get; set; }
}