class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        for ( int i = 1 ; i < s.length() ; i++) {
            if ( s.charAt(i) == ')' && s.charAt(i-1) == '(') {
            s = s.substring(0, i - 1) + s.substring(i + 1); 
            i -= 2;
            if (i < 0) {
                i = 0;
            }
                       }
            
        }
        return s.length(); 
    }
}