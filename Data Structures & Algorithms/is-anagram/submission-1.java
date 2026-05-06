class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mapS = new HashMap<>();
         HashMap<Character, Integer> mapT = new HashMap<>();

         for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
         };

         for (int i = 0; i < t.length(); i++) {
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
         };

        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {
            if (!mapT.containsKey(entry.getKey()) || !mapT.get(entry.getKey()).equals(entry.getValue())) {
                return false; // Valid inside a method, not inside forEach
            }
        }

         return true;
    }
}
