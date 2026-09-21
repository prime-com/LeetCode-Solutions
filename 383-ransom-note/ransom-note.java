class Solution {
    public boolean canConstruct(String ran, String mag) {
        boolean possible = true;
        for (int i = 0 ; i < ran.length(); i++) {
            boolean found = false;
            for ( int j = 0 ; j < mag.length(); j++) {
                if ( ran.charAt(i) == mag.charAt(j)) {
                    found = true;
                    mag = mag.substring(0 , j) + mag.substring(j+1);
                    break;
                }
            }
            if(!found) {
                possible = false;
                break;
            }
        }
        return possible;
    }
}