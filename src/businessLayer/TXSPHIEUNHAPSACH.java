/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.PHIEUNHAPSACH;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class TXSPHIEUNHAPSACH {
    public boolean insert (PHIEUNHAPSACH pns) throws Exception
    {
        String sql="insert into PHIEUNHAPSACH(NGAYNHAP, TENSACH, THELOAI, TACGIA, SL) values(?,?,?,?,?)";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            
            psmt.setDate(1,(Date) pns.getNGAYNHAP());
            psmt.setString(2, pns.getTENSACH());
            psmt.setString(3, pns.getTHELOAI());
            psmt.setString(4, pns.getTACGIA());
            psmt.setInt(5, pns.getSL());
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean update (PHIEUNHAPSACH pns) throws Exception
    {
        String sql="update PHIEUNHAPSACH set NGAYNHAP = ?, TENSACH = ?, THELOAI = ?, TACGIA = ?, SL = ? where MAPN = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(6, pns.getMAPN());
            psmt.setDate(1,(Date) pns.getNGAYNHAP());
            psmt.setString(2, pns.getTENSACH());
            psmt.setString(3, pns.getTHELOAI());
            psmt.setString(4, pns.getTACGIA());
            psmt.setInt(5, pns.getSL());
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean delete (int MAPN) throws Exception
    {
        String sql="delete from PHIEUNHAPSACH where MAPN = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(1, MAPN);
            
            
            return psmt.executeUpdate()>0;
        }
    }
    }

    
}
