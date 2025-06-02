import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int charCnt = Integer.parseInt(br.readLine());
        String encodedWord = br.readLine();
        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charCnt; i++) {
            String tmp = encodedWord.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2); // 두 번째 인자인 radix는 "이 문자열이 몇 진수인지를 알려주는 값"이야.
            sb.append((char) num);

            encodedWord = encodedWord.substring(7);
        }

        System.out.println(sb);
    }
}