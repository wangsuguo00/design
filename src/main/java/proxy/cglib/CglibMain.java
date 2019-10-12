package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibMain {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(new CglibIntercepter());
        Person o = (Person) enhancer.create();
        System.out.println(o.getName());
    }
}
