
package gym_manager;

import java.sql.*;
public class MyConnection{
    Connection con;
    Statement stm;
    MyConnection()
    {
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management","root","root");
        stm=con.createStatement();
              
     }
      catch(Exception e){
          e.printStackTrace();
      }
    }
public static void main(String args[]) {
        MyConnection myConnection = new MyConnection();
}

}
