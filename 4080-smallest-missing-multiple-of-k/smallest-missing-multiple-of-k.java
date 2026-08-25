class Solution {
    public int missingMultiple(int[] arr, int k) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int j = 1; ; j++) {
            int multiple = j * k;
            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == multiple) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return multiple;
            }
        }
    }
}