/**
 * The Originator represents the object that has an internal state to be saved.
 */
public class Originator
{
    private String state;
    
    public void set(String state)
    { 
        System.out.println("Set new state to " + state + ".");
        this.state = state; 
    }
    
    /**
     * The Originator creates a Memento and copies its state into this Memento,
     * which will be passed to the Caretaker to hold on to.
     */
    public Memento saveToMemento()
    { 
        System.out.println("Saved " + state + " to Memento.");
        return new Memento(state); 
    }
    
    /**
     * Given a past Memento from the Caretaker, the Originator reinstates itself. 
     */
    public void restoreFromMemento(Memento m)
    {
        state = m.getSavedState(); 
        System.out.println("Restored Memento " + state + ".");
    }
    
    public void printState()
    {
        System.out.println("Current state is " + state + ".");
    }
}
