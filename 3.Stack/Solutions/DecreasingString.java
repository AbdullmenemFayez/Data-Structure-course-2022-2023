import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DecreasingString {
    public static char solution(String s, int pos) {
        int len = s.length();

        var stk = new Stack<Character>();

        s += "#";

        boolean stop = pos < len;

        for (char c : s.toCharArray()) {
            while (!stop && !stk.isEmpty() && stk.peek() > c) {
                pos -= len--;

                stk.pop();

                stop = pos < len;
            }

            stk.push(c);
        }

        var lst = new ArrayList<Character>();

        while (!stk.isEmpty()) {
            lst.add(stk.pop());
        }

        return lst.get(lst.size() - 1 - pos);
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var s = scanner.next();

        var pos = scanner.nextInt();

        --pos;

        System.out.println(solution(s, pos));
    }
}
