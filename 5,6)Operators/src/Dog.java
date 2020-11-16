public class Dog {
    private String name;
    private String says;
    Dog(){
        name = "name";
        says = "gav";
    }
    Dog(String name, String says){
        this.name = name;
        this.says = says;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSays(String says) {
        this.says = says;
    }
    public String getName() {
        return name;
    }
    public String getSays() {
        return says;
    }
    public void output(){
        System.out.println("Dog:");
        System.out.println(name + " says " + says );
    }
}
