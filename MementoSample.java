
public class MementoSample
{
    public static void main(String[] args)
    {
        Caretaker caretaker = new Caretaker();
        
        Originator originator = new Originator();
        originator.set("STATE 1");
        originator.set("STATE 2");
        // save state 2 (index is 0)
        caretaker.addMemento(originator.saveToMemento());
        
        originator.set("STATE 3");
        // save state 3 (index is 1)
        caretaker.addMemento(originator.saveToMemento());
        
        originator.set("STATE 4");
        // save state 4 (index is 2)
        caretaker.addMemento(originator.saveToMemento());
        
        // print current state
        originator.printState();
        System.out.println();
        
        // restore memento of index 1 (state 3) from the caretaker arraylist
        originator.restoreFromMemento(caretaker.getMemento(1));
        // note it is indeed state 3
        originator.printState();
        
        // we can restore another one
        originator.restoreFromMemento(caretaker.getMemento(2));
        originator.printState();
        
        // and again
        originator.restoreFromMemento(caretaker.getMemento(0));
        originator.printState();
    }
}