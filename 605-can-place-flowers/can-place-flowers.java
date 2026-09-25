class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if (arr.length == 1) {
    if (arr[0] == 0) {
        n--;
    }
    return n <= 0;
}
 if ( arr[0] == 0 && arr[1] == 0) {
        n -= 1;  
        arr[0] = 1; 
    }


    for (int i = 1 ; i < arr.length -1 ; i++) {
   if ( arr[i] == 0 && arr[i-1] == 0 && arr[i+1] == 0) {
    n -= 1;
    arr[i] = 1;
   }
}
  int i = arr.length - 1;

if (arr[i] == 0 && arr[i-1] == 0) {
    n--;
    arr[i] = 1;
}

   if ( n <= 0) {
   return true;
   }
   else {
return false;
   }

}
}