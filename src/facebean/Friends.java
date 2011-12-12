/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facebean;

import java.io.RandomAccessFile;

/**
 *
 * @author Wilmer Tabora
 */
public class Friends {

    RandomAccessFile fri= null;

    public Friends(String path){
         try{
        fri=new RandomAccessFile(path, "rw");
        } catch( Exception err){
            System.out.println("Error : " + err.getMessage());
        }
    }
}
