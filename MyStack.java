public class MyStack<T> {
    private MyList<T> list = new MyLinkedList<>();
    public MyStack() { }

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        T value = list.getFirst();
        list.removeFirst();
        return value;
    }

    public T peek() {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
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
