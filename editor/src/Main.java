import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생의 수
        int M = Integer.parseInt(st.nextToken()); // 수학테스트 횟수
        int[][] orders = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                orders[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // System.out.println("===================================");
        // for (int i = 0; i < orders.length; i++) {
        // for (int n : orders[i]) {
        // System.out.print(n + " ");
        // }
        // System.out.println();
        // }
        // System.out.println("===================================");
        int caseCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 같은 학생을 비교하는 경우는 skip
                if (i == j)
                    continue;

                // System.out.println("멘토: " + (i + 1) + ", 멘티: " + (j + 1)); // 멘토와 멘티가 같은 사람이
                // 되는 경우를 제외하고 4명의 학생이 주어지는 경우 경우의 수는 총 12가지이다.
                int temp = 0; // M번의 수학테스트 횟수를 수행하며, 각각의 테스트에서 멘토 & 멘티로 이번 반복하게 될 두 학생이 매칭 가능한지 카운팅하는 변수
                for (int x = 0; x < M; x++) { // M은 수학테스트의 수행 횟수
                    int orderI = 0; // i학생의 등수
                    int orderJ = 0; // j학생의 등수
                    for (int y = 0; y < N; y++) { // N은 인원수고...
                        // 본 반복문 안에서 하려는건 위에서 현재 비교하게될 경우의 수 i학생(멘토), j학생(멘티)이 정해져있기 때문에 각각의 테스트 별로 반복을
                        // 돌며 해당 학생들이 몇등을 했는지 확인하고자 함
                        // 확인했을때 3번의 경우 멘토가 등수가 더 높은경우 (index가 낮은경우)가 수학테스트 수행 횟수(M)과 같다면! 그런 경우 멘토와 멘티가
                        // 매칭! 작성해보자...
                        if ((i + 1) == orders[x][y]) {
                            orderI = y; // 이번에 멘토가 될 i 학생의 등수
                        }
                        if ((j + 1) == orders[x][y]) {
                            orderJ = y; // 이번에 멘티가 될 j 학생의 등수
                        }
                    }
                    // System.out.println("=====> " + (i + 1) + "학생의 등수: " + (orderI + 1) + ", " +
                    // (j + 1) + "학생의 등수: " + (orderJ + 1));
                    if (orderI < orderJ)
                        temp++;
                }

                if (temp == M)
                    caseCnt++;
            }
        }

        System.out.println(caseCnt);
    }
}