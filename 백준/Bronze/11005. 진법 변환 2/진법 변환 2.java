import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // ex1 ) 60466175 36
        // ex2 ) 13 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), base = Integer.parseInt(st.nextToken());

        // n(10진수)을 계속 base로 나누게 되면 몫과 나머지가 나오는데...
        // n을 몫으로 두고 계속해서 base로 나누되 몫이 0보다 클 경우만 계속해서 나눈다.
        ArrayList<Character> characters = new ArrayList<>();
        while (n > 0) {
            int mod = n % base; // 나머지
            if (mod >= 10) {
                // System.out.print((char) (mod - 10 + 'A'));
                characters.add((char) (mod - 10 + 'A'));
            } else {
                // System.out.print((char) (mod + '0'));
                characters.add((char) (mod + '0'));
            }
            n /= base;
        }

        for (int i = characters.size() - 1; i >= 0; i--) {
            System.out.print(characters.get(i));
        }
    }
}