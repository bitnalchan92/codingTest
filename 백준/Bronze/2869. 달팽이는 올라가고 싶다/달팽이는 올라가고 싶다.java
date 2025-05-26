import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /**
         * A : 낮에 올라갈 수 있는 높이
         * B : 밤에 미끄러져 내려오는 높이
         * V : 막대기의 높이
         */
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), V = Integer.parseInt(st.nextToken());
        br.close();

        int days = (int)Math.ceil(((double)(V - A) / (A - B)));

        System.out.println(days + 1);
    }
}