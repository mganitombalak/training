using Microsoft.EntityFrameworkCore.Migrations;

namespace qnb.data.Migrations
{
    public partial class FixForColumName : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "UpdateAt",
                table: "Categories",
                newName: "UpdatedAt");

            migrationBuilder.RenameColumn(
                name: "UpdateAt",
                table: "Applications",
                newName: "UpdatedAt");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "UpdatedAt",
                table: "Categories",
                newName: "UpdateAt");

            migrationBuilder.RenameColumn(
                name: "UpdatedAt",
                table: "Applications",
                newName: "UpdateAt");
        }
    }
}
