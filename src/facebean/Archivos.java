/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facebean;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;


/**
 *
 * @author Wilmer Tabora
 */
public class Archivos {

     RandomAccessFile g=null;
     
     

    public Archivos (){
        try {
            g = new RandomAccessFile("gerencia.fbn", "rw");
          
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }


    }
}
