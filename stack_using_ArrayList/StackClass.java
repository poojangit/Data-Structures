
import java.util.List;

public class StackClass {

    class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
           return list.size() == 0;
        }
    }

}
public static void main(String[] args) {
    Stack s = new Stack()
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()) {
        System.out.println(s.peek())
        s.pop();
    }
}