/*
Exercise 10: (3) Write a program with two constant values, one with alternating binary
ones and zeroes, with a zero in the least-significant digit, and the second, also alternating,
with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for
this). Take these two values and combine them in all possible ways using the bitwise
operators, and display the results using Integer.toBinaryString( ).
 */
public class B10 {
    public static void main(String[] args) {
        int i = 0xAA;
        int j = 0x55;
        System.out.println(i);
        System.out.println(j);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));
        System.out.println("|");
        System.out.println(Integer.toBinaryString(i | j));
        System.out.println("&");
        System.out.println(Integer.toBinaryString(i & j));
        System.out.println("^");
        System.out.println(Integer.toBinaryString(i ^ j));
        System.out.println("~");
        System.out.println(Integer.toBinaryString(~i));
        System.out.println("~");
        System.out.println(Integer.toBinaryString(~j));

    }

}
