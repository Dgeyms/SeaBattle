package ConnectionDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
* connection database
 */
/*public class ConnectionDataBase {

        // Connection database
        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/SeaBattle", // connection POSTGRESQL
                "postgres", "postgres");

        Statement stmt = con.createStatement(); // create a request
        ResultSet rs = stmt.executeQuery("SELECT * FROM .....");



}*/
