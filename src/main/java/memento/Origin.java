package memento;

import memento.bo.Memento;

public class Origin {
    public static void main(String[] args) {
        MementoManager mementoManager = new MementoManager();

        Memento memento = mementoManager.createMemento();

        memento.setStatus("ss");

    }
}
