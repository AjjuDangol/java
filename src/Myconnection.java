
import java.sql.DriverManager;
import java.sql.Connection;


public class Myconnection {
   public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("`com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
        }
        catch (Exception ex){
		System.out.println(ex.getMessage());
            }
	return con;
} 
}
 
