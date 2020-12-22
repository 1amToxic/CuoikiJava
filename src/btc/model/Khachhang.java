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
public class Khachhang implements Serializable{
    private int maKH;
    private String hoten;
    private String diachi;
    private String soDT;

    public Khachhang(int maKH, String hoten, String diachi, String soDT) {
        this.maKH = maKH;
        this.hoten = hoten;
        this.diachi = diachi;
        this.soDT = soDT;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    public Object[] toObjects(){
        return new Object[]{maKH,hoten,diachi,soDT};
    }
}
