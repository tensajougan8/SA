/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Waiter {
   
     Builder rpb = null;
    public void setRicePlateBuilder(){
        System.out.println(" Choose d Rice Plate 1: Veg || 2: Non Veg");
        Scanner in = new Scanner(System.in);
        int ch =in.nextInt();
        
        switch(ch){
            case 1: {
                System.out.println("Veg");
                rpb = new Veg();
                break;
            }
            case 2:{
                System.out.println("Non Veg");
                rpb = new NonVeg();
                break;
            }
            default:{
                System.out.println("Invalid");
               
            }
        }
    }
    
    public RicePlate getRicePlate(){
        return rpb.getRicePlate();
    }
    
    public void constructRicePlate(){
        rpb.createNewRicePlate();
        rpb.makeDishes();
        rpb.makeDessert();
        rpb.makeDrink();
    }
}
