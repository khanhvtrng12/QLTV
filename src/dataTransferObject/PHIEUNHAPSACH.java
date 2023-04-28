/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTransferObject;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class PHIEUNHAPSACH {
    private int MAPN,SL;
    private String TENSACH,THELOAI,TACGIA;
    private Date NGAYNHAP;
    

    public PHIEUNHAPSACH() {
    }

    public Date getNGAYNHAP() {
        return NGAYNHAP;
    }

    public void setNGAYNHAP(Date NGAYNHAP) {
        this.NGAYNHAP = NGAYNHAP;
    }
    public int getMAPN() {
        return MAPN;
    }

    public void setMAPN(int MAPN) {
        this.MAPN = MAPN;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public String getTENSACH() {
        return TENSACH;
    }

    public void setTENSACH(String TENSACH) {
        this.TENSACH = TENSACH;
    }

    public String getTHELOAI() {
        return THELOAI;
    }

    public void setTHELOAI(String THELOAI) {
        this.THELOAI = THELOAI;
    }

    public String getTACGIA() {
        return TACGIA;
    }

    public void setTACGIA(String TACGIA) {
        this.TACGIA = TACGIA;
    }
    
    
}
