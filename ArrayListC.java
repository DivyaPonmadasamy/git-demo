import java.util.ArrayList;

public class ArrayListC {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int num = 5;
        for (int i = 0; i < 5; i++) {
            num += num;
            al.add(num); // adding - concatenation
        }
        System.out.print("\nInitial original: ");
        for (Integer i : al) {
            System.out.print(i + " ");
        }
        al.addFirst(1); // add first
        al.addLast(100); // add last
        al.set(3, 26); // add at specified position

        ArrayList<Integer> al2 = new ArrayList<>(); // second array
        al2 = (ArrayList) al.clone(); // makes only shallow copy //cloning

        System.out.print("\nInitial cloned: ");
        for (Integer i : al2) {
            System.out.print(i + " ");
        }
        al2.set(5, 246);
        al2.remove(2); // remove
        al2.removeIf(n -> n == 10); // removeIf
        System.out.print("\nFor each: ");
        al.set(6, 546);
        al.add(3245);
        al.forEach(n -> {if(n%10 == 0) System.out.print(n + " ");});   //forEach 
        System.out.print("\nClass name: " + al2.getClass());

        System.out.print("\nArray original: ");
        for (int i = 0; i < al.size(); i++) { // finding size of the array
            System.out.print(al.get(i) + " "); // get an element
        }
        if (!al2.isEmpty()) {
            System.out.print("\nArray cloned: ");
        }
        for (Integer i : al2) {
            System.out.print(i + " ");
        }
    }
}
