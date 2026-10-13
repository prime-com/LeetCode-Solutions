class Solution {
    public long maxAlternatingSum(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
    nums[i] = Math.abs(nums[i]);
}

Arrays.sort(nums);

int[] result = new int[nums.length];
    int k = 0 ;
int left = 0;
int right = nums.length - 1;

for (; left < right; left++, right--) {
    

    result[k] = nums[right];
    k++;
    result[k] = nums[left];
    k++;
   
}
if (left == right) {
    result[k] = nums[left];
}
long sum = 0;

for (int i = 0; i < result.length; i++) {
    long square = (long)result[i] * result[i];
    if (i % 2 == 0) {
        sum += square;
    } else {
        sum -= square;
    }
}

return sum;

}
}