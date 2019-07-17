using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Design;

public class QnbCoreDbContextFactory : IDesignTimeDbContextFactory<QnbCoreDbContext>
{
    internal static string ConnectionString = "Host=localhost;Database=QnbCore;Username=postgres;Password=P@ssw0rd";
    public QnbCoreDbContext CreateDbContext(string[] args)
    {
        var optionsBuilder = new DbContextOptionsBuilder<QnbCoreDbContext>();
        optionsBuilder.UseNpgsql(ConnectionString, builder =>
        {
            builder.UseNodaTime();
        });

        return new QnbCoreDbContext(optionsBuilder.Options);
    }
}
public class QnbCoreDbContext : DbContext
{

    public QnbCoreDbContext(DbContextOptions<QnbCoreDbContext> ctx) : base(ctx)
    {
    }

    public DbSet<Category> Categories { get; set; }
    public DbSet<Application> Applications { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder
        .UseNpgsql(QnbCoreDbContextFactory.ConnectionString, builder =>
        {
            builder.UseNodaTime();
        });
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.HasPostgresExtension("uuid-ossp");

        #region Category
        modelBuilder.Entity<Category>()
        .Property(category => category.Id)
        .HasDefaultValueSql("uuid_generate_v4()");

        modelBuilder.Entity<Category>()
        .ForNpgsqlHasIndex(category => category.DisplayOrder);
        #endregion

        #region Application
        modelBuilder.Entity<Application>()
        .Property(app => app.Id)
        .HasDefaultValueSql("uuid_generate_v4()");

        modelBuilder.Entity<Application>()
        .HasOne(app => app.Category)
        .WithMany(category => category.Applications)
        .HasForeignKey(app => app.CategoryId)
        .HasConstraintName("FK_Category_App")
        .IsRequired();
        #endregion

        foreach (var entityType in modelBuilder.Model.GetEntityTypes())
        {
            modelBuilder.Entity(entityType.ClrType)
            .Property("IsActive")
            .HasDefaultValue(true);
            modelBuilder.Entity(entityType.ClrType)
            .Property("IsDeleted")
            .HasDefaultValue(false);
        }

    }
}