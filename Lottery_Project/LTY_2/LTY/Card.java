package LTY;

public class Card { //Tarjeta
    private String name;
    
    public Card(String name) {
        this.name = name;
    }
    
    public Card() {
        this("");
    }

    @Override
    public String toString() {
        return "Card -> " + name;
    }
    
    
}
