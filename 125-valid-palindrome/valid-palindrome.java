class Solution {
    public boolean isPalindrome(String s) {
    String CT = s.toLowerCase().replaceAll("[^a-zA-Z0-9]" , "");
    boolean isPalindrome = true;
    for ( int left = 0 , right = CT.length() - 1 ; left < right ; left++ , right--) {
        if ( CT.charAt(left) != CT.charAt(right)) {
            isPalindrome = false;
            break;
        }
    } 
    return isPalindrome;
    }
}