import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("d" + 3);// this is same as after the few steps as: "d" + "3";
        System.out.println("Ravi" + new ArrayList<>());
        System.out.println("Gangwar" + new Integer(56));

    }
}
