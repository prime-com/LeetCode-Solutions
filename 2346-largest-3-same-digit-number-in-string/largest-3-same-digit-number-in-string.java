class Solution {
    public String largestGoodInteger(String num) {
       String [] goods = new String[] { "999" , "888", "777", "666", "555", "444", "333", "222","111", "000"}; 
       for ( String good:goods ) {
        if (num.indexOf(good) != -  1) return good;
       }
       return "";
    }
}