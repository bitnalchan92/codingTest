import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void solution(int[] changeAmount, int change) {
        int[] result = new int[4];
        int remainChange = change;

        for (int i = 0; i < changeAmount.length; i++) {
            result[i] = remainChange / changeAmount[i];
            remainChange %= changeAmount[i];
        }

        for (int n : result) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Main M = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] changeAmount = {25, 10, 5, 1};
        for (int i = 0; i < T; i++) {
            M.solution(changeAmount, Integer.parseInt(br.readLine()));
        }
    }
}