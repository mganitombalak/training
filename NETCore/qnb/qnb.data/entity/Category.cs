using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using NodaTime;

public class Category : IEntity<Guid>
{
    public Guid Id { get; set; }

    [MaxLength(32)]
    public string Name { get; set; }

    public ICollection<Application> Applications { get; set; }

    public int DisplayOrder { get; set; }
    public bool IsActive { get; set; }
    public bool IsDeleted { get; set; }
    public ZonedDateTime CreatedAt { get; set; }
    public ZonedDateTime? UpdateAt { get; set; }
    public ZonedDateTime? DeletedAt { get; set; }
}