class Solution {
    public boolean squareIsWhite(String coordinates) {
       
        String blackSquares = "a1 c1 e1 g1 b2 d2 f2 h2 a3 a5 a7 b4 b6 b8 c3 c5 c7 d4 d6 d8 e3 e5 e7 f4 f6 f8 g3 g5 g7 h4 h6 h8";
       if (blackSquares.contains(coordinates)) {
            return false; 
        }
        return true; 
    }
}