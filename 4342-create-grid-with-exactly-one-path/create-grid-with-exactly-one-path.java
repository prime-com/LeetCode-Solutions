class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];

        if (m == 1) {
            ans[0] = ".".repeat(n);
            return ans;
        }

        if (n == 1) {
            for (int i = 0; i < m; i++) {
                ans[i] = ".";
            }
            return ans;
        }

        ans[0] = ".".repeat(n);

        for (int i = 1; i < m; i++) {
            ans[i] = "#".repeat(n - 1) + ".";
        }

        return ans;
    }
}