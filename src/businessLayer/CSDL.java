/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vu Khanh
 */
public class CSDL {
    private static Connection ketNoi;
    public static Connection getKetNoi(){
        try{
            //buoc 1 nap trinh dieu khien
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // buoc 2 tao chuoi ket noi
            String url="jdbc:sqlserver://\\\\SQLEXPRESS:1433;databaseName=QuanLyNhaSach;encrypt=true;trustServerCertificate=true;";
            //buoc 3: tao ket noi
            ketNoi = DriverManager.getConnection(url, "sa", "sa");
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return ketNoi;
    } 
}
