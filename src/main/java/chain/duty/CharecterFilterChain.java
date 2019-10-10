package chain.duty;

public class CharecterFilterChain extends AbstractFilterChain{

    @Override
    public boolean handleRequest() {
        System.out.println("字符集以设置为UTF-8");

        return getNext().handleRequest();
    }
}
