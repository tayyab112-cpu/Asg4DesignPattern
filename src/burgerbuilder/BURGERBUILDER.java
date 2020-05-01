/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgerbuilder;

/**
 *
 * @author Tayyab Raza
 */
public class BURGERBUILDER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BURGER bb = new BURGER("Zinger","5");
        BURGER b = new BURGER.BurgerBuilder("Beef").Egg(true).Ketchup(true).Quantity("5").Build();
    }
    
}
