package strategy;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = new AddStrategy();
        System.out.println(strategy.method(1,2));

        strategy = new JianStrategy();
        System.out.println(strategy.method(2,1));
    }
}
