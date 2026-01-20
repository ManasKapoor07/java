
import java.util.Stack;

public class StackSort {

    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 5, 9};
        Stack<Integer> st = new Stack<>();

        for (int value : arr) {
            st.push(value);
        }

        sortStack(st);
        System.out.println(st);

    }

    public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int temp = st.pop();

        sortStack(st);


        insertAtRghtPlace(st , temp);
    }

    public static void insertAtRghtPlace(Stack<Integer> st , int a) {
        if (st.isEmpty() || st.peek() <= a) {
            st.push(a);
            return;
        }
        
        int temp = st.pop();
        
        insertAtRghtPlace(st, a);

        st.push(temp);
    }


}
