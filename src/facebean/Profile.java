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
public class Profile {
    RandomAccessFile pro= null;


    public Profile (String path){
        try{
        pro=new RandomAccessFile(path, "rw");
        } catch( Exception err){
            System.out.println("Error : " + err.getMessage());
        }
    }
}
