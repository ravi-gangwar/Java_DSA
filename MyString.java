public class MyString {
    public static void main(String[] args) {
        // String
        String name = "Ravi Gangwar";
        System.out.println(name);

        // String Pool
        // Same Values and Same Object

        String a = "Ravi";
        String b = "Ravi";
        System.out.println(a == b);

        // Different Objects and Same Values
        String name1 = new String("Ravi");
        String name2 = new String("Ravi");
        System.out.println(name1 == name2);

        // copy and compare

        String c = a;
        System.out.println(a == c);

        // Strings Methos=ds
        System.out.println(a.equals(c)); // this equals method cheack the value is same or not.
        // true

        // get character of A String by index
        System.out.println(name1.charAt(0));

        // premitive store in stack memory and objects are store in heap memory

    }
}

// Heap need more memory and store every object to seprate address