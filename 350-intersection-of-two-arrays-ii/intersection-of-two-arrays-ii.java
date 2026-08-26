class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int resultCount = 0;

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    result[resultCount] = nums1[i];
                    resultCount++;
                    nums2[j] = -1;
                    break;
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