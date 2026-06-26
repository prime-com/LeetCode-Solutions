class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

    for (int i = 0 ; i < arr.length ; i++) {
        int remaining = target - arr[i];
            if ( map.containsKey(remaining) ) {
               return new int [] {map.get(remaining) , i };
        }
           map.put(arr[i],i);
    }
    return new int[] {};
    }
}