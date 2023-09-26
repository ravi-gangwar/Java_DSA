
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Ravi Gangwar Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));// this is make character array
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Ravi   ".strip());
        System.out.println(Arrays.toString(name.split(" "))); // this make sentences to in the array
    }
}
