package observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumNo numNo = new NumChange();

        Observer up = new UpObserver();
        Observer down = new DownObserver();

        numNo.add(up,down);

        numNo.change();
    }
}
