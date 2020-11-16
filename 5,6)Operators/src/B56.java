/*
Exercise 5: (2) Create a class called Dog containing two Strings: name and says. In
main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who
says, “Wurf!”). Then display their names and what they say.

Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s
object. Test for comparison using == and equals( ) for all references.
 */
public class B56 {
    public static void main(String[] args) {
        // 5
        Dog spot = new Dog("Spot","Ruff!");
        Dog scruffy = new Dog();
        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        spot.output();
        scruffy.output();
        // 6
        Dog d3 = spot;
        System.out.println(spot == d3);
        System.out.println(d3.equals(spot));
        System.out.println(d3 == scruffy);
        System.out.println(d3.equals(scruffy));
    }
}
