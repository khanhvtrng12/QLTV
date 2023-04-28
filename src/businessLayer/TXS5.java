/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import businessLayer.CSDL;
import dataTransferObject.BAOCAOCONGNO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class TXS5 {
    public boolean insert (BAOCAOCONGNO bccn) throws Exception
    {
            String sql="insert into BAOCAOCONGNO(THANG,MAPT, NODAU,PHATSINH) values(?,?,?,?)";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(2, bccn.getMAPT());
            psmt.setString(1, bccn.getTHANG());
            psmt.setInt(3, bccn.getNODAU());
            psmt.setInt(4, bccn.getPHATSINH());
//            psmt.setInt(5, bccn.getNOCUOI());
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    public boolean update (BAOCAOCONGNO bccn) throws Exception
    {
        String sql="update BAOCAOCONGNO set MAPT = ?, THANG = ?, NODAU = ?, PHATSINH = ? "+"where MABCCN = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(5, bccn.getMABCCN());
            psmt.setInt(1, bccn.getMAPT());
            psmt.setString(2, bccn.getTHANG());
            psmt.setInt(3, bccn.getNODAU());
            psmt.setInt(4, bccn.getPHATSINH());

            
            return psmt.executeUpdate()>0;
        }
    }
    }

    /**
     *
     * @param MABCCN
     * @return
     * @throws Exception
     */
    public boolean delete (int MABCCN) throws Exception
    {
        String sql="delete from BAOCAOCONGNO where MABCCN = ?  ";
            try(Connection ketNoi=CSDL.getKetNoi()){
                PreparedStatement psmt = ketNoi.prepareStatement(sql);
            {
            psmt.setInt(1, MABCCN);
            
            
            return psmt.executeUpdate()>0;
        }
    }
    }
    
}
