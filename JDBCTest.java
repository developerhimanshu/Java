import java.sql.*;
public class JDBCTest {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("com.mysq.jdbc.Driver");
            System.out.println("Success");
        } catch(Exception e){
            System.out.println(e);
        }

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse1?autoReconnect=true&useSSL=false", "root", "himanshu");
            System.out.println("connction established");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
