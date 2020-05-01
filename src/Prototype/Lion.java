/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tayyab Raza
 */
// This is line class which implements Animal 
// makecopy function call super clone in try catch block in case of exception
public class Lion implements Animal{

    public Lion() {        
    }

    
    @Override
    public Animal makeCopy() {
        
        Lion l= new Lion();
        try {
            l=(Lion)super.clone();
            System.out.println(l);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Lion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
    
}
