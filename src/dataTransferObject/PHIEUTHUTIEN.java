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
public class PHIEUTHUTIEN {
    private String HOTENKH,SDT,DIACHI,EMAIL;
    private Date NGAYTHUTIEN;
    private int MAPT,SOTIENTHU;

    public int getSOTIENTHU() {
        return SOTIENTHU;
    }

    public void setSOTIENTHU(int SOTIENTHU) {
        this.SOTIENTHU = SOTIENTHU;
    }

    

    public void setNGAYTHUTIEN(Date NGAYTHUTIEN) {
        this.NGAYTHUTIEN = NGAYTHUTIEN;
    }

    public Date getNGAYTHUTIEN() {
        return NGAYTHUTIEN;
    }

    public PHIEUTHUTIEN() {
    }



    public int getMAPT() {
        return MAPT;
    }

    public void setMAPT(int MAPT) {
        this.MAPT = MAPT;
    }

    public String getHOTENKH() {
        return HOTENKH;
    }

    public void setHOTENKH(String HOTENKH) {
        this.HOTENKH = HOTENKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    
}
