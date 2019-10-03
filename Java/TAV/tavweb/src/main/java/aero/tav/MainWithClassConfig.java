package aero.tav;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aero.tav.business.MyComplexBusinessObject;
import aero.tav.config.ApplicationConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MainWithClassConfig {
    private static ApplicationContext ctx;

	public static void main(String[] args) {
        ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MyComplexBusinessObject obj=ctx.getBean("cbo", MyComplexBusinessObject.class);
        obj.doSomeComplexThings();

        String connectionURL = "jdbc:h2:tcp://localhost/~/tavdb";
        String user = "sa";
        String password="123456";
        String query = "SELECT * FROM Cars;";

        try{
            Class.forName("org.h2.Driver");
            Connection conn= DriverManager.getConnection(connectionURL,user,password);
            Statement stmt= conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while(resultSet.next()){
                System.out.printf("%d. %s %s%n",
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3));
            }
            stmt.close();
            conn.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
