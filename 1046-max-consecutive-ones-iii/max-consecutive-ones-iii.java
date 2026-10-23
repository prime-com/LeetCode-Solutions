class Solution {
    public int longestOnes(int[] arr, int k) {
    int left = 0; 
    int max = 0;
    int zero = 0;

    for ( int i = 0 ; i < arr.length ; i++) {
        if (arr[i] == 0 ) {
            zero++;
        }
        while (zero > k){
            if(arr[left] == 0){
                zero--;
            }
            left++;
        }
        int length =  i - left +1;
        if (length > max) {
            max = length;
        }
    }
    return max;
    }
}