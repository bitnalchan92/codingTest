import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int maxValue = Integer.MIN_VALUE;
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int n = Integer.parseInt(st.nextToken());

                if ( n > maxValue ) {
                    maxValue = n;
                    maxX = i + 1;
                    maxY = j + 1;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(maxX + " " + maxY);
    }
}