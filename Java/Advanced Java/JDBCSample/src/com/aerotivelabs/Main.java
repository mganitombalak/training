package com.aerotivelabs;

import com.sun.rowset.CachedRowSetImpl;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String connectionURL = "jdbc:h2:tcp://localhost/~/test";
        String user = "sa";
        String password = "";
        String query = "SELECT * FROM CARS";

        try {
            Class.forName("org.h2.Driver");
//            Connection  conn =
//                    DriverManager.getConnection(connectionURL,user,password);
//            Statement stmt = conn.createStatement();
//            ResultSet result = stmt.executeQuery(query);
//            while(result.next())
//            {
//                System.out.printf("%d %s %d ZXC%n",
//                        result.getInt(1),
//                        result.getString(2),
//                        result.getInt(3));
//            }

//            RowSet rs = new CachedRowSetImpl();
//            rs.setUrl(connectionURL);
//            rs.setCommand(query);
//            rs.setUsername("sa");
//            rs.setPassword("");
//            rs.execute();
//            while(rs.next())
//            {
//                System.out.printf("%d %s %d %n",
//                        rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3));
//            }


//            Connection conn =
//                    DriverManager.getConnection(connectionURL, user, password);
//            Statement stmt = conn.createStatement();
//            ResultSet result = stmt.executeQuery("SELECT * FROM EMPLOYEE");
//
//            CachedRowSet cachedRs = new CachedRowSetImpl();
//            cachedRs.populate(result);
//            stmt.close();
//
//            while (cachedRs.next()) {
//                if (cachedRs.getString("TITLE").equals("Dev")) {
//                    int salary = cachedRs.getInt("SALARY");
//                    cachedRs.updateInt("SALARY", (int) (salary * 1.1));
//                }
//                cachedRs.updateRow();
////                System.out.printf("%d %s %s %s %d %n",
////                        cachedRs.getInt("ID"),
////                        cachedRs.getString("FIRSTNAME"),
////                        cachedRs.getString("LASTNAME"),
////                        cachedRs.getString("TITLE"),
////                        cachedRs.getInt("SALARY")
////                );
//            }
//
//            cachedRs.setTableName("employee");
//            cachedRs.acceptChanges(conn);

            Connection conn =
                    DriverManager.getConnection(connectionURL, user, password);

            conn.setAutoCommit(false);

            String stmt1 = "UPDATE employee SET title='CTO' where id=1";
            String stmt2 = "UPDATE employee SET title='Dev' where id=4";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(stmt1);
            Savepoint sp = conn.setSavepoint("SP1");
            stmt.executeUpdate(stmt2);

            conn.rollback(sp);
            conn.commit();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
