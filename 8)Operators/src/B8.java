/*
Exercise 8: (2) Show that hex and octal notations work with long values. Use
Long.toBinaryString( ) to display the results.
 */
public class B8 {
    public static void main(String[] args) {
        long q = 0xAF01,w = 01233456;
        System.out.println("0x"+Long.toBinaryString(q));
        System.out.println(Long.toBinaryString(w));
    }
}
