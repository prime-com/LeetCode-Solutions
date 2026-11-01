class Solution {
    public String mergeAlternately(String w1, String w2) {
        String fin = "";
        int up = 0;
        int down = 0;
        for (;up < w1.length() && down < w2.length(); up++ , down++) {
            StringBuilder sb = new StringBuilder(fin);
            sb.append(w1.charAt(up));
            sb.append(w2.charAt(down));

            fin = sb.toString();
        }
        while (up < w1.length()) {
            fin += w1.charAt(up);
            up++;
        }
        while ( down < w2.length()) {
            fin += w2.charAt(down);
            down++;
        }
        return fin;
    }
}