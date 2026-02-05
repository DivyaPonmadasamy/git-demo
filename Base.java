public class Base extends SuperClass{
    private int k, l = 90;

    // Default Constructor
    Base() {
        // Order of execution
        // SuperClass constructor is called here --->
        System.out.println("Base Constructor");
    }

    // Getters and Setters
    public int getK() {
        return k;
    }
    public void setK(int k) {
        this.k = k;
    }
    public int getL() {
        return l;
    }
    public void setL(int l) {
        this.l = l;
    }

    //Common method in all classes to demonstrate which method will be called from the derived class
    public void myMethod(){
        System.out.print("Base MyMethod");
        System.out.println(", K and L are: " + k + ", " + l);
    }
    //Common method in Base and SuperClass to demonstrate which method will be called from the derived class
    public void secondMethod(){
        System.out.println("Base SecondMethod");
    }
////////////////
}
