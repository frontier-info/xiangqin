package frontier.week4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresTest {

	public static void dbConnect() throws Exception {
	      Connection con = null;
	      Statement stm = null;
	      ResultSet rs = null;
	      int num = 1;

	      String url        = "jdbc:postgresql://localhost:5432/postgres";
	      String user       = "postgres";
	      String password   = "root";          

	      try {
	         Class.forName("org.postgresql.Driver").newInstance();
	         con = DriverManager.getConnection(url, user, password);
	         stm = con.createStatement();
	         rs = stm.executeQuery("SELECT * FROM student_info");
	         while (rs.next()) {
	             System.out.println("[" + num + " 件目]"); 
	             num++;
	             System.out.println("name   : " + rs.getString("name"));
	             System.out.println("gender : " + rs.getString("gender"));
	             System.out.println("age    : " + rs.getInt("age"));
	             System.out.println("score    : " + rs.getDouble("score"));
	         }
	      } catch(SQLException e) {
	          System.out.println("error dbConnect()");
	          e.printStackTrace();
	        }finally {
	            try {
	                if ((rs != null)||(stm != null)||(con != null)) {
	                    rs.close();
	                }
	            } catch (Exception e) {
	                 e.printStackTrace();
	            }
	        }
	      }

	   public static void main(String[] args) throws Exception {
	      try {
	          System.out.println("DB access start");
	          PostgresTest.dbConnect();
	      } catch (Exception e) {
	          System.out.println("error main()");
	          e.printStackTrace();
	      } finally {
	          System.out.println("DB access finished");
	      }
	   }

}
