import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int area = 0;
        boolean[][] space = new boolean[100][100];
        int paperCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < paperCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if ( !space[j][k] ) {
                        space[j][k] = true;
                        area++;
                    }
                }
            }
        }

        br.close();
        System.out.println(area);
    }
}