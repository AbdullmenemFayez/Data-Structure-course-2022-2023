

    private static boolean isPangram(String s) {

        HashSet<Character> check = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            check.add(s.charAt(i));
        }
        return check.size() == 26;

    }

