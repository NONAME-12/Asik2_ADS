import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int length;


    public MyLinkedList() {
        head = tail = null;
        length = 0;
    }
    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void add(int index, T item) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
        }
        if (index == 0) {
            addFirst(item);
            return;
        }
        if (index == length) {
            addLast(item);
            return;
        }

        MyNode<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        MyNode<T> node = new MyNode<>(item);
        node.prev = curr.prev;
        node.next = curr;
        curr.prev.next = node;
        curr.prev = node;
        length++;
    }


    @Override
    public int size() {
        return length;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == length - 1) {
            removeLast();
            return;
        }
        MyNode<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        length--;
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
        MyNode<T> node = new MyNode<>(item);
        node.next = head;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
        length++;
    }

    @Override
    public void addLast(T item) {
        MyNode<T> node = new MyNode<>(item);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        length++;
    }

    @Override
    public T getFirst() {
        if (head == null) throw new IndexOutOfBoundsException();
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) throw new IndexOutOfBoundsException();
        return tail.data;
    }

    @Override
    public void removeFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        length--;
    }

    @Override
    public void removeLast() {
        if (tail == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        length--;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}