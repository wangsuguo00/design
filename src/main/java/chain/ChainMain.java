package chain;

import chain.duty.AbstractFilterChain;
import chain.duty.CharecterFilterChain;
import chain.duty.XSSCharacterChain;

public class ChainMain {
    public static void main(String[] args) {
        AbstractFilterChain character = new CharecterFilterChain();
        AbstractFilterChain xss = new XSSCharacterChain();

        character.setNext(xss);

        character.handleRequest();

    }
}
