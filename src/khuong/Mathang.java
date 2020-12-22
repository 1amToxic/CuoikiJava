/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khuong;

import java.io.Serializable;

/**
 *
 * @author lamit
 */
public class Mathang implements Serializable{
    private int maMH;
    private String tenMH;
    private String nhom;
    private int gia;

    public Mathang(int maMH, String tenMH, String nhom, int gia) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhom = nhom;
        this.gia = gia;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    public Object[] toObjects(){
        return new Object[]{maMH,tenMH,nhom,gia};
    }
}
