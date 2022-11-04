public class Solution {
    public ArrayList<Integer> Merge(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        int i, j, size = l1.size();
        while (!l2.isEmpty()) l1.add(l2.remove(l2.size() - 1));

        i = 0;
        j = l1.size() - 1;
        while (i < size && j >= size)
            if (l1.get(i) < l1.get(j)) l2.add(l1.get(i++));
            else l2.add(l1.get(j--));
        while (i < size) l2.add(l1.get(i++));

        while (j >= size) l2.add(l1.get(j--));

        return l2;
    }
    
}