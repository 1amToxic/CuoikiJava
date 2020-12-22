/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khuong;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lamit
 */
public class IOFile {
    static String pathMathang = "MH.DAT";
    public static void ghiFile(ArrayList<Mathang> listMH){
        try {
            FileOutputStream fos = new FileOutputStream(pathMathang);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    public static ArrayList<Mathang> docFile(){
        ArrayList<Mathang> listMH = new ArrayList<>();
        try {
            FileInputStream fis= new FileInputStream(pathMathang);
            ObjectInputStream oos = new ObjectInputStream(fis);
            Object o;
            while((o = oos.readObject())!=null){
                Mathang mh = (Mathang) o;
                listMH.add(mh);
            }
            oos.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
        return listMH;
    }
}
