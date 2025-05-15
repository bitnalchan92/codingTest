import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        StringBuilder sb = new StringBuilder();
        
        int arrCnt = 0;
        for (int i = 1; i <= n; i++) {
            if ( i % k == 0 ) {
                arrCnt++;
                sb.append(i + " ");
            }
        }
        
        int[] answer = Arrays.stream(sb.toString().split(" "))
            .mapToInt(s -> Integer.parseInt(s))
            .toArray();
        
        return answer;
    }
}