using System;
using Microsoft.EntityFrameworkCore.Migrations;
using NodaTime;

namespace qnb.data.Migrations
{
    public partial class Category : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Applications",
                columns: table => new
                {
                    Id = table.Column<Guid>(nullable: false, defaultValueSql: "uuid_generate_v4()"),
                    Code = table.Column<string>(maxLength: 8, nullable: true),
                    Name = table.Column<string>(maxLength: 32, nullable: true),
                    CategoryId = table.Column<Guid>(nullable: false),
                    IsActive = table.Column<bool>(nullable: false, defaultValue: true),
                    IsDeleted = table.Column<bool>(nullable: false, defaultValue: false),
                    CreatedAt = table.Column<ZonedDateTime>(nullable: false),
                    UpdateAt = table.Column<ZonedDateTime>(nullable: true),
                    DeletedAt = table.Column<ZonedDateTime>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Applications", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Category_App",
                        column: x => x.CategoryId,
                        principalTable: "Categories",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Applications_CategoryId",
                table: "Applications",
                column: "CategoryId");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Applications");
        }
    }
}
