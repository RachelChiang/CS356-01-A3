/**
 * The Caretaker manages the Mementos for the Originator by acquiring and restoring
 * states. When implementing, the Caretaker is not meant to be able to do anything
 * except for saving and returning past states.
 */
import java.util.ArrayList;

/**
 * The Caretaker can acquire Mementos from the Originator by adding a memento to
 * the savedStates list with addMemento(Memento). It restores the state by returning
 * a previously passed state.
 */
public class Caretaker
{
    private ArrayList<Memento> savedStates = new ArrayList<Memento>();
    
    public void addMemento(Memento m)
    {
        savedStates.add(m);
    }
    
    public Memento getMemento(int index)
    {
        return savedStates.get(index);
    }
}
