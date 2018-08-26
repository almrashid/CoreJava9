import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseOfLinkedList {

    public static void main(String[] args) {

        List<Integer> l=new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(222);
        Iterator it=l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Integer i:l) {
            System.out.println(i);
        }
    }
}
