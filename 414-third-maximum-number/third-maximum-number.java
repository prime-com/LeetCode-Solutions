class Solution {
    public int thirdMax(int[] arr) {
        if (arr.length == 1) return arr[0];
        if (arr.length == 2) return Math.max(arr[0], arr[1]);

        long largest_num = Long.MIN_VALUE;
        long second_largest_num = Long.MIN_VALUE;
        long third_largest_num = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {   
            if (arr[i] == largest_num || arr[i] == second_largest_num || arr[i] == third_largest_num) {
                continue; 
            }     
                
            if (arr[i] > largest_num) {
                third_largest_num = second_largest_num;
                second_largest_num = largest_num;
                largest_num = arr[i];        
            }
            else if (arr[i] > second_largest_num) {
                third_largest_num = second_largest_num;
                second_largest_num = arr[i];
            }  
            else if (arr[i] > third_largest_num) {
                third_largest_num = arr[i];
            }
        }

       
        if (third_largest_num == Long.MIN_VALUE) {
            return (int) largest_num;
        }
        
        return (int) third_largest_num;
    }
}