class Solution {
    public int solution(String myString, String pat) {
        if ( -1 != myString.toUpperCase().indexOf(pat.toUpperCase()) ) {
            return 1;
        }
        
        return 0;
    }
}