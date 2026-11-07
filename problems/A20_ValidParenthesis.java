class Solution {
    public boolean isValid(String s) {
        if(s.length() <= 1) return false;
        
        class Stack{
            char[] stack;
            int top = -1;
            Stack(int length){stack = new char[length];}
            void push(char ele){
                stack[++top] = ele;
            }
            void pop(){
                top--;
            }
            char peek(){
                return stack[top];
            }
        }
        Stack stack = new Stack(s.length());

        for(int i=0;i<s.length();i++){
            char ele = s.charAt(i);
            if(ele == '(' 
                || s.charAt(i) == '[' 
                || s.charAt(i) == '{' )
            {
                stack.push(ele);
            }
            else if((stack.top != -1) &&
                (
                    (ele == '}' && stack.peek() == '{')
                    || (ele == ']' && stack.peek() == '[')
                    || (ele == ')' && stack.peek() == '(')
                )
            ){
                stack.pop();
            }
            else {
                return false;
            }
        }
        return (stack.top == -1) ? true : false;
    }
}