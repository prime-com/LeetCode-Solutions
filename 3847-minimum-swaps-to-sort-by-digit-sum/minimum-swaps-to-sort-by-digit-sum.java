import java.util.*;

class Solution {
    public int minSwaps(int[] arr) {

        int[] narr = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int temp = arr[i];

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            narr[i] = sum;
        }

        int max = narr[0];
        int min = narr[0];

        for (int i = 0; i < narr.length; i++) {
            if (narr[i] > max) max = narr[i];
            if (narr[i] < min) min = narr[i];
        }

        int n = arr.length;
        int[][] pairs = new int[n][3];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = narr[i];
            pairs[i][1] = arr[i];
            pairs[i][2] = i;
        }

        Arrays.sort(pairs, (a, b) -> a[0] != b[0]
                ? Integer.compare(a[0], b[0])
                : Integer.compare(a[1], b[1])
        );

        boolean[] visited = new boolean[n];
        int swap = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || pairs[i][2] == i) continue;

            int cycleLength = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = pairs[j][2];
                cycleLength++;
            }

            swap += cycleLength - 1;
        }

        return swap;
    }
}