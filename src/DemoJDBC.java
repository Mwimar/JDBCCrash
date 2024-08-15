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
        String sql = "insert into student values(5, 'Phanice', 99)";
        Statement st = con.createStatement();
        boolean status = st.execute(sql);
        System.out.println(status);
//        ResultSet rs = st.executeQuery(sql);
////        rs.next();
////       String name = rs.getString("sname");
////        System.out.println(name);
//        while(rs.next()){
//            System.out.print(rs.getInt(1 )+ " - ");
//            System.out.print(rs.getString(2)+ " - ");
//            System.out.println(rs.getInt(3));
//        }

//        System.out.println(rs.next());
        con.close();
        System.out.println("Connection closed");
    }
}
