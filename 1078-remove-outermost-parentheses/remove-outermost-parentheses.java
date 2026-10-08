class Solution {
    public String removeOuterParentheses(String s) {
StringBuilder sb = new StringBuilder(s);
int oo = 0;
int io = 0;

for (int i = 0; i < sb.length(); i++) {
  if (sb.charAt(i) == '(' && oo == 0) {
     sb.deleteCharAt(i);
     i--;
     oo++;
  }
  else if (sb.charAt(i) == '(' && oo >= 1) {
    io++;
}
else if (sb.charAt(i) == ')' && io > 0) {
    io--;
}
else if (sb.charAt(i) == ')' && io == 0) {
    sb.deleteCharAt(i);
    i--;
    oo--;
}
}
return sb.toString();
    }
}