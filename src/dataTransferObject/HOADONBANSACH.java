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
public class HOADONBANSACH {
    
    private int MAHD,MAPT,MABCCN,SL,DONGIA,MAPN;
    private Date NGAYLAPHOADON; 
    
    public HOADONBANSACH(int MAHD,int MAPT,int MAPN,int MABCCN,int SL,int DONGIA,Date NGAYLAPHOADON) {
        this.MAHD = MAHD;
        this.MAPT = MAPT;
        this.MAPN = MAPN;
        this.MABCCN = MABCCN;
        this.SL = SL;
        this.DONGIA = DONGIA;
        this.NGAYLAPHOADON = NGAYLAPHOADON;
    }

    public int getMAPN() {
        return MAPN;
    }

    public void setMAPN(int MAPN) {
        this.MAPN = MAPN;
    }
    
    public void setNGAYLAPHOADON(Date NGAYLAPHOADON) {
        this.NGAYLAPHOADON = NGAYLAPHOADON;
    }

    public Date getNGAYLAPHOADON() {
        return NGAYLAPHOADON;
    }
    public HOADONBANSACH() {
    }

    public int getMAHD() {
        return MAHD;
    }

    public void setMAHD(int MAHD) {
        this.MAHD = MAHD;
    }

    public int getMAPT() {
        return MAPT;
    }

    public void setMAPT(int MAPT) {
        this.MAPT = MAPT;
    }

    public int getMABCCN() {
        return MABCCN;
    }

    public void setMABCCN(int MABCCN) {
        this.MABCCN = MABCCN;
    }
    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public int getDONGIA() {
        return DONGIA;
    }

    public void setDONGIA(int DONGIA) {
        this.DONGIA = DONGIA;
    }
    
    
}
