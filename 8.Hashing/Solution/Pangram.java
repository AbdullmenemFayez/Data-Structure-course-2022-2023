import java.util.HashSet;

/**
 *
 * @author AlaaDuridi
 */
public class pangram {

    public static void main(String[] args) {

        String s = "abcdefghijklmnopqrstuvwxyzabcdefgijklmnopqrstuvwzyzx";
        System.out.println(isPangram1(s));
    }


    private static boolean isPangram1(String s) {

        HashSet<Character> c = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            c.add(s.charAt(i));
        }
        return c.size() == 26;

    }
}
