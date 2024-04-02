import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        HashMap<Character,Character> table = new HashMap<>();
        table.put(')','(');
        table.put(']','[');
        table.put('}','{');
        
        Stack<Character> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        for(char ch : str.toCharArray()){
            if(table.containsKey(ch)){
                if(!stack.isEmpty() && table.get(ch) == stack.peek()){
                    stack.pop();
                }
                else{
                    System.out.println(false);
                    return;
                }
            }
            else{
                stack.push(ch);
            }
        }
        
        System.out.println(stack.isEmpty());
    }
}
