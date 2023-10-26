import java.util.ArrayList;

public static ArrayList<Integer> decoded(ArrayList<int[]> encoded) {
    ArrayList<Integer> decoded = new ArrayList<>();

    for (int[] pair : encoded) {
        int N = pair[0];
        int value = pair[1];

        for (int i = 0; i < value; i++) {
            decoded.add(N);
        }
    }

    return decoded;
}
