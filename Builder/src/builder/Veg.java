/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author student
 */
public class Veg extends Builder{
    
    RicePlate vrp =null;
    public RicePlate getRicePlate() {
        return vrp;
    }

    public void createNewRicePlate() {
        vrp=new RicePlate();
    }

    public void makeDishes() {
        vrp.setDishes("Basmati Rice","Coconut Curry","Dal","Papad","Brinjal Raita","Potato Bhaji");
    }

    public void makeDessert() {
       vrp.setDessert("Fruit ");
    }

    public void makeDrink() {
       vrp.setDrink("Sweet Lime Juice ");
    }
}
