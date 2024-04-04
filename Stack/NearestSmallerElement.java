import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestSmallerElement {
    public static void main(String[] args) {
        int arr[] = new int[]{7,3,8,4,13,7,14};
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {
            while(!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                list.add(-1);
            }
            else {
                list.add(stack.peek());
            }
            stack.push(arr[i]);
        }

        Collections.reverse(list);

        System.out.println(list);
    }
}
