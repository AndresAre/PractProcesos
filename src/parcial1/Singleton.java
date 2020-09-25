/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.io.File;

/**
 *
 * @author Asus
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
   
    }
    
    public static File getInstance(){
       File archivo = null;
       if(instance==null){
           archivo=new File("C:\\practica\\archivo.txt");
       }
       return archivo;
    }

}