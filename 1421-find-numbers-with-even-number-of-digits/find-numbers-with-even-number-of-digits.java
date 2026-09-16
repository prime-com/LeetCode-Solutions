class Solution {
    public int findNumbers(int[] nums) {
        int even_counter = 0;
        for ( int i = 0 ; i < nums.length ; i++) {
            int counter = 0;
            int number = nums[i];

            while (number > 0) {
                number = number / 10;
                counter++;
            }
            if ( counter % 2 == 0) {
                even_counter++;
            }

        }
        return even_counter;
    }
}