using System.IO;
using System.Runtime.InteropServices.WindowsRuntime;
using cits.ui.Models;
using FileSignatures;
using FileSignatures.Formats;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace cits.ui.Controllers
{
    public class FileController:Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public ActionResult IndexPost([FromForm]FileUploadModel model)
        {
            ValidateFile(model.uploadFile);
            return Ok();
        }

        private bool ValidateFile(IFormFile file)
        {
            var ext = Path.GetExtension(file.FileName);
            var inspector = new FileFormatInspector();   
            var format = inspector.DetermineFileFormat(file.OpenReadStream());
            return ext == ".pdf" & (format is Pdf) & file.Length<= 5e0;
            
        }
    }
}