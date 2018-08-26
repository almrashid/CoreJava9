import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseQueue {

    public static void main(String[] args) {

        Queue<String> q=new LinkedList<>();
        ((LinkedList<String>) q).add("NY");
        ((LinkedList<String>) q).add("NJ");
        Iterator it=q.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
