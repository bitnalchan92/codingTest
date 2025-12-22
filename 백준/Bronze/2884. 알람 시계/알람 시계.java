import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n_h = 0;
        int n_m = 0;
        
        if ( m < 45 ) {
            n_h = h == 0 ? 23 : h-1;
            n_m = 60 - (45-m);
        } else {
            n_h = h;
            n_m = m - 45;
        }
        
        System.out.printf("%d %d", n_h, n_m);
    }
}