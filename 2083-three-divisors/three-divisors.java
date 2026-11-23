class Solution {
    public boolean isThree(int n) {
        int count = 0;
     if (n <= 3) return false;
     if (n == 4) return true;

    if (n > 4 && n % 2 != 0) {
        for ( int i = (n-1)/2 ; i > 1 ; i--) {
        if ( n%i == 0 ) {
            count++;
        }     
    }
     if ( count == 1) {
            return true;
        }
        else {
            return false;
        }

    }
       return false;
    }
}