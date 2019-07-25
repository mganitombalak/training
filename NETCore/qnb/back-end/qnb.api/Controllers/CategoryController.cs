using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace qnb.api.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CategoryController : ControllerBase
    {
        private IBaseRepository<Category, Guid> repo;

        public CategoryController(IBaseRepository<Category, Guid> catRepo)
        {
            repo = catRepo;
        }

        // GET api/values
        [HttpGet]
        public JsonResult Get()
        {
            return new JsonResult(value: new {data = repo.find(item => !item.IsDeleted).ToList(), server = Dns.GetHostName()});
        }

        // GET api/values/5
        [HttpGet("{id}")]
        public ActionResult<string> Get(int id)
        {
            return "value";
        }

        // POST api/values
        [HttpPost]
        public void Post([FromBody] string value)
        {
        }

        // PUT api/values/5
        [HttpPut("{id}")]
        public void Put(int id, [FromBody] string value)
        {
        }

        // DELETE api/values/5
        [HttpDelete("{id}")]
        public void Delete(int id)
        {
        }
    }
}