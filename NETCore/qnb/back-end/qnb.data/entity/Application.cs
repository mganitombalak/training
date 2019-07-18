using System;
using System.ComponentModel.DataAnnotations;
using NodaTime;

public class Application : IEntity<Guid>
{
    public Guid Id { get; set; }
    [MaxLength(8)]
    public string Code { get; set; }
    [MaxLength(32)]
    public string Name { get; set; }
    public Guid CategoryId { get; set; }
    public Category Category { get; set; }

    public bool IsActive { get; set; }
    public bool IsDeleted { get; set; }
    public ZonedDateTime CreatedAt { get; set; }
    public ZonedDateTime? UpdatedAt { get; set; }
    public ZonedDateTime? DeletedAt { get; set; }
}