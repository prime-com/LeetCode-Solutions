class Solution {
    public int maxDepth(String s) {
      int maxoutput = 0;
      int curoutput = 0;
      for ( int i = 0 ; i < s.length(); i++) {
        
        if ( s.charAt(i) == '(') {
            curoutput++;
        }
        if( curoutput > maxoutput ) {
            maxoutput = curoutput;
        }
        if ( s.charAt(i) == ')') {
            curoutput--;
        }
      } 
      return maxoutput; 
    }
}