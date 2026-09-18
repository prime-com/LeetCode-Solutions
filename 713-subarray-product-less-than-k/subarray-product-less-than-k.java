class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int mul = 1;
        int counter = 0;
        int left = 0;

if (k <= 1) {
    return 0;
}
        for (int i = 0 ; i < arr.length ; i++) {
            mul *= arr[i];
            while (mul >= k) {
                mul = mul / arr[left];
                left++;
            }
            counter = counter + (i - left +1);
        }
        return counter;
    }
}