/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity;

/**
 *
 * @author Student
 */
public class Institutional extends Plans {

    @Override
    public double generatebill(double a) {
        return 5.50 * a;
    }
    
}
