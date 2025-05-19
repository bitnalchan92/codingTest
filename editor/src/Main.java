import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            int x = 0;
            if (Character.isDigit(c)) x = c - '0';
            else x = c - 'A' + 10;
            result += x * (int) Math.pow(b, n.length() - i - 1);
        }
        System.out.println(result);
        br.close();
    }
}