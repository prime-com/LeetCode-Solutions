class Solution {
    public int isPrefixOfWord(String sen, String tofind) {

int word_counter = 1;
for (int i = 0; i < sen.length(); i++) {

    if (sen.charAt(i) == ' ') {
        word_counter++;
    }

    if ((i == 0 || sen.charAt(i - 1) == ' ')
            && sen.charAt(i) == tofind.charAt(0)) {

        boolean found = true;

        for (int j = 0; j < tofind.length(); j++) {

            if (i + j >= sen.length()
                    || sen.charAt(i + j) != tofind.charAt(j)) {

                found = false;
                break;
            }
        }

        if (found) {
           
            return word_counter;

        }
    }
}


return -1;


    }   
}
