import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int step = Integer.parseInt(br.readLine());
        int numCnt = 1;

        //
        /**
         * input으로 주어진 step이 몇번째 줄에 포함되어 있는지 확인
         *
         * 1. 첫째줄에 1개, 둘째줄에 2개, 셋째줄에 3개씩 분수가 존재하고, 위에서 int numCnt을 1로 초기화 해놨다.
         * 2. input으로 8이 들어온다면 아래의 while문에서 numCnt를 뺀 값을 할당한 후, ++을 하는데, 이는 아래 설명의 이유와 같다
         *    먼저 첫째줄에 1개의 분수가 있으므로, 8에서 1을 빼고, 그럼 step은 7이됨
         *    numCnt++;가되어 numCnt는 2가 되고,
         *    다시 `7 - 2`를 하면 `5`가되고 다음반복에선 `5 - 3`은 `2`가 되고, 다음 반복에서 `2 - 4`를 하면 -2가 되는데!
         *    이렇게 되면 분수가 존재하지 않는다는 의미가 되기 때문에, `step > numCnt` 조건에 의해 반복문을 빠져나오고
         *    이 결과
         *    input이 8일때는 !!
         *    step = 2
         *    numCnt = 4 가 된다.
         *    8이 속한 라인의 분수의 수는 4개이고, 짝수줄 홀수줄의 따라 차이가 있겠지만 분자 또는 분모가 step의 값인 2가 된다.
         *    이를 결정하는 조건을 아래에 이제 추가로 작성해주어야 한다.
         */
        while (step > numCnt) {
            step -= numCnt;
            numCnt++;
        }
        // System.out.println("step = " + step);
        // System.out.println("numCnt = " + numCnt);

        /**
         * 그림을 보면
         * 짝수줄일때...
         * 홀수줄일때... 분수가 바뀌는 패턴이 다르다.
         *
         * 짝수줄일때 : 분모는 1씩 작아지고, 분자는 1씩 커진다.
         * 홀수줄일때 : 분모는 1씩 커지고, 분자는 1씩 작아진다.
         */
        int parent = 0;
        int child = 0;
        if (numCnt % 2 == 0) {
            parent = numCnt - step + 1;
            child = step;
        } else {
            parent = step;
            child = numCnt - step + 1;
        }
        System.out.println(child + "/" + parent);
    }
}