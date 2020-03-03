package themediatorpattern;

/**
 *
 * @author Student
 */
public abstract class Colleague {
    
    private String name;
    
    Colleague(Mediator m, String name){
        m.send(name, this);
    }
    
    public abstract void send(String msg);
    public void notify(String msg){
        
    }
    
}
