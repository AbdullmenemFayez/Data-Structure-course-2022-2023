
import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class EvaluatingExpression {

    public static void main(String[] args) {
        String s = "(19+4)+(4mod6 )+1/2+1*5";//example

        s = handleMyExp(s);
        System.out.println(s);
        System.out.println(is_valid(s));

        String post = inFixToPostFix(s);
        System.out.println(post);

        System.out.println(evaluatePostFix(post));
    }

    public static boolean is_valid(String expr) {
        boolean result = true;
        /*stores digits*/
        Stack<String> st1 = new Stack<>();
        /*stores operators and parantheses*/
        Stack<String> st2 = new Stack<>();
        boolean isTrue = true;
        String[] expression = expr.split(" ");
        for (int i = 0; i < expression.length; i++) {
            String temp = expression[i];
            /*if the character is a digit, we push it to st1*/
            if (isDigit(temp.charAt(0))) {
                st1.push(temp);
                if (isTrue) {
                    isTrue = false;
                } else {
                    return false;
                }
            } /*if the character is an operator, we push it to st2*/ else if (isOperator(temp.charAt(0))) {
                st2.push(temp);
                isTrue = true;
            } else {
                /*if the character is an opening parantheses we push it to st2*/
                if (isBracketOpen(temp.charAt(0))) {
                    st2.push(temp);
                } /*If it is a closing bracket*/ else {
                    boolean flag = true;
                    /*we keep on removing characters until we find the corresponding
                    open bracket or the stack becomes empty*/
                    while (!st2.isEmpty()) {
                        char c = (char) st2.pop().charAt(0);
                        if (c == getCorrespondingChar(temp.charAt(0))) {
                            flag = false;
                            break;
                        } else {
                            if (st1.size() < 2) {
                                return false;
                            } else {
                                st1.pop();
                            }
                        }
                    }
                    if (flag) {
                        return false;
                    }

                }
            }
        }
        while (!st2.isEmpty()) {
            char c = (char) st2.pop().charAt(0);
            if (!isOperator(c)) {
                return false;
            }
            if (st1.size() < 2) {
                return false;
            } else {
                st1.pop();
            }
        }
        if (st1.size() > 1 || !st2.isEmpty()) {
            return false;
        }
        return result;
    }

    /*method to get corresponding opening and closing bracket.*/
    public static char getCorrespondingChar(char c) {
        if (c == ')') {
            return '(';
        } else if (c == ']') {
            return '[';
        }
        return '{';
    }

    /*checks if the given bracket is open or not.*/
    public static boolean isBracketOpen(char c) {
        if (c == '(' || c == '[' || c == '{') {
            return true;
        }
        return false;
    }

    public static boolean isBracketClose(char c) {
        if (c == ')' || c == ']' || c == '}') {
            return true;
        }
        return false;
    }

    /*checks if the given character is a digit.*/
    private static boolean isDigit(char c) {
        return Character.isLetterOrDigit(c);
    }

    private static boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '%') {
            return true;
        }
        return false;
    }

    static int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':

                return 2;
            case '^':
                return 3;
            case '%':
                return 4;
            default:
                return -1;
        }

    }

    private static String inFixToPostFix(String ss) {

        String ret = "";

        Stack<Character> st = new Stack<>();

        String[] s = ss.split(" ");

        //   System.out.println(Arrays.toString(s));
        for (int i = 0; i < s.length; i++) {
            char temp = s[i].charAt(0);

            if (Character.isLetterOrDigit(temp)) {
                ret += s[i] + " ";
            } else if (isBracketOpen(temp)) {
                st.push(temp);
            } else if (isBracketClose(temp)) {
                while (!st.isEmpty() && st.peek() != getCorrespondingChar(temp)) {
                    ret += st.pop() + " ";
                }
                if (st.isEmpty()) {
                    return "Invalid Expression*";
                } else {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && prec(temp) <= prec(st.peek())) {
                    if (st.peek() == '(') {
                        return "invalid Expression**";
                    }
                    ret += st.pop() + " ";
                }
                st.push(temp);

            }
        }

        while (!st.isEmpty()) {
            if (st.peek() == '(') {
                return "invalid expression***";
            }
            ret += st.pop() + " ";
        }

        return ret;

    }

    static int evaluatePostFix(String s) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            //  System.out.println(st);

            char c = s.charAt(i);

            if (c == ' ') {
                continue;
            } else if (Character.isDigit(c)) {
                int n = 0;

                while (Character.isDigit(c)) {
                    n = n * 10 + (int) (c - '0');
                    i++;
                    c = s.charAt(i);
                }
                i--;
                st.push(n);
            } else if (isOperator(c)) {
                int v1 = st.pop();
                int v2 = st.pop();

                switch (c) {

                    case '+':
                        st.push(v2 + v1);
                        break;
                    case '-':
                        st.push(v2 - v1);
                        break;
                    case '*':
                        st.push(v2 * v1);
                        break;
                    case '/':
                        st.push(v2 / v1);
                        break;
                    case '^':
                        st.push((int) Math.pow(v2, v1));
                        break;
                    case '%':
                        st.push(v2 % v1);
                }
            }

        }

        return st.pop();
    }

    private static String handleMyExp(String s) {

        s = s.replaceAll(" ", "");
        s = s.replaceAll("[X,x]", "*");
        s = s.replaceAll("÷", "/");
        s = s.replaceAll("mod", "%");

        String ret = "";

        for (int i = 0; i < s.length(); ++i) {

            char c = s.charAt(i);

            if (isOperator(c)) {
                ret = ret + " " + c + " ";
            } else if (c == '(') {
                ret = ret + c + " ";
            } else if (c == ')') {
                ret = ret + " " + c;
            } else {

                ret += c;
            }
        }

        return ret;
    }
}
