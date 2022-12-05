class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs = new HashSet<>();
        for(char ch : sentence.toCharArray()){
            hs.add(ch);
        }
        return hs.size() == 26;
    }
}
