import java.util.*;

public class Consistent {

    public static void main(String[] args) {

        String allowed = "andelr";
        String[] words = {"alaa", "nader", "noor", "abrar", "ahmad"};

        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < allowed.length(); ++i) {

            hm.put(allowed.charAt(i), hm.getOrDefault(allowed.charAt(i), 0) + 1);
        }

        int sum = 0;
        for (int i = 0; i < words.length; ++i) {
            boolean flag = true;

            for (int j = 0; j < words[i].length(); ++j) {

                if (hm.getOrDefault(words[i].charAt(j), 0) <= 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum++;
            }

        }

        System.out.println(sum);
    }

}
