package strategy;

public class JianStrategy implements Strategy {
    @Override
    public int method(int a, int b) {
        return a-b;
    }
}
