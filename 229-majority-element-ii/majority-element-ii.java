class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int counter1 = 0;
        int counter2 = 0;

        int can1 = 0;
        int can2 = 0;

        int n = nums.length;
        int t = n / 3;

        for (int i = 0; i < nums.length; i++) {

            if (counter1 == 0 && nums[i] != can2) {
                can1 = nums[i];
                counter1 = 1;
            }
            else if (counter2 == 0 && nums[i] != can1) {
                can2 = nums[i];
                counter2 = 1;
            }
            else if (nums[i] == can1) {
                counter1++;
            }
            else if (nums[i] == can2) {
                counter2++;
            }
            else {
                counter1--;
                counter2--;
            }
        }
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == can1) {
                count1++;
            }
            if (nums[i] == can2) {
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();

        if (count1 > t) {
            result.add(can1);
        }
        if (count2 > t  && can2 != can1) {
            result.add(can2);
        }
        return result;
    }
}