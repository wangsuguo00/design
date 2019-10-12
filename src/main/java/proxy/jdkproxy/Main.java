package proxy.jdkproxy;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        JdkProxy<Person> jdkProxy = new JdkProxy(person);
        ProxyInterface proxyInterface =  jdkProxy.getProxy();
        proxyInterface.getName();
    }
}
