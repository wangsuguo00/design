package algorithm;

import algorithm.proxy.ProxyHandler;
import algorithm.sort.*;

public class SortTest {
    public static void main(String[] args) {
        ProxyHandler proxyHandler = new ProxyHandler(new ShellSort());
        proxyHandler.sort();
    }

}
