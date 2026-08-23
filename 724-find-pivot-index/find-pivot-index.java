class Solution {
     public int pivotIndex(int[] arr) {
    int pivot = -1;

        for (int i = 0; i < arr.length; i++) {

            int leftsum = 0;
            int rightsum = 0;
            
            for (int j = 0; j < i; j++) {
                leftsum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightsum += arr[j];
            }

            if (leftsum == rightsum) {
                pivot = i;
                break;
            }
        }
        return pivot;
    }
}
