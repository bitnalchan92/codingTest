import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int[][] getArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();

        return arr;
    }

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int getTopCount(int[][] map) {
        int result = 0;
        int n = map.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isTop = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k]; // next direction X
                    int ny = j + dy[k]; // next direction Y

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] >= map[i][j]) {
                        isTop = false;
                        break;
                    }
                }

                if (isTop) result++;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        int[][] map = T.getArray();
        System.out.println(T.getTopCount(map));
    }
}