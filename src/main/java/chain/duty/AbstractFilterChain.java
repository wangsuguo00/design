package chain.duty;

public abstract class AbstractFilterChain {
    private AbstractFilterChain next;

    public void setNext(AbstractFilterChain next){
        this.next = next;
    }

    public AbstractFilterChain getNext(){
        return next;
    }

    public abstract boolean handleRequest();
}
