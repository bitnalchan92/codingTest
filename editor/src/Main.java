import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] croAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String ele : croAlpha) {
            if (input.contains(ele)) {
                input = input.replaceAll(ele, "!");
            }
        }

        System.out.println(input.length());
    }
}

/**
 * 메모 :
 * 1. input = input.replaceAll(ele, ""); // 공백으로 바꿔버리면 문제가 발생...
 * 테스트 케이스 nljj에서 사이의 lj를 공백으로 바꾸면 "nj"가 되고 이것도 크로아티아 알파벳에 속하므로 정답인 3개가 아니라 2개라고 출력된다.
 * <p>
 * 2. c=c=의 경우 내가 c= 이거 한종류로 이루어져서 답이 1이 나와야하는거 아닌가 싶었는데, 개수를 새는 것이기 때문에 2가 정답
 */