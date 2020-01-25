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
public class NonVeg extends Builder{
     RicePlate nrp = null;
    public RicePlate getRicePlate() {
        return nrp;
    }

    public void createNewRicePlate() {
        nrp = new RicePlate();
    }

    public void makeDishes() {
        nrp.setDishes("Basmati Rice", "Prawn Curry", "Fried Kingfish", "Butter Chicken"," Prawn Vindaloo"," Fried Oysters");
    }

    public void makeDessert() {
        nrp.setDessert(" Fruit");
    }

    public void makeDrink() {
        nrp.setDrink(" Sweet Lime Juice");
    }
    
}
