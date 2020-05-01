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
// it is an interface in which makeCopy function is and this interface is extended by Cloneable so it make clones
public interface Animal extends Cloneable{
    public Animal makeCopy();
    
}
