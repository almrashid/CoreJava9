import java.util.Stack;

public class UseOfStack {

    public static void main(String[] args) {

        Stack <String> stack=new Stack<>();
        stack.push("NY");
        stack.push("FL");
       // System.out.println(  stack.peek());
        //System.out.println(stack.pop());
        while (stack.size()!=0){ //!stack.empty
            System.out.println(stack.pop());
        }

    }


}
