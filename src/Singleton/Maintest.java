/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Tayyab Raza
 */
public class Maintest {
     public static void main(String[] args) {
        singleton single = singleton.getInstance();
        single.getMusic().setMusic("don");
 
    }
    
}
