class Solution {
    public boolean isHappy(int n) {

      boolean happy = true;

      HashSet <Integer> set = new HashSet<>();

      while (n!= 1) {
        if(set.contains(n)) {
        happy = false;
        break;
        }
        set.add(n);
        int sum = 0;
        int current =n;
        while ( current > 0) {
        int digit = current % 10;
        sum = sum + digit * digit;
        current = current / 10;
        }
        n = sum;
      } 
      return happy;

    }
}