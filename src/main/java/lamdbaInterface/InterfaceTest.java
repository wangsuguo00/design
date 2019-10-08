package lamdbaInterface;

public class InterfaceTest {
    public static void main(String[] args) {
        TestInterface testInterface= y -> {return  y;};

        System.out.println(testInterface.test("ss"));
    }
}
