import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

//        for (int i = 97; i <= 122; i++) {
//            System.out.print(word.indexOf(i) + " ");
//        }

        // 가독성은 이게더 좋은 것 같다.
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(word.indexOf(c) + " ");
        }

        br.close();
    }
}