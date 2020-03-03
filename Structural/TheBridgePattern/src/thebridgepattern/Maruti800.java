/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebridgepattern;

/**
 *
 * @author Student
 */
public class Maruti800 extends MarutiCar {
    
    Road road;
    
    public Maruti800(){       
        numberOfSeats = 4;
        year = 2019;
    }

    @Override
    public void displayMileage() {
        
        road = new CityRoad();
        road.displayMileage();
        road = new Highway();
        road.displayMileage();
        
    }
    
}
