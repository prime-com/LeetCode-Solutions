class Solution {
    public int maxOperations(int[] arr, int k) {
        int operations = 0;
        Arrays.sort(arr);
        for ( int left = 0 , right = arr.length-1 ; left < right ;) {
            if (arr[left] + arr[right] == k) {
                operations++;
                left++;
                right--;
            }
            else if (arr[left] + arr[right] < k) {
                left++;
            }
            else {
                right--;
            }
        }
        return operations;
    }
}