import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int heightChecker(int[] arr) {
    int[] sorted = Arrays.copyOf(arr,arr.length);
    Arrays.sort(sorted); 

    int counter = 0;

    for ( int i = 0 ; i < arr.length ; i++) {
        if (arr[i] != sorted[i]) {
         counter++;
        }
    }
return counter;
    }
}