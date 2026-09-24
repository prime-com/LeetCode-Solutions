class Solution {
    public int smallestIndex(int[] arr) {
        int solution = -1;
        for (int i = 0 ; i < arr.length ; i++) {
            int num = arr[i];
int sum = 0;
            while (num > 0) {
    int digit = num % 10;
    sum = sum + digit;
    num = num / 10;
}
if (sum == i) {
    return i;
}
        }
        return solution;
    }
}