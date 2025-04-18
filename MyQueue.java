public class MyQueue<T> {
    private MyList<T> list = new MyLinkedList<>();

    public MyQueue() { }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        T value = list.getFirst();
        list.removeFirst();
        return value;
    }

    public T peek() {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
