import java.util.Calendar;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 234.445f;

        // System.out.printf("Print Only 2 Decimal number: %.2f", a);

        // System.out.printf(Math.PI);
        System.out.printf("Pie only 3 decimal number %.3f", Math.PI);
        System.out.println();
        System.out.printf("hey my name is %s and my %s", "ravi", "cool");
        System.out.println();
        System.out.printf("%tD", Calendar.getInstance());
        System.out.println();
        System.out.printf("%tT", Calendar.getInstance());
    }
}

// There are many format specifiers we can use. Here are some common ones:

// %c - Character
// %d - Decimal number (base 10)
// %e - Exponential floating-point number
// %f - Floating-point number
// %i - Integer (base 10)
// %o - Octal number (base 8)
// %s - String
// %u - Unsigned decimal (integer) number
// %x - Hexadecimal number (base 16)
// %t - Date/time
// %n - Newline

// \b - Insert backspace
// \f - Next line's first character starts to the right of current line's last
// character
// \n - Insert newline
// \r - Insert carriage return
// \t - Insert tab
// \\ - Insert backslash
// %% - Insert percentage sign