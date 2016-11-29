/**
 * The Memento stores the Originator's internal state.
 */
public class Memento
{
    /**
     * In this case, for the sake of simplicity, we use a String to represent the
     * state. However, in practice, saving a state often requires making a copy
     * of the Originator's state.
     */
    private String state;
    
    public Memento(String stateToSave)
    {
        state = stateToSave;
    }
    
    public String getSavedState()
    {
        return state;
    }
}
