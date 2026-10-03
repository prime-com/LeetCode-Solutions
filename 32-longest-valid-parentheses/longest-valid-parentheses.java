class Solution {
    public int longestValidParentheses(String s) {

        int max = 0;
        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                int cur_max = open * 2;

                if (cur_max > max) {
                    max = cur_max;
                }
            }

            if (close > open) {
                open = 0;
                close = 0;
            }
        }
        open = 0;
        close = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                int cur_max = open * 2;

                if (cur_max > max) {
                    max = cur_max;
                }
            }

            if (open > close) {
                open = 0;
                close = 0;
            }
        }

        return max;
    }
}