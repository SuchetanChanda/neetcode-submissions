class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
        System.out.println(str.length()/2);
        for (int i = 0; i<=str.length()/2 ; i++){
            for (int j = str.length() - i - 1; j>= str.length()/2; j--) {
                if (i==j) return true;
                System.out.println(str.charAt(i) + " " + str.charAt(j));
                if (str.charAt(i) != str.charAt(j)) return false;
                break;
            }
        }
        return true;
    }
}
