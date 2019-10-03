using System.ComponentModel.DataAnnotations;

public class Category
{
    [Key] public long Id { get; set; }
    public string Name { get; set; }
    public string IconPath { get; set; }
}