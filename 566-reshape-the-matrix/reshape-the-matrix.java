class Solution {
    public int[][] matrixReshape(int[][] arr, int r, int c) {

        int got = 0;
        int req = r * c;
        int index = 0;
        for ( int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                got++;
            }
        }
        if ( got != req) {
            return arr;
        }
        else {
            int [] [] result = new int[r][c];
            for ( int i = 0 ; i < arr.length ; i++) {
                for (int j = 0 ; j < arr[i].length ; j++) {
               int row = index / c;
               int col = index % c;

               result[row][col] = arr[i][j];
               index++;

               
            }
        }
        return result;
        }
    }
}