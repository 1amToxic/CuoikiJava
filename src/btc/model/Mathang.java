/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btc.model;

import java.io.Serializable;

/**
 *
 * @author lamit
 */
public class Mathang implements Serializable{
    private int maH;
    private String tenH;
    private String nhomH;
    private int gia;

    public Mathang(int maH, String tenH, String nhomH, int gia) {
        this.maH = maH;
        this.tenH = tenH;
        this.nhomH = nhomH;
        this.gia = gia;
    }
    
    public Mathang(String tenH, String nhomH, int gia) {
        this.tenH = tenH;
        this.nhomH = nhomH;
        this.gia = gia;
    }

    public int getMaH() {
        return maH;
    }

    public void setMaH(int maH) {
        this.maH = maH;
    }

    public String getTenH() {
        return tenH;
    }

    public void setTenH(String tenH) {
        this.tenH = tenH;
    }

    public String getNhomH() {
        return nhomH;
    }

    public void setNhomH(String nhomH) {
        this.nhomH = nhomH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    public Object[] toObjects(){
        return new Object[]{maH,tenH,nhomH,gia};
    }
}
