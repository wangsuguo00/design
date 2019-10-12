package proxy.jdkproxy;

public class Person implements ProxyInterface{
    String name = "李白";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
