using System;
using Microsoft.Extensions.DependencyInjection;

public static class RepositoryExtensions{
    public static void RegisterRepos(this IServiceCollection services){
        services.AddTransient<IBaseRepository<Category,Guid>,CategoryRepository>();
    }
}