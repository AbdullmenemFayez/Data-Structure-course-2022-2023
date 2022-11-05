public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(2);
        arr.add(4);
        arr.add(6);

        System.out.println(shuffle(arr, 3));
    }

public static ArrayList<Integer> shuffle(ArrayList<Integer> nums, int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            ans.add(nums.get(i));
            ans.add(nums.get(n + i));
        }
        return ans;
    }
