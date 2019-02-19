
using System.Collections.Generic;
using System.Linq;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Thiqah.Data;
using Thiqah.Data.Entity;

namespace Thiqah.Web.Pages.Category

{
    public class Index : PageModel
    {
        public IList<Category> Categories { get; private set; }
        private ThiqahDataContext dbContext;
        public Index(ThiqahDataContext dbContext)
        {
            this.dbContext = dbContext;
        }
        public void OnGet()
        {
            this.Categories = this.dbContext.Categories.ToList();
        }
}
}