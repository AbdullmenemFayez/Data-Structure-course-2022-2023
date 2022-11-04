public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        
        ret.add(new ArrayList<>(Arrays.asList(1)));
        
        for (int i =  1; i <  numRows; i++) {
            List<Integer> a = new ArrayList<>();
            
            a.add(1);
            
            List<Integer> prev = ret.get(ret.size() - 1);
            
            for (int j = 1; j < prev.size(); j++) {
                a.add(prev.get(j) + prev.get(j - 1));
            }
            
            a.add(1);
            
            ret.add(a);
        }
        
        return ret;
    }
}