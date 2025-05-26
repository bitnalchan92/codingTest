import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        String my_string = "Program29b8UYP";
        int s = 7;
        String overwrite_string = "merS123";

        System.out.println(my_string.replace(my_string.substring(s, s + overwrite_string.length()), overwrite_string));
    }
}