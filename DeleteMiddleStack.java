
import java.util.Stack;

public class DeleteMiddleStack {

    //Delete problems → push back
    // Reverse problems → push at bottom
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8};

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
        System.out.println(s);
        int n = s.size();
        System.out.println(s.peek());

        // deleteMiddle(s, n, 0);
        reverseStack(s);
        System.out.println(s);

    }

    public static void deleteMiddle(Stack<Integer> s, int n, int count) {
        if (count == n / 2) {
            s.pop();
            return;
        }

        int temp = s.pop();

        deleteMiddle(s, n, count + 1);

        //return aate time 
        s.push(temp);
    }

    public static void reverseStack(Stack<Integer> stack) {
        // write your code here
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        reverseStack(stack);

        //insert at bottom 
        insertAtBottom(stack, temp);

    }

    public static void insertAtBottom(Stack<Integer> stack, int a) {
        // write your code here
        if (stack.isEmpty()) {
            stack.push(a);
            return;
        }

        int temp = stack.pop();
        //insert at bottom 
        insertAtBottom(stack, a);

        stack.push(temp);

    }
}
