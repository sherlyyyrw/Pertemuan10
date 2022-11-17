/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
    try {
        // TODO code application logic here
    throws SQLException{
    try {
        Driver driver = new Driver ();
        DriverManager.registerDriver(driver);
        System.out.println("Berhasil meregister driver");
    }
    catch (SQLException ex){
        System.out.println("Gagal meregistasi driver");
        System.out.println("Pesan: "+ex.getMessage());
    }
    try {
        String url="jdbc:mysql://localhost:3306/db_toko";
        String user="root";
        String pass="";
        Connection koneksi = DriverManager.getConnection(url, user, pass);
        System.out.println("Berhasil meregister driver");
    }
    catch(SQLException ex){
        System.out.println("Gagal meregister driver");
        System.out.println("Pesan :"+ex.getMessage());
        }
    }    
}
    }
    
}
