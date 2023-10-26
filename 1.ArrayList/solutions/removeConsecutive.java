import java.util.ArrayList;

public static void removeConsecutive(ArrayList<Integer> list, int index, int k) {
    if (list == null || index < 0 || index >= list.size() || k <= 0) {
        // Handle invalid input or out-of-bounds indices.
        return;
    }

    int n = list.size();
    int end = Math.min(index + k, n);

    for (int i = index; i < end; i++) {
        list.remove(index);
    }
}
