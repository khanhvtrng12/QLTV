/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import businessLayer.CSDL;
import dataTransferObject.PHIEUTHUTIEN;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class TXS3 {
    public boolean insert (PHIEUTHUTIEN ptt) throws Exception
    {
            String sql="insert into PHIEUTHUTIEN(HOTENKH, SDT, DIACHI,EMAIL, NGAYTHUTIEN, SOTIENTHU ) values(?,?,?,?,?,?)";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setString(1, ptt.getHOTENKH());
            psmt.setString(2, ptt.getSDT());
            psmt.setString(3, ptt.getDIACHI());
            psmt.setString(4, ptt.getEMAIL());
            psmt.setDate(5,(Date) ptt.getNGAYTHUTIEN());
            psmt.setInt(6, ptt.getSOTIENTHU());


            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean update (PHIEUTHUTIEN ptt) throws Exception
    {
        String sql="update PHIEUTHUTIEN set HOTENKH = ?, SDT = ?, DIACHI = ?, EMAIL = ?, NGAYTHUTIEN = ?, SOTIENTHU = ? where MAPT = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(7, ptt.getMAPT());
            psmt.setString(1, ptt.getHOTENKH());
            psmt.setString(2, ptt.getSDT());
            psmt.setString(3, ptt.getDIACHI());
            psmt.setString(4, ptt.getEMAIL());
            psmt.setDate(5,(Date) ptt.getNGAYTHUTIEN());
            psmt.setInt(6, ptt.getSOTIENTHU());

            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean delete (int MAPT) throws Exception
    {
        String sql="delete from PHIEUTHUTIEN where MAPT = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(1, MAPT);
            
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    
}
