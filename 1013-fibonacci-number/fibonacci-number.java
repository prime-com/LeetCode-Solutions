class Solution {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;

    if (n == 0) {
        return first; }
    else {
        for ( int i = 2 ; i <= n ; i++ ) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
    }
}