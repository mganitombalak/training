using NodaTime;

public interface IEntity<T>
{
    T Id { get; set; }
    bool IsActive { get; set; }
    bool IsDeleted { get; set; }
    ZonedDateTime CreatedAt { get; set; }
    ZonedDateTime? UpdateAt { get; set; }
    ZonedDateTime? DeletedAt { get; set; }
}