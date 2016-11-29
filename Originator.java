
public class Originator
{
    private String state;
    
    public void set(String state)
    { 
        System.out.println("Set new state to " + state + ".");
        this.state = state; 
    }
    
    public void printState()
    {
        System.out.println("Current state is " + state + ".");
    }

    public Memento saveToMemento()
    { 
        System.out.println("Saved " + state + " to Memento.");
        return new Memento(state); 
    }
    
    public void restoreFromMemento(Memento m)
    {
        state = m.getSavedState(); 
        System.out.println("Restored Memento " + state + ".");
    }
}
