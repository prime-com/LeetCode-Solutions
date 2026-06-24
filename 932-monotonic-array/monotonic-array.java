class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean ascending = true;
    boolean descending = true;

    for ( int i = 0 ; i < nums.length - 1 ; i++) {
        if ( nums[i] > nums[i+1] ) {
            ascending = false;
                  
        }  
        else if ( nums[i] < nums[i+1]) {
            descending = false;
    
        }  
        if (!ascending && !descending) {
            break;
        }  
          
    }

    return ascending || descending;  
    }
}