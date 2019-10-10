package medium;

import medium.person.Person;
import java.util.ArrayList;
import java.util.List;

public abstract class Medium {
    protected List<Person> list = new ArrayList<>();
    protected void register(Person... people){
        for(Person v : people){
            if(!list.contains(v)){
                list.add(v);
                v.setMedium(this);
            }
        }
    };
    public void replay(String message,Person personFlag){
        for(Person person: list){
            if(!personFlag.equals(person)){
                person.message(message);
            }
        }

    };

}
