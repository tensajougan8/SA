/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author MScIT17
 */
public abstract class Car implements Cloneable {
    public abstract String ReturnCar(); 
    
    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
