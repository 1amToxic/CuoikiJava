/*v
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btc.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lamit
 */
public class IOFile {
    public static<T> void ghivaoFile(List<T> list,String pathFile){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathFile));
            oos.writeObject(list);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static<T> List<T> doctuFile(String pathFile){
        List<T> list = new ArrayList<T>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathFile));
            list = (List<T>) ois.readObject();
        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        }
        return list;
    }
}
