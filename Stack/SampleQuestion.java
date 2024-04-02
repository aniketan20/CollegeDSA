/*
 * abaccada
 * 
 * abaada
 * 
 * abda
 */

import java.util.*;

public class SampleQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(stack.peek() == ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        
        StringBuilder res = new StringBuilder();
        for(Character ch : stack){
            res.insert(0,ch);
        }
        System.out.println(res);
    }
}
