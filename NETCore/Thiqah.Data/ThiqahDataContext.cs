using Microsoft.EntityFrameworkCore;
using Thiqah.Data.Entity;

namespace Thiqah.Data
{
    public class ThiqahDataContext : DbContext
    {
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer(ApplicationConfig.ConnectionString);
            base.OnConfiguring(optionsBuilder);
        }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {

            modelBuilder.Entity<Category>().Property(e => e.Name).HasMaxLength(255);
            modelBuilder.Entity<SubCategory>().Property(e => e.Name).HasMaxLength(255);
            modelBuilder.Entity<SubCategory>()
            .HasOne(e => e.Parent)
            .WithMany(p => p.SubCategories)
            .HasForeignKey(e => e.ParentId)
            .HasConstraintName("FK_Category_CategoryID_SubCategory_ParentId")
            .IsRequired();

            modelBuilder.ForSqlServerUseIdentityColumns();

        }

        public DbSet<Category> Categories { get; set; }
        public DbSet<SubCategory> SubCategories { get; set; }
    }
}