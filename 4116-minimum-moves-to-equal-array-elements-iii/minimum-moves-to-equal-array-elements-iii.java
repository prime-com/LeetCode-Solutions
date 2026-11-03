class Solution {
    public int minMoves(int[] arr) {
int ans = 0;
int maxx = Arrays.stream(arr).max().getAsInt();

for ( int i = 0 ; i < arr.length ; i++) {
    if (arr[i] != maxx) {
        ans += maxx - arr[i];
    }   
}
return ans;
    }
}