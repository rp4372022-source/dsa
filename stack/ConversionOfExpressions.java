package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConversionOfExpressions{
    private int getPrecedence(char a){
        return switch (a) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }
    public String toPrefix(String infix){
        Deque<Character> stack = new ArrayDeque<>();

        StringBuilder prefix = new StringBuilder();
        
        //instead of reversing we are starting from end
        for(int i=infix.length()-1;i>=0;i--){
            if(infix.charAt(i) == '('){
                while(!stack.isEmpty() && stack.peek() != ')'){
                    prefix.append(stack.pop());
                }
                if(!stack.isEmpty()) stack.pop();//removing the '(' bracket
            }
            else if(")+-*/^".indexOf(infix.charAt(i) ) >= 0){
                while(!stack.isEmpty() && getPrecedence(infix.charAt(i)) < getPrecedence(stack.peek())){
                    prefix.append(stack.pop());
                }
                stack.push(infix.charAt(i));
            } else {
                prefix.append(infix.charAt(i));
            }
        }

        // after ending of expression adding remaining elements
        while(!stack.isEmpty()){
            prefix.append(stack.pop());
        }

        return prefix.reverse().toString();
    }
}