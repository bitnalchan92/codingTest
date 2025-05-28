import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        String s = st.nextToken();
        char t = st.nextToken().charAt(0);

        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p); // 중요! 먼저 ++하며 돌았던 반복문에서 미리 셋팅되어있던 값과 현재의 값을 비교하여 min값을 새로 넣어줘야한다. 가까운 거리를 찾고 있기 때문에!
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

        // teachermode e
        // avdkevapeivjdk v
    }
}