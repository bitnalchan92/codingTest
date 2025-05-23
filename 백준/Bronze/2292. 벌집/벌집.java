import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int passCnt = 0;
        int maxNum = 1;
        while ( n > maxNum ) { // 입력받은 값이 이전 둘레의 최대값보다 클때까지 반복, 그렇게 되면 이전 범위의 경로 + 1을 해주면 지나간 길의 갯수를 알 수 있을듯하다. 일단 진행...
            maxNum += 6 * (passCnt + 1);
            // System.out.println("==================>" + maxNum);
            passCnt++;
        }

        System.out.println(passCnt + 1);
    }
}