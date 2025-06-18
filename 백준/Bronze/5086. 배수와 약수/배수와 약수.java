import java.util.*;
import java.io.*;

public class Main {
    public void printRelation(int a, int b) {
        // 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력
        if (b % a == 0) {
            System.out.println("factor");
        } else if (a % b == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("neither");
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) break;

            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            T.printRelation(a, b);
        }

        br.close();
    }
}