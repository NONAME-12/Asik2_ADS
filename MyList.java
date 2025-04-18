public interface MyList<T> extends Iterable<T> {
    // уже было:
    void add(T item);
    void add(int index, T item);
    int size();
    void remove(int index);
    void clear();
    T get(int index);

    //двусвязного списка
    void addFirst(T item);
    void addLast(T item);
    T getFirst();
    T getLast();
    void removeFirst();
    void removeLast();
}
