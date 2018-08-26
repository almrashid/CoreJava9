import java.util.*;

public class UseOfLiinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("PA");
        list.add("NJ");
        list.add("AR");

        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println("----------------------");

        for (Object st:list) {
            System.out.println(st);

        }



    }
}
