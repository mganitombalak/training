namespace Thiqah.Data.Entity
{
    public class SubCategory
    {
        public int Id { get; set; }

        public string Name { get; set; }

        public Category Parent { get; set; }

        public int ParentId { get; set; }
    }
}