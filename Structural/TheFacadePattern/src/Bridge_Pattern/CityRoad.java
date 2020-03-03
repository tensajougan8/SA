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
  class CityRoad extends Road {
 
      public void DisplayMileage(){
          this.mileage = 7;
          
          System.out.println("The Mileage of City_Road is : " +mileage);
      }
              
}
