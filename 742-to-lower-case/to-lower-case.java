class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for ( int i = 0 ; i < s.length() ; i ++) {
            if ( sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                 sb.setCharAt(i, (char)(sb.charAt(i) + 32));
            }
        }
        return sb.toString();
    }
}