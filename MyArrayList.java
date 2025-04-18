import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private Object[] elements;
    private int lenght;

    public MyArrayList() {
        elements = new Object[5];
        lenght = 0;
    }

    public void add(T item){
        if(lenght == elements.length){
            increaseBuffer();
        }
        elements[lenght++] = item; //upcasting
    }

    @Override
    public void add(int index, T item) {

    }

    private void increaseBuffer() {
        Object[] newElements = new Object[lenght*2];
        for(int i = 0; i < elements.length; i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public int size(){
        return lenght;
    }

    public T get(int index){
        checkIndex(index);
        return (T) elements[index];  //downcasting
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

    private void checkIndex(int index) {
        if(index < 0 || index >= lenght){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + lenght);
        }
    }

    public void clear(){
        elements = new Object[5];
        lenght = 0;
    }

    public void remove(int index){
        checkIndex(index);
        for(int i = index; i < lenght - 1; i++){
            elements[i] = elements[i+1];
        }
        lenght--;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}