class Solution {
    public int climbStairs(int n) {
    
     
        int num2way = 2;
        int num3way = 3;
        int currentlast2ways = 3;
if ( n == 1) {
    return 1;
}
if ( n == 2) {
    return 2;
}
if (n == 3) {
    return 3;
}
else {
        for (int i = 3 ; i < n; i++) {
         currentlast2ways = num3way + num2way;

            num2way = num3way;
            num3way = currentlast2ways;
  
        }
        
}
return currentlast2ways;
    }
}