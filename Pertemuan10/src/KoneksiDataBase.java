/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author User
 */
public class KoneksiDataBase {
   private static Connection koneksi;
  public static Connection getKoneksi(){
      if (koneksi == null){
      try{
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        System.out.println("Berhasil meregristrasi driver");
        String url="jdbc:mysql://Localhost:3306/db_toko";
        String user="root";
        String pass="";
        koneksi = DriverManager.getConnection(url, user, pass);
        System.out.println("Berhasil Terkoneksi");
      }catch(SQLException ex){
            System.out.println("Gagal meregristrasi driver");
            System.out.println("Pesan :"+ex.getMessage());
      }    
      }
      return koneksi;
  }
}
    

