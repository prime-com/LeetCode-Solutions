class Solution {
    public int[] shuffle(int[] arr, int n) {

        int[] result = new int[arr.length];

        int i = 0;
        int j = n;

        for (int k = 0; k < arr.length; k += 2) {

            result[k] = arr[i];
            result[k + 1] = arr[j];

            i++;
            j++;
        }

        return result;
    }
}