/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thestatepattern;

/**
 *
 * @author Student
 */
public abstract class State {
    
    public String stateName;
    public abstract void doAction(Context c);
     
}
