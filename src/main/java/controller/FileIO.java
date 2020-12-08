/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Quang Vinh
 */
public class FileIO {
    public static void readFile(ArrayList listObj, String file){
        try {
            ObjectInputStream outfile=new ObjectInputStream(new FileInputStream(file));
            Object obj=null;
            while((obj=outfile.readObject())!=null)
            {
                Object o=(Object) obj;
                listObj.add(o);
            }
            outfile.close();
        } catch (IOException |ClassNotFoundException e) {
        }
    }
    public static void writeFile(ArrayList listObj, String file){
        try {
            ObjectOutputStream outfile=new ObjectOutputStream(new FileOutputStream(file));
            for(Object o:listObj)
            {
                outfile.writeObject(o);
            }
            outfile.close();
        } catch (IOException  e) {
        }
    }
}
