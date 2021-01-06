

public class Node<E> {

    private E value;
    private Node<E> nextNode;

    public Node(E value){
        this.value = value;
    }

    public Node(E value, Node<E> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }


}