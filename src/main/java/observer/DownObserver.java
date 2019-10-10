package observer;

public class DownObserver implements Observer {
    @Override
    public void flagChange(int flag) {
        if(flag>5){
            System.out.println("下跌观察者"+"超过5");
        }else{
            System.out.println("下跌观察者"+"低于5");
        }
    }

}
