package observer;

public class UpObserver implements Observer {

    @Override
    public void flagChange(int flag) {
        if(flag>5){
            System.out.println("上涨观察者"+"超过5");
        }else{
            System.out.println("上涨观察者"+"低于5");
        }
    }
}
