using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;

namespace SecureCoding.Controllers
{
    public class KeyLoggerController:Controller
    {
        public ActionResult Index(string key)
        {
            Debug.WriteLine(key);
            return Ok();
        }
    }
}