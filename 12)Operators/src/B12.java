/*
Exercise 12: (3) Start with a number that is all binary ones. Left shift it, then use the
unsigned right-shift operator to right shift through all of its binary positions, each time
displaying the result using Integer.toBinaryString( ).
 */
public class B12 {
    public static void main(String[] args) {
        int i = 0xFF;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i<<=1));
        System.out.println("Cycle:");
        while(i!=0){
            System.out.println(Integer.toBinaryString(i>>>=1));
        }
    }
}
