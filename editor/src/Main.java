import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(String word) {
        String result = "NO";
        String temp = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(temp)) return "YES";

        return result;
    }

    public static void main(String[] args) throws IOException {
        Main M = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        System.out.println(M.solution(word));
    }
}