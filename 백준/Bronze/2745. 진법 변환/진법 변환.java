import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0.0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int x = 0;
            if ('0' <= c && c <= '9') {
                x = c - '0';
            } else if ('A' <= c && c <= 'Z') {
                x = c - 'A' + 10;
            }
            // System.out.printf("%d 번째 ==> %d * Math.pos(%d, %d) \n", i, x, b, n.length() - i - 1);
            result += x * Math.pow(b, n.length() - i - 1);
        }
        System.out.println((int) result);
        br.close();
    }
}