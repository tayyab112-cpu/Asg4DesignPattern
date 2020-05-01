/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Tayyab Raza
 */
public class Prototypetest {
      public static void main(String[] args) {
        cloneFactory F = new cloneFactory();
        Lion king= new Lion();
        Lion cloned = (Lion) F.getClone(king);
          System.out.println(cloned);
    }
    
}
