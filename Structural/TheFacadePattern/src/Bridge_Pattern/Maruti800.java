/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge_Pattern;

/**
 *
 * @author Student
 */
 public class Maruti800 extends MarutiCar{

    
    @Override
    public void DisplayMileage() {
         
        CityRoad c = new CityRoad();
        Highway h = new Highway();
        
        
        this.NoOfSeats =5;
        this.Year=2000;
        
        System.out.println("no of seats:" +NoOfSeats);
        
        System.out.println("year:" +Year);
        
        c.DisplayMileage();
        
        h.DisplayMileage();
    }

    
       
        
    

    
     
    
  
      
       
        
    }
     

