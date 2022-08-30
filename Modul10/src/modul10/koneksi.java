package modul10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class koneksi {
    public static Connection con;  
    public static Connection koneksiDB() throws SQLException{
          if (con == null){
           try{
            String url="jdbc:mysql://localhost/maghfira";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con =(Connection)DriverManager.getConnection(url, user, pass);
                      
    }   catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal koneksi");
        }
       }
          return con  ;
    }
}

