public class StackUsingArray {

    public static void push(int arr[], int top, int data) {
        if(top == arr.length - 1) {
            System.out.println("Stack Overflow");
        }
        else {
            top++;
            arr[top] = data;
        }
    }

    public static void pop(int arr[], int top) {
        if(top == -1) {
            System.out.println("Stack Underflow");
        }
        else {
            top--;
        }
    }

    public static void peek(int arr[], int top) {
        if(top == -1) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(arr[top]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        int top = -1;
        
        push(arr, top, 10);
        push(arr,top, 20);
        push(arr,top,30);

        peek(arr, top);
        pop(arr, top);
        
        peek(arr, top);
        pop(arr, top);
        
        peek(arr, top);
        pop(arr, top);
    }
}