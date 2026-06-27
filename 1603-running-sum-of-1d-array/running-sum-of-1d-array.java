class Solution {
    public int[] runningSum(int[] arr1) {
    int sum = 0;
    int finalRes = 0;
    int[] arr2 = new int[arr1.length];

    for ( int i = 0 ; i < arr1.length ; i++) {
        sum += arr1[i];
        arr2[i] = sum;
    }
return arr2;
    }
}