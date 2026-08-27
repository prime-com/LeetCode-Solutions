class Solution {
    public int firstUniqChar(String s) {
        int uniques = -1;
        for ( int i = 0 ; i < s.length(); i ++) {
            boolean repeat = false;
             for ( int j = 0 ; j < s.length(); j ++) {

                if (i!= j && s.charAt(i) == s.charAt(j)) {
                    repeat = true;
                    break;
                }
             }
             if(!repeat) {
                uniques = i;
                break;
             }
        }
        return uniques;


    }
}