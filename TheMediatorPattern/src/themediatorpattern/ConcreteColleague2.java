/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themediatorpattern;

/**
 *
 * @author Student
 */
public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator m, String name) {
        super(m, name);
    }

    @Override
    public void send(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
