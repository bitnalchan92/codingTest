import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stage = Integer.parseInt(br.readLine());
        int stageRowLength = 2; // 2 * 2 = 4개의 점으로 초기화
        br.close();

        for (int i = 0; i < stage; i++) {
            stageRowLength += (int) Math.pow(2, i);
        }

        System.out.println((int) Math.pow(stageRowLength, 2));
    }
}