// Mateus Silva Aragao
// 02/24/21
public class ShoppingList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int numItem;

    static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    public boolean isEmpty() {
        return numItem == 0;
    }

    //    1. Constructor() ----------------------
    public ShoppingList() {
        this.head = null;
        this.tail = null;
        this.numItem = 0;
//   Default constructor.
    }

    // 2. Add() function --------------
    public void add(E item) {
        Node<E> added = new Node<>(item, null);
        if (isEmpty())
            head = added;
        else
            tail.setNext(added);
        tail = added;
        numItem++;
    }

    //    3. Remove() function--------------
    public void remove(String item) {
        Node currentNode = head;
        boolean found = false;
        Node preveiousNode = head;
        if (!isEmpty()) {
            for (int i = 0; i < numItem; i++) {
                if (currentNode.element == item) {
                    if (currentNode == head) {
                        head = currentNode.next;
                    } else {
                        preveiousNode.next = currentNode.next;
                        if (currentNode == tail)
                            tail = preveiousNode;
                    }
                    found = true;
                    numItem--;
                    break;
                }
                preveiousNode = currentNode;
                currentNode = currentNode.next;
            }
            if (!found)
                System.out.println("The item " + item + " is not in the list");
        }
    }

    // 4. print() funtion --------------
    public void print() {
        Node n = head;
        while (n != null) {
            System.out.println(n.element + " ");
            n = n.next;
        }
    }

    //  5. numItem() funtction ---------------
    public int numItem() {
        return numItem;
    }
}