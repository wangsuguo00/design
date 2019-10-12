package lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMain {
    public static void main(String[] args) throws InterruptedException {
        LockMain lockMain = new LockMain();
        lockMain.speek();
    }
    ReentrantLock lock = new ReentrantLock();
    Condition cond = lock.newCondition();
    public void speek() throws InterruptedException {
        lock.lock();

        Thread.sleep(1000);
        System.out.println("我想变说话边吃");
        System.out.println("获得锁数"+lock.getHoldCount());
        eat();
        lock.unlock();
        System.out.println("持有锁"+lock.getHoldCount());

    }

    public void eat() throws InterruptedException {
        lock.lock();
        Thread.sleep(1000);
        System.out.println("我正在边说话边吃");
        System.out.println("获得锁数"+lock.getHoldCount());
        lock.unlock();
        System.out.println("持有锁"+lock.getHoldCount());
    }
}
