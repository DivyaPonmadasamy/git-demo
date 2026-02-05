import java.util.Scanner;

public class Derived extends Base implements PlanInterface{
    private int k = 10, l = 20;

    //Default constuctor
    Derived(){
        //Order of execution
        //Base class constructor is called here --->
        System.out.println("Derived constructor");
    }
    //Parameterized construcor
    Derived(int k, int l){
        this.k = k;         //this - current object
        this.l = l;
        System.out.println("Dervied Constructor with paramters");
    }
    //Getters and Setters
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
    //Common method in all classes to demonstrate which method will be called from the base class
    public void myMethod(){
        System.out.print("Derived MyMethod");
        System.out.println(", K and L are: " + k + ", " + l);
    }
    
    //Implemented method from the Interface
    @Override
    public boolean evenOrOdd(int number) {
        if(number%2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        boolean result;

        Derived d1 = new Derived();             //Creating default object
        Derived d2 = new Derived(50, 60);   //Creating parameterized object
        //Derived d3 = new Derived();

        d1.myMethod();                          //All three classes methods
        d1.secondMethod();                      //Base and SuperClass methods

        System.out.print("Enter the number to find if it's even or odd: ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        result = d1.evenOrOdd(num);             //Implemented method from the Interface
        if(result == true)
            System.out.println(num + " is Even number");
        else
            System.out.println(num + " is Odd number");

        d2.myMethod();                          //Parameterized constructor changing k and l values
        scn.close();
    }
}
