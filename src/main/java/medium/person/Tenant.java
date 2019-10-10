package medium.person;


public class Tenant extends Person {

    @Override
    public void contact(String message) {
        medium.replay(message,this);
    }

    @Override
    public void message(String message) {
        System.out.println("租房者收到："+message);
    }
}
