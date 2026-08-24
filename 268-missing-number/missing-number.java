class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int ActualSum = 0;
        int SumWeWant = n * (n + 1)/2;

        for (int i = 0; i < arr.length; i++) {
            ActualSum += arr[i];
        }
            return SumWeWant - ActualSum;
    }
}