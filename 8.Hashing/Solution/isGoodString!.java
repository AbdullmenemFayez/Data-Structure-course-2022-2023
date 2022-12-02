
    private static boolean isGood(String s) {
        if (s.equals("")) 
            return true;
        

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) 

            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        

        Set<Integer> set = new HashSet<>();

        for (Integer i : hm.values()) 
            set.add(i);
        
        return set.size() == 1;

    }


