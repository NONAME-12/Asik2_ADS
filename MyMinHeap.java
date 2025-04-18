public class MyMinHeap<T extends Comparable<T>> {
    private MyList<T> list;

    public MyMinHeap() {
        list = new MyArrayList<>();
    }

    // Вставка нового элемента
    public void insert(T item) {
        list.addLast(item);
        siftUp(list.size() - 1);
    }

    // Получить и удалить минимальный
    public T extractMin() {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        T min = list.get(0);
        T last = list.get(list.size() - 1);
        list.removeLast();
        if (list.size() > 0) {
            list.set(0, last);
            siftDown(0);
        }
        return min;
    }

    // Просто посмотреть минимальный
    public T peekMin() {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        return list.get(0);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    // Просеивание вверх: новый элемент может быть меньше предка
    private void siftUp(int idx) {
        while (idx > 0) {
            int parent = (idx - 1) / 2;
            if (list.get(idx).compareTo(list.get(parent)) < 0) {
                swap(idx, parent);
                idx = parent;
            } else break;
        }
    }

    // Просеивание вниз: корень может быть больше детей
    private void siftDown(int idx) {
        int size = list.size();
        while (true) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int smallest = idx;
            if (left < size && list.get(left).compareTo(list.get(smallest)) < 0) {
                smallest = left;
            }
            if (right < size && list.get(right).compareTo(list.get(smallest)) < 0) {
                smallest = right;
            }
            if (smallest != idx) {
                swap(idx, smallest);
                idx = smallest;
            } else break;
        }
    }

    // Обмен элементов в массиве
    private void swap(int i, int j) {
        T tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
}
