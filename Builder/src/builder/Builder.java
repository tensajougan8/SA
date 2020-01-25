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
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Waiter w = new Waiter();
        w.setRicePlateBuilder();
        w.constructRicePlate();
        
        RicePlate rp=w.getRicePlate();
        rp.display();
    }
    
}
