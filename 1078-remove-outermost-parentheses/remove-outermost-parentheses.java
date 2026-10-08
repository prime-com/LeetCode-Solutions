class Solution {
    public String removeOuterParentheses(String s) {
int oo = 0;
int io = 0;

for ( int i=0 ; i< s.length() ; i++) {
    if (s.charAt(i) == '(' && oo == 0) {
       s = s.substring(0, i) + s.substring(i + 1);
          i--;
        oo++;   
    }
    else if (s.charAt(i) == '(' && oo >= 1){
        io++;
    }
    else if (s.charAt(i) == ')' && io > 0)  {
        io--;
    }
    else if (s.charAt(i) == ')' && io == 0) {
    s = s.substring(0, i) + s.substring(i + 1);
    oo--;
    i--;
}
}
return s;
    }
}