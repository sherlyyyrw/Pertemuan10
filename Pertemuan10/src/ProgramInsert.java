/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author User
 */
public class ProgramInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Connection koneksi = KoneksiDataBase.getKoneksi();
        Statement statement = null;
        try{
           statement = koneksi.createStatement();
           System.out.println("Statement berhasil dibuat");
           String url = "INSERT INTO barang(kode_barang,nama_barang,jumlah,harga)VALUES('B001','Novel',15,25000)";
           statement.executeUpdate(url);
        }catch(SQLException ex){
            System.out.println("Statement gagal dibuat");
            System.out.println("Pesam : "+ex.getMessage());
        }finally{
            if(statement != null){
                try{
                    statement.close();
                    System.out.println("Statement Berhasil Ditutup");
                }catch(SQLException ex){
                    System.out.println("Statement Gagal Ditutup");
                    System.out.println("Pesan : "+ex.getMessage());
                }
            }
            
        }
    }
    
}
    
    

