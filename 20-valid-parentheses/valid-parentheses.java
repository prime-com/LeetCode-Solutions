class Solution {
    public boolean isValid(String s) {
    char g1 = '{';
    char g2 = '(';
    char g3 = '[';

    char b1 = '}';
    char b2 = ')';
    char b3 = ']';
    
       for (int i = 0; i < s.length();) {
           boolean removed = false;

    if (i > 0 && s.charAt(i) == b1 && s.charAt(i - 1) == g1) {
      s = s.substring(0, i - 1) + s.substring(i + 1);
          i -= 2;
          if (i < 0) {
    i = 0;
}
 removed = true; 
    }
    else if (i > 0 && s.charAt(i) == b2 && s.charAt(i - 1) == g2) {
      s = s.substring(0, i - 1) + s.substring(i + 1);
          i -= 2;
          if (i < 0) {
    i = 0;
}
 removed = true;   
  }
     else if (i > 0 && s.charAt(i) == b3 && s.charAt(i - 1) == g3) {
      s = s.substring(0, i - 1) + s.substring(i + 1);
    i -= 2;
    if (i < 0) {
    i = 0;
}
 removed = true;
     }
    if (!removed) {
    i++;
}
    
}
return  s.length() == 0;
    }
}