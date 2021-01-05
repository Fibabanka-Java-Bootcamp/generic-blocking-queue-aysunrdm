package Queue;

public interface Queue<E> {

    void add(E value);

    E peek();

    E poll();


}