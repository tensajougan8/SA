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
public class TheStatePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
		Context c = new Context();

		c.setState(new On());
		c.toggle();
		c.toggle();
		c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
                c.toggle();
    }
    
}
