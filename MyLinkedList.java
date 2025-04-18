import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }
    @Override
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if(head == null){
            head = newNode;
        }
        else {
            MyNode<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}