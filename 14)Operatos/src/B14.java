/*
Exercise 14: (3) Write a method that takes two String arguments and uses all the
boolean comparisons to compare the two Strings and print the results. For the == and !=,
also perform the equals( ) test. In main( ), call your method with some different String
objects.
 */
public class B14 {
    void func(String s1,String s2){
        int sizeS1 = s1.length(),sizeS2 = s2.length();
        System.out.println("Length s1: " + sizeS1 + "\n" + "Length s2: " + sizeS2 );
        System.out.println("s1 == s2");
        System.out.println(s1 == s2);
        System.out.println("s1 != s2");
        System.out.println(s1 != s2);
        System.out.println("s1 equals s2");
        System.out.println(s1.equals(s2));
        System.out.println("s1 > s2");
        System.out.println(sizeS1 > sizeS2);
        System.out.println("s1 < s2");
        System.out.println(sizeS1 < sizeS2);
        System.out.println("s1 >= s2");
        System.out.println(sizeS1 >= sizeS2);
        System.out.println("s1 <= s2");
        System.out.println(sizeS1 <= sizeS2);
        System.out.println("______________/");
    }
    public static void main(String[] args) {
        B14 obj = new B14();
        obj.func("12345","123");
        obj.func("123","123");
        obj.func("123","12345");
    }
}
