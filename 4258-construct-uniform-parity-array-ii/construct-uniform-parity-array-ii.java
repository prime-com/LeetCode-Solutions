class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean allEven = true;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != 0) {
                allEven = false;
                break;
            }
        }
        if (allEven) {
            return true;
        }
        boolean allOdd = true;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0) {
                allOdd = false;
                break;
            }
        }
        if (allOdd) {
            return true;
        }
        int minVal = nums1[0];
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] < minVal) {
                minVal = nums1[i];
            }
        }
        if ( minVal % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}