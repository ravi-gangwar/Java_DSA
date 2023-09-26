import java.util.Scanner;

public class StringBuilder1 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int input = in.nextInt();
        String add = "";
        for (int i = 0; i < 26; i++) {
            add += (char) ('a' + i); /// It is take n^2 COMPLEXITY n for Loop and n for addiing
        }
        System.out.println(add);

        // for n complexity we can use for adding the String String Builder Function;
        // Like array we can change it
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);

    }
}
