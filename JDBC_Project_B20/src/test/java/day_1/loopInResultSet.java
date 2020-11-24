
    package day_1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

    public class loopInResultSet {
        public static void main(String[] args) throws SQLException {
            // REPLACE THIS IP ADDRESS WITH YOUR OWN THAT WORKING IN SQL DEVELOPER
            String connectionStr = "jdbc:oracle:thin:@100.25.0.135:1521:XE";
            String username = "hr";
            String password = "hr";
            Connection conn = DriverManager.getConnection(connectionStr, username, password);
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS");

            rs.next(); // currently we are at the very first row

            System.out.println("first column value using index: --> " + rs.getString(1));
            System.out.println("first column value using index: --> "+rs.getString(2));

            rs.next();//this will move us to next row so we can read next row
            System.out.println("Region_ID at this row is: "+ rs.getString("REGION_ID"));
            System.out.println("Region_Name at this row is: "+rs.getString("REGION_NAME"));



        }
    }

