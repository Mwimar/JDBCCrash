import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        /*
        1.import package
        2.load connection
        3.create connection
        create statement
        execute statement
        process statement
        close
        */
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="7788";
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");
        String query = "select sname from student where sid=2";
        Statement st = con.createStatement();
    }
}
