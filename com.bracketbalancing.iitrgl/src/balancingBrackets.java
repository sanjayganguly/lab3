import java.util.*;

public class balancingBrackets {
    static boolean areBracketsBalanced (String str){
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < str.length(); i++){
            char s = str.charAt(i);
            if (s == '(' || s =='[' || s == '{') {
                stack.push(s);
                continue;
            }
            if (stack.isEmpty());
            return false;
            // checking of brackets
                char check;
                switch (s){
                    case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                        return false;
                    break;

                    case '}':
                        check = stack.pop();
                        if(check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stack.pop();
                        if(check == '(' || check == '{')
                            return false;
                        break;
                }
            }
            return (stack.isEmpty());
        }
        public static void main (String [] args) {
            String str = "([{}])";
            if (areBracketsBalanced(str))
                System.out.println("The entered String has Balanced Brackets");
            else System.out.println("The entered String do not contain Balanced Brackets");
        }
    }

