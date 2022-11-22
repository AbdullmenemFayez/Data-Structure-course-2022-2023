private static int countStudents(int[] students, int[] sandwiches) {
    Queue<Integer> q = new LinkedList<>();

    for (int preferredType : students) {
        q.add(preferredType);
    }

    for (int sandwichType : sandwiches) {
        int iter = 0, sz = q.size();

        while (iter != sz) {
            int type = q.remove();

            if (type == sandwichType) {
                break;
            }

            q.add(type);

            ++iter;
        }

        if (iter == sz) {
            return q.size();
        }
    }

    return 0;
}