using System;
using System.IO;
using Microsoft.Extensions.Configuration;

namespace Thiqah.Data
{

    public class ApplicationConfig
    {
        static ApplicationConfig()
        {
            if (String.IsNullOrWhiteSpace(ConnectionString))
            {
                var env = Environment.GetEnvironmentVariable("ASPNETCORE_ENVIRONMENT");
                var configurationBuilder = new ConfigurationBuilder();
                var path = Path.Combine(Directory.GetCurrentDirectory(),
                    $"appsettings{(string.IsNullOrWhiteSpace(env) ? "" : "." + env)}.json");
                configurationBuilder.AddJsonFile(path, false);
                var root = configurationBuilder.Build();
                ConnectionString = root.GetConnectionString("ThiqaConnectionString");
            }
        }

        public static string ConnectionString { get; }
    }
}