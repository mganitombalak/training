package aero.tav;


import com.sun.tools.doclint.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aero.tav.business.MyComplexBusinessObject;
import aero.tav.config.ApplicationConfig;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


public class MainWithClassConfig {
    private static ApplicationContext ctx;

	public static void main(String[] args) {
//        ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        MyComplexBusinessObject obj=ctx.getBean("cbo", MyComplexBusinessObject.class);
//        obj.doSomeComplexThings();
//
//        String connectionURL = "jdbc:h2:tcp://localhost/~/tavdb";
//        String user = "sa";
//        String password="123456";
//        String query = "SELECT * FROM Cars;";
//
//        try{
//            Class.forName("org.h2.Driver");
//            Connection conn= DriverManager.getConnection(connectionURL,user,password);
//            Statement stmt= conn.createStatement();
//            ResultSet resultSet = stmt.executeQuery(query);
//            while(resultSet.next()){
//                System.out.printf("%d. %s %s%n",
//                        resultSet.getInt(1),
//                        resultSet.getString(2),
//                        resultSet.getString(3));
//            }
//            stmt.close();
//            conn.close();
//        }
//        catch (Exception ex){
//            ex.printStackTrace();
//        }

        StandardServiceRegistry registeryBuilder = new StandardServiceRegistryBuilder().configure().build();

        MetadataSources  metadataSources = new MetadataSources(registeryBuilder);
        Metadata metadata= metadataSources.getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            String sql = "SELECT c FROM Car c";
            Query<Car> query = session.createQuery(sql);
            List<Car> result = query.getResultList();
            result.stream().forEach(c-> System.out.printf("%d. %s %s%n",
                    c.getId(),c.getBrand(),c.getModel()));
            session.getTransaction().commit();
        } catch (Exception ex){
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            session.close();
        }

    }
}
