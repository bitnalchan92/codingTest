### 시간초과... 시간복잡도가 반복문만큼 수행
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /**
         * A : 낮에 올라갈 수 있는 높이
         * B : 밤에 미끄러져 내려오는 높이
         * V : 막대기의 높이
         */
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), V = Integer.parseInt(st.nextToken());
        br.close();

        int result = 1;
        int currentHeight = 0;

        /**
         * 현재 올라간 높이가 막대기의 높이보다 커지는 경우라면 꼭대기에 달팽이가 도착했다는 뜻이므로 더이상 반복을 진행할 필요가 없다.
         */
        while (true) {
            if (result == 1) currentHeight = A;
            else {
                if (currentHeight - B <= 0) {
                    currentHeight = 0;
                } else {
                    currentHeight = currentHeight - B + A;
                }
            }

            if (currentHeight >= V) break;

            result++;
        }

        System.out.println(result);
    }
}
```

### 통과한 답안
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /**
         * A : 낮에 올라갈 수 있는 높이
         * B : 밤에 미끄러져 내려오는 높이
         * V : 막대기의 높이
         */
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), V = Integer.parseInt(st.nextToken());
        br.close();

        /**
         * 아래 소스 설명... ( 일단 시간 이전에 내가 제출한 소스는 시간초과! ) => https://www.youtube.com/watch?v=FiR7NmEE8AY 이분이 설명을 너무 잘해주심...
         */
        int days = (int)Math.ceil(((double)(V - A) / (A - B)));

        System.out.println(days + 1);
    }
}
```

