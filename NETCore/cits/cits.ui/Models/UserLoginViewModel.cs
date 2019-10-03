using System.ComponentModel.DataAnnotations;

namespace cits.ui.Models
{
    public class UserLoginViewModel
    {
        [Required]
        [MaxLength(64)]
        public string UserName { get; set; }
        
        [Required]
        [MaxLength(512)]
        public string Password { get; set; }
        public bool RememberMe { get; set; }
    }
}