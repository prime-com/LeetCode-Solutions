import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] arr) {

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int i = 0;
        int length = arr.length;

        while (i < length - 1) {
            if (arr[i][1] >= arr[i + 1][0]) {

                if (arr[i + 1][1] > arr[i][1]) {
                    arr[i][1] = arr[i + 1][1];
                }

                for (int j = i + 1; j < length - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                length--;
            }
            else {
                i++;
            }
        }

        int[][] result = new int[length][2];

        for (int j = 0; j < length; j++) {
            result[j][0] = arr[j][0];
            result[j][1] = arr[j][1];
        }

        return result;
    }
}