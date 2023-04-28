/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessLayer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Cmb_Views {
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;
    public static java.sql.Connection con = CSDL.getKetNoi();
     public static void LoadData_MAPT (String sql,JComboBox cmb) {
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb.addItem(rs.getString(1));
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e ,"Thông báo lỗi",1);
        }
    }
     public static void LoadData_MAPN (String sql,JComboBox cmb) {
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb.addItem(rs.getString(1));
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e ,"Thông báo lỗi",1);
        }
    }
     public static void LoadData_MABCCN (String sql,JComboBox cmb) {
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb.addItem(rs.getString(1));
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e ,"Thông báo lỗi",1);
        }
    }
     public static void LoadData_MAPNT (String sql,JComboBox cmb) {
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb.addItem(rs.getString(1));
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e ,"Thông báo lỗi",1);
        }
    }
     public static void LoadData_MAPTB (String sql,JComboBox cmb) {
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb.addItem(rs.getString(1));
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e ,"Thông báo lỗi",1);
        }
    }
}
