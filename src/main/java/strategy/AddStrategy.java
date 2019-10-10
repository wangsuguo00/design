package strategy;

public class AddStrategy implements Strategy {
    @Override
    public int method(int a, int b) {

        return a+b;
    }
}
