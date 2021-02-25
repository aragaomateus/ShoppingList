import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args){
        ShoppingList lista = new ShoppingList();

        lista.add("banana");
        lista.add("laranja");
        lista.add("Ata");
        lista.add("manga");
        lista.print();
        lista.remove("Ata");
        lista.print();









    }
}
