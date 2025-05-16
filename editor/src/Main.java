import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        String[][] arr = new String[5][15]; // 다섯줄이고 한줄에 1~15개의 알파벳과 0~9가 올 수 있다.

        // 배열에 값 입력
        for (int i = 0; i < arr.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                arr[i][j] = String.valueOf(c);
            }
        }

        // 출력 ( 세로 출력이니까 j(열) 대신 i(행)번호가 늘어나면서 출력을 한번하고 다음열(j+1)되어 다음 반복 수행하도록
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] != null) System.out.print(arr[i][j]);
            }
        }
    }
}