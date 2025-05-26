import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        
        for ( char c : sc.next().toCharArray() ) {
            if ( Character.isUpperCase(c) ) result.append(String.valueOf(c).toLowerCase());
            else result.append(String.valueOf(c).toUpperCase());
        }
        
        System.out.println(result);
    }
}