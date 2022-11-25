import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author AlaaDuridi
 */
public class goodString {

    public static void main(String[] args) {
        // driver code to test your method 
        String s = "aaabbb";
        System.out.println(isGood(s));

    }

    private static boolean isGood(String s) {
        if (s.equals("")) {
            return true;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (Integer i : hm.values()) {
            set.add(i);
        }
        return set.size() == 1;

    }

}
