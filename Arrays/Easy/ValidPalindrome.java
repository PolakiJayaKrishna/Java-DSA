class Solution {
    public boolean isPalindrome(String s) {
        String clearedString= s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        int i=0 , j = clearedString.length()-1;
        while(i<j){
            // if(clearedString.equals(i) != clearedString.equals(j))
            if(clearedString.charAt(i) != clearedString.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}