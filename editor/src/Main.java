import java.util.*;
import java.io.*;

public class Main {
    public int[] getScoreOrderArray(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;

            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) cnt++;
            }

            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main M = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int scoreCnt = Integer.parseInt(br.readLine());
        int[] scoreArr = new int[scoreCnt];

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < scoreCnt; i++) {
            scoreArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int order : M.getScoreOrderArray(scoreCnt, scoreArr)) {
            System.out.print(order + " ");
        }
    }
}