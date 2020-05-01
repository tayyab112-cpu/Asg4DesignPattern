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

// I used Builder Design pattern in Burger class as for customer convenience
// because most of customer does not like to have an edd or ketcup in their burgers

public class BURGER {

private String burger;
private boolean egg;
private boolean ketchup;
private String quantity;

    public BURGER(String burger, String quantity) {
        this.burger = burger;
        this.quantity = quantity;
    }
private BURGER(BurgerBuilder builder)  // In this constructor BURGER is taking object from BurgerBuilder
        // and then assigned to BURGER class
{
   this.burger=builder.burger;
   this.egg=builder.egg;
   this.ketchup=builder.ketchup;
   this.quantity=builder.quantity;
}
public static class BurgerBuilder  // this is Builder class where design pattern implemented
{
private String burger;
private boolean egg;
private boolean ketchup;
private String quantity;

        public BurgerBuilder(String burger)
        {
           this.burger=burger;
        }
        public BurgerBuilder Egg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder Ketchup(boolean ketchup) {
            this.ketchup = ketchup;
            return this;
        }

        public BurgerBuilder Quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
 
        public BURGER Build()
        {
            System.out.println(this.burger+ " burger is created");
            return new BURGER(this);
        }
     
    }
}
