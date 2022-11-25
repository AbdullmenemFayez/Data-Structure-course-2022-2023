
import java.util.HashMap;


/**
 *
 * @author AlaaDuridi
 */
public class SumUnique {

    // driver code to test the method 
    public static void main(String[] args) {

        Integer a[] = {1, 2, 2, 2, 3, null};

        int ans = sumUnique(a);
        System.out.println(ans);
    }

    private static int sumUnique(Integer[] a) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);

        }
        int ret = 0;

        for (Integer i : hm.keySet()) {
            if (hm.get(i) == 1 && i != null) {
                ret += i;
            }
        }
        return ret;

    }
}
