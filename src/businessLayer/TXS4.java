/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import businessLayer.CSDL;
import dataTransferObject.BAOCATON;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class TXS4 {
    public boolean insert (BAOCATON bct) throws Exception
    {
            String sql="insert into BAOCAOTON(THANG,MAPN, TONDAU,PHATSINH) values(?,?,?,?)";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setString(1, bct.getTHANG());
            psmt.setInt(2, bct.getMAPN());
            psmt.setInt(3, bct.getTONDAU());
            psmt.setInt(4, bct.getPHATSINH());
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean update (BAOCATON bct) throws Exception
    {
        String sql="update BAOCAOTON set THANG = ?, MAPN = ?, TONDAU = ?, PHATSINH = ? where MABCT = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(5, bct.getMABCT());
            psmt.setString(1, bct.getTHANG());
            psmt.setInt(2, bct.getMAPN());
            psmt.setInt(3, bct.getTONDAU());
            psmt.setInt(4, bct.getPHATSINH());
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean delete (int MABCT) throws Exception
    {
        String sql="delete from BAOCAOTON where MABCT = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(1, MABCT);
            
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    
}
