class Solution {
    public boolean detectCapitalUse(String name) {
    
int Lcounter = 0;
int Ucounter = 0;
boolean format = false;

    
    for ( int i = 1 ; i < name.length() ; i++) {
       
       
        if ( Character.isLowerCase(name.charAt(i))) {
            Lcounter++;
        }
        if ( Character.isUpperCase(name.charAt(i))) {
            Ucounter++;
        }

    } 

        if ( Character.isUpperCase(name.charAt(0)) && ( Ucounter >= name.length() - 1 ) ||  Lcounter >= name.length() -1 ){
            format = true;
        }
        else if ( Character.isLowerCase(name.charAt(0)) && ( Ucounter < 1 ) || Lcounter >= name.length() -1) {
            format = true;
        }
        else if ( name.length() == 1) {
            format = true;
        }
     
     return format;
    }
}