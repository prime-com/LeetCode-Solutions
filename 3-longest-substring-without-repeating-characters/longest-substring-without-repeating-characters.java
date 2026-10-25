class Solution {
    public int lengthOfLongestSubstring(String s) {
      int ans = 0;
      int left = 0;
      for ( int right = 0 ; right < s.length() ; right++) {
        char ch = s.charAt(right);
String window = s.substring(left, right);

while (window.indexOf(ch) != -1) {
    left++;
    window = s.substring(left, right);
}
int length = right - left + 1;

if (length > ans) {
    ans = length;
}
  }  
  return ans;
    }
}