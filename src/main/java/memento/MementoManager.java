package memento;

import memento.bo.Memento;

public class MementoManager {
    private Memento memento;
    public Memento createMemento(){
        return new Memento();
    }
    public void store(Memento memento){
        this.memento = memento;
    }

    public Memento restore(){
        return memento;
    }
}
