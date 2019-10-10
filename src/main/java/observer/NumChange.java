package observer;



public class NumChange extends NumNo {
    @Override
    public void change() throws InterruptedException {
        while(true){
            int flag = (int) (Math.random()*10+1);
            for(Observer observer : observers){
                    observer.flagChange(flag);
            }
            Thread.sleep(1000);
        }


    }
}
