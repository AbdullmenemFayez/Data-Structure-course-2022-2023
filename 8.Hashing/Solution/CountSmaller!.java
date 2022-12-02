
    private static int[] countSmaller(int[] a) {
        int ret[] = new int[a.length];
        int temp[] = a.clone();
        Arrays.sort(temp);
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && a[i] == a[i - 1]) {
                ret[i] = ret[i - 1];
            } else {
                int t = a[i];
                int l = 0, r = temp.length - 1, mid, x = -1;
                while (l <= r) {
                    mid = (l + r) / 2;
                    if (temp[mid] == t) {
                        x = mid;
                        r = mid - 1;
                    } else if (temp[mid] > t) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
                ret[i] = x;
            }
        }
        return ret;
    }

