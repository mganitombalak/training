using System.Diagnostics;
using System.Security.Cryptography;
using System.Text;
using cits.ui.Models;
using Ganss.XSS;
using Microsoft.AspNetCore.Mvc;

namespace cits.ui.Controllers
{
    public class LoginController : Controller
    {
        private IHtmlSanitizer _sanitizer;
        public LoginController(IHtmlSanitizer sanitizer)
        {
            _sanitizer = sanitizer;
        }
        // GET
        public IActionResult Index()
        {
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public void IndexPost([FromForm] UserLoginViewModel model)
        {
            var secret = "myveryimportnant_secret_key";
            var salt = "ctis_salt_bae";
            model.UserName = _sanitizer.Sanitize(model.UserName);
            if (ModelState.IsValid)
            {
                using (var sha = SHA512.Create())
                {
                    var hash = model.Password + secret + salt;
                    var hashed = sha.ComputeHash(Encoding.UTF8.GetBytes(hash));
                    Debug.WriteLine(hashed);
                }
                 
                Debug.WriteLine(model.UserName);
            }
        }
    }
}