import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> lst = new MyLinkedList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.remove(1);
        System.out.println(lst.get(0)+" "+lst.get(1)); // должно вывести "10 30"

    }
    public static <T> void print(MyList<T> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}