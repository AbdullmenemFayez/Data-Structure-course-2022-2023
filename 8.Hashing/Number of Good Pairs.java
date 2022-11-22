class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0 ;
        for (Integer val : hm.values()) {
            ans += ((val - 1) * val) / 2;
        }
        return ans;
    }
}