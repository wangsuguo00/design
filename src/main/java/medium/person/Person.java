package medium.person;

import medium.Medium;

public abstract class Person {
    Medium medium;
    public void setMedium(Medium medium){
        this.medium = medium;
    }
    public abstract void contact(String message);
    public abstract void message(String message);
}
