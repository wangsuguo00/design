package medium.person;

public class HouseOwner extends Person {

    @Override
    public void contact(String message) {
        medium.replay(message,this);
    }

    @Override
    public void message(String message) {
        System.out.println("房主收到："+message);
    }

}
