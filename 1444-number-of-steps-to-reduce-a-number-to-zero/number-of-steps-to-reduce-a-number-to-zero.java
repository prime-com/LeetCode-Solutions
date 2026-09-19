class Solution {
    public int numberOfSteps(int n) {
    int num = n;

int counter = 0;
for ( int i = 0 ; i < num ; i++ ) {
    if ( n % 2 == 0) {
        n = n / 2;
        counter++;
    }
    else {
        n = n -1;
        counter++;
        if ( n == 0) {
            break;
        }
    }
}
return counter;
    }
}