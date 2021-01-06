

public class GenericBlockingQueue<E> implements Queue<E> {

    private Node<E> firsElement, lastElement;

    @Override
    public void add(E value) {

        Node<E> pointer = new Node<E>(value);

        if (firsElement == null) {
            firsElement = pointer;
            lastElement = pointer;

        } else {
            lastElement.setNextNode(pointer);
            lastElement = pointer;

        }}


    @Override
    public E peek() {

        if (firsElement != null) {
            return firsElement.getValue();
        } else {
            return null;
        }
        //Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz. Kuyruk boşsa eğer, null verir.
    }


    @Override
    public E poll() {
        E value = null;

        if(firsElement != null){
            Node<E> pointer = firsElement;
            firsElement = firsElement.getNextNode();
            value = pointer.getValue();
        }
        return value;
    }

    //Kuyruğun başındaki öğeyi verir ve onu kuyruktan atar. Kuyruk boşsa, null verir.
}