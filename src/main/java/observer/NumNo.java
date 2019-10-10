package observer;

import java.util.ArrayList;
import java.util.List;

public abstract  class NumNo {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer... observer){
        for(Observer s : observer){
            observers.add(s);
        }
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void change() throws InterruptedException;
}
