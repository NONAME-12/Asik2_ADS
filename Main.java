import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        System.out.println(heap.peekMin());
        System.out.println(heap.extractMin());
        System.out.println(heap.extractMin());
        System.out.println(heap.size());
    }
    public static <T> void print(MyList<T> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}