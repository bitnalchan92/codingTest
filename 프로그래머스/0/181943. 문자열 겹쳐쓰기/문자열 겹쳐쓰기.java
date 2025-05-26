class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder result = new StringBuilder();
        
        // front part
        String frontPart = my_string.substring(0, s);
        result.append(frontPart);
        
        // target part 
        result.append(overwrite_string);
        
        // back part
        String backPart = my_string.substring(s + overwrite_string.length());
        result.append(backPart);
        
        return result.toString();
    }
}