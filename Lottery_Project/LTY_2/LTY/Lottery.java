package LTY;

import java.util.Collections;
import java.util.Stack;

public class Lottery {
    Stack<Card> DeskOfCards;
    
    public Lottery() {
        DeskOfCards = new Stack<Card>();
        addCards();
        Suffle();
        Show();
        Distribute();
    }
    
    private void Distribute() {
        //While(nobody has won)
        //int counter;
        while(!DeskOfCards.isEmpty()) {
            System.out.println("Card given: " + DeskOfCards.pop());
        }
    }
    
    private void Show() {
        for(Card c : DeskOfCards) {
            System.out.println(c.toString());
        }
    }
    
    private void addCards() {
        DeskOfCards.add(new Card("Corazon"));
        DeskOfCards.add(new Card("El Valiente"));
        DeskOfCards.add(new Card("La Muerte"));
        DeskOfCards.add(new Card("La Chalupa"));
        DeskOfCards.add(new Card("El Cantarito"));
        DeskOfCards.add(new Card("La araña"));
        DeskOfCards.add(new Card("El Pajaro"));
        DeskOfCards.add(new Card("El Cotorro"));
        DeskOfCards.add(new Card("La escalera"));
        DeskOfCards.add(new Card("El borracho"));
        DeskOfCards.add(new Card("La mano"));
        DeskOfCards.add(new Card("El catril"));
    }
    
    private void Suffle() {
        Collections.shuffle(DeskOfCards);
    }
    
    
}
