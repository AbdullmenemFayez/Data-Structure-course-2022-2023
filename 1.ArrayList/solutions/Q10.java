import java.util.ArrayList;
import java.util.Collections;

class IntersectionSolutions {
  // O(n ^ 2) solution
  public static ArrayList<Integer> QuadraticIntersection(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    ArrayList<Integer> intersection = new ArrayList<>();

    // A boolean array that indicates whether the element of a2 at index (let's say i) is taken or not.
    boolean[] taken = new boolean[a2.size()];

    for (int e : a1) {
      for (int i = 0; i < a2.size(); i++) {
        if (taken[i])
          continue;

        if (a2.get(i) == e) {
          intersection.add(e);
          taken[i] = true;
          break;
        }
      }
    }

    return intersection;
  }

  // O(n * log2(n)) solution
  public static ArrayList<Integer> LinearithmicIntersection(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    ArrayList<Integer> intersection = new ArrayList<>();

    // Collections.sort method operates in O(n * log2(n)) Time Complexity.
    Collections.sort(a1);
    Collections.sort(a2);

    int i = 0, j = 0;

    while (i < a1.size() && j < a2.size()) {
      int e1 = a1.get(i), e2 = a2.get(j);

      if (e1 == e2) {
        intersection.add(e1);
        i++;
        j++;
      }
      else if (e1 > e2) {
        j++;
      }
      else {
        i++;
      }
    }

    return intersection;
  } // Can be improved in terms of performance, but, the complexity is the same (I will leave it to you ;))

  // O(n ^ 3) solution (WITHOUT USING ANY OTHER DATA STRUCTURE) (Modify the first ArrayList)
  public static ArrayList<Integer> intersection(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    for (int i = 0; i < a1.size(); i++) {
      boolean delete = true;

      for (int j = 0; j < a2.size(); j++) {
        if (taken[j])
          continue;

        if (a2.get(j) == a1.get(i)) {
          delete = false;
          a2.remove(j);
          break;
        }
      }

      if (delete) {
        a1.remove(i);
        i--; // the loop structure will increment i, but, I want it to keep its value because remove() will shift the elements.
      }
    }

    return a1;
  }
}
