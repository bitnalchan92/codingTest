import java.io.*;
import java.util.*;

/**
 * * 문제가 2차원배열 카테고리 안에 있어서 그 힌트를 사용했으면 좋았을텐데, 겹치는 부분을 어떻게 구해야하는지에 대해 너무 많은 시간을 소모했다.
 * 
 * 1. boolean[][]를 활용해 풀어도 되지만, int[][]로 색종이 갯수만큼 반복을 돌려, 해당하는 면적에 값을 +1씩해주고, 최종적으로는 요소의 값이 1인 것만 count해주는 방법도 있었다.
 */
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