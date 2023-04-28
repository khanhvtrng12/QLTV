/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import businessLayer.CSDL;
import dataTransferObject.DANHSACHSACH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class TXS {
    public boolean insert (DANHSACHSACH danhs) throws Exception
    {
        String sql="insert into DANHSACHSACH(TENSACH, THELOAI, TACGIA, SL) values(?,?,?,?)";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            
            psmt.setString(1, danhs.getTENSACH());
            psmt.setString(2, danhs.getTHELOAI());
            psmt.setString(3, danhs.getTACGIA());
            psmt.setInt(4, danhs.getSL());
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean update (DANHSACHSACH danhs) throws Exception
    {
        String sql="update DANHSACHSACH set TENSACH = ?, THELOAI = ?, TACGIA = ?, SL = ?"+"where MASACH = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(5, danhs.getMASACH());
            psmt.setString(1, danhs.getTENSACH());
            psmt.setString(2, danhs.getTHELOAI());
            psmt.setString(3, danhs.getTACGIA());
            psmt.setInt(4, danhs.getSL());
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean delete (String MASACH) throws Exception
    {
        String sql="delete from MASACH where MASACH = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setString(1, MASACH);
            
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    /**
     *
     * @param MASACH
     * @return
     * @throws Exception
     */
    public DANHSACHSACH findById(String MASACH) throws Exception{
    
    String sql="select * from DANHSACHSACH where MASACH=?";
    try(
            Connection ketNoi=CSDL.getKetNoi();
            PreparedStatement psmt = ketNoi.prepareStatement(sql);
        ){
        psmt.setString(1, MASACH);
        ResultSet rs= psmt.executeQuery();
        
        if(rs.next()){
            DANHSACHSACH danhs = new DANHSACHSACH();
            danhs.setMASACH(rs.getInt("MASACH"));
            danhs.setTENSACH(rs.getString("TENSACH"));
            danhs.setTHELOAI(rs.getString("THELOAI"));
            danhs.setTACGIA(rs.getString("TACGIA"));
            danhs.setSL(rs.getInt("SL"));
            
            return danhs;
        }
    }
        return null;
    }
    
}
