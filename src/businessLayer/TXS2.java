/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;
import dataTransferObject.HOADONBANSACH;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Admin
 */
public class TXS2 {
    public boolean insert (HOADONBANSACH hdbs) throws Exception
    {
        String sql="insert into HOADONBANSACH(NGAYLAPHOADON,MAPT,MAPN,MABCCN,SL,DONGIA) values(?,?,?,?,?,?)";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setDate(1, (Date) hdbs.getNGAYLAPHOADON());    
            psmt.setInt(2, hdbs.getMAPT());
            psmt.setInt(3, hdbs.getMAPN());
            psmt.setInt(4, hdbs.getMABCCN()); 
            psmt.setInt(5, hdbs.getSL());
            psmt.setInt(6, hdbs.getDONGIA());
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean update (HOADONBANSACH hdbs)
    {
        String sql="update HOADONBANSACH set NGAYLAPHOADON = ?,MAPT = ?,MAPN = ?,MABCCN = ?, SL = ?,DONGIA = ? where MAHD = ?"
                + " ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
                psmt.setInt(7, hdbs.getMAHD());
                psmt.setDate(1, (Date) hdbs.getNGAYLAPHOADON());    
                psmt.setInt(2, hdbs.getMAPT());
                psmt.setInt(3, hdbs.getMAPN());
                psmt.setInt(4, hdbs.getMABCCN()); 
                psmt.setInt(5, hdbs.getSL());
                psmt.setInt(6, hdbs.getDONGIA());
                return psmt.executeUpdate()>0;
            }
            catch (Exception e) {
            return false;
        }
    }
    public boolean delete (int MAHD) throws Exception
    {
        String sql="delete from HOADONBANSACH where MAHD = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(1, MAHD);
            
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    
}
