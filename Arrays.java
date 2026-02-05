public class Arrays {
    // Function to print the array
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // or for(int i : arr){ //New version
            System.out.print(arr[i] + " "); // or System.out.print(i + " "); //New version
        }
    }

    // Function to find minimum number
    public int findMin(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i])
                arr[0] = arr[i];
        }
        return arr[0];
    }

    // Function to find maximum number
    public int findMax(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] < arr[i])
                arr[0] = arr[i];
        }
        return arr[0];
    }

    // Function to sort the integer elements in an array
    public void bubbleSort(int[] bSort) {
        int temp;
        for (int i = 0; i < bSort.length - 1; i++) { // no of elements
            for (int j = 0; j < bSort.length - i - 1; j++) { // no of comparisons
                if (bSort[j] > bSort[j + 1]) {
                    temp = bSort[j];
                    bSort[j] = bSort[j + 1];
                    bSort[j + 1] = temp;
                }
            }
        }
    }

    // Function to find if the number is a prime number
    public boolean findPrime(int number) {
        boolean result = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    // Function to find if the number is an armstrong number
    public boolean armStrongNumber(int number) {
        int sod = 0, power = 0;
        boolean result = false;

        for (int i = number; i != 0; i /= 10) { // find number of digits
            power++;
        }
        for (int i = number; i != 0; i /= 10) {
            // sod = sod + ((i % 10) * (i % 10) * (i % 10));
            sod = sod + (int) Math.pow(i % 10, power);
        }
        if (Math.abs(number) == sod && number != 0)
            result = true;
        return result;
    }

    public static void main(String[] args) {
        Arrays a = new Arrays();

        // ARMSTRONG NUMBERS USING ARRAY
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, and 9474
        int[] armNumber = { 0, -3, 3, 213, 344, 153, 407, 345, 8208, 2343 };

        System.out.print("The Array: ");
        a.printArray(armNumber);

        System.out.print("\nThe Armstrong numbers in an array are: ");
        for (int j = 0; j < armNumber.length; j++) {
            if (a.armStrongNumber(armNumber[j]))
                System.out.print(armNumber[j] + " ");
        }

        // BUBBLE SORT USING ARRAY
        int[] bSort = { 5, 4, 3, 2, 1 };
        System.out.print("\n\nThe Array to sort: ");
        a.printArray(bSort);

        a.bubbleSort(bSort); // call bubble sort function

        System.out.print("\nSorted Array: ");
        a.printArray(bSort);

        // SMALLEST AND LARGEST NUMBER IN AN ARRAY
        int[] arr = { 23, 45, 2, 65, 25, 76, 93, 34, 5, 11 };

        System.out.print("\n\nThe Array: ");
        a.printArray(arr);

        // a.bubbleSort(arr);

        System.out.println("\nThe smallest number: " + a.findMin(arr));
        System.out.println("The largest number: " + a.findMax(arr));

        // PRIME NUMBERS IN AN ARRAY
        System.out.print("Prime Numbers: ");
        for (int i : arr) {
            if (a.findPrime(i))
                System.out.print(i + " ");
        }
    }
}