using System;
using System.ComponentModel.DataAnnotations;

namespace cits.domain
{
    public class User
    {
        [Key]
        public long Id{get;set;}
        public string FirstName{get;set;}
        public string LastName{get;set;}
        [Required]
        public string Username{get;set;}
        [Required]
        public string Password{get;set;}
    }
}
