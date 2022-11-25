import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author AlaaDuridi
 */
public class Good_Pairs {

    public static void main(String[] args) {
        int a[] = {1, 1, 1, 1};
        System.out.println(CountPairs(a));

    }

    private static int CountPairs(int[] a) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }
        // n C r = n! / (r!) (n-r)! -- r = 2 -- simplify -- ((n) (n-1) (n-2)!) / ((2!)(n-2)!) = (n(n-1))/2 ;
        int ret = 0;
        Set<HashMap.Entry<Integer, Integer>> s = hm.entrySet();
        Iterator<HashMap.Entry<Integer, Integer>> it = s.iterator();
        while (it.hasNext()) {
            HashMap.Entry<Integer, Integer> en = it.next();
            int val = en.getValue();
            val = ((val) * (val - 1)) / 2;
            ret += val;
        }
        return ret;
    }

}
