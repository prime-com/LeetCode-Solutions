class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        int resultCount = 0;

        for (int i = 0; i < nums1.length; i++) {

            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {

                boolean duplicate = false;
                for (int j = 0; j < resultCount; j++) {

                    if (result[j] == nums1[i]) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    result[resultCount] = nums1[i];
                    resultCount++;
                }
            }
        }
        int[] answer = new int[resultCount];

        for (int i = 0; i < resultCount; i++) {
            answer[i] = result[i];
        }
        return answer;
    }
}