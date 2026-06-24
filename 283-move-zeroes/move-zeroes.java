class Solution {
    public void moveZeroes(int[] arr) {
        int writeCounter = 0;

    for ( int i = 0 ; i < arr.length ; i++) {
        if ( arr[i] != 0) {
            arr[writeCounter] = arr[i] ;
            writeCounter++;
        }

    }
     for ( ; writeCounter < arr.length ;writeCounter++) {
            arr[writeCounter] = 0;                 
        }
    }
}