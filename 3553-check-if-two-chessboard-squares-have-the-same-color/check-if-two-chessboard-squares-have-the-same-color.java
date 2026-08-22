class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String blackSquares = "a1 c1 e1 g1 b2 d2 f2 h2 a3 a5 a7 b4 b6 b8 c3 c5 c7 d4 d6 d8 e3 e5 e7 f4 f6 f8 g3 g5 g7 h4 h6 h8";

        String whiteSquares = "a2 a4 a6 a8 b1 b3 b5 b7 c2 c4 c6 c8 d1 d3 d5 d7 e2 e4 e6 e8 f1 f3 f5 f7 g2 g4 g6 g8 h1 h3 h5 h7";
        
        if (blackSquares.contains(coordinate1) && blackSquares.contains(coordinate2)) {
            return true; 
        }
        if (whiteSquares.contains(coordinate1) && whiteSquares.contains(coordinate2)) {
            return true;
        }
        
        return false; 
    }
}