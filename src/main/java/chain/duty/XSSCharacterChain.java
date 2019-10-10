package chain.duty;

public class XSSCharacterChain extends AbstractFilterChain {
    @Override
    public boolean handleRequest() {
        System.out.println("以过滤xss");
        if(null == getNext()){
            return true;
        }
        return getNext().handleRequest();
    }
}
