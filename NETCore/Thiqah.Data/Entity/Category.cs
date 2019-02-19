using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;

namespace Thiqah.Data.Entity
{
    public class Category
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public IList<SubCategory> SubCategories { get; set; }
    }
}