using NodaTime;

public interface IEntity<T>
{
    T Id { get; set; }
    bool IsActive { get; set; }
    bool IsDeleted { get; set; }
    ZonedDateTime CreatedAt { get; set; }
    ZonedDateTime? UpdatedAt { get; set; }
    ZonedDateTime? DeletedAt { get; set; }
}