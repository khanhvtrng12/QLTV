/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTransferObject;

/**
 *
 * @author Admin
 */
public class DANHSACHSACH {
    private String TENSACH,THELOAI,TACGIA;
    private int MASACH,SL;

    public DANHSACHSACH() {
    }

    public int getMASACH() {
        return MASACH;
    }

    public void setMASACH(int MASACH) {
        this.MASACH = MASACH;
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

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }
    
    
}
