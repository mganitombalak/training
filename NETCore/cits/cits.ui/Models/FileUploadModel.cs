using Microsoft.AspNetCore.Http;

namespace cits.ui.Models
{
    public class FileUploadModel
    {
        public IFormFile uploadFile { get; set; }
    }
}