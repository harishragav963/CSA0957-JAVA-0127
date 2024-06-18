public class Main{

    // Method to insert an element into an array
    public static int[] insert(int[] arr, int num, int pos) {
        // Create a new array one size larger
        int[] newArr = new int[arr.length + 1];

        // Copy elements up to the position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert the number at the position
        newArr[pos] = num;

        // Copy the rest of the elements
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    // Main method to test the insert method
    public static void main(String[] args) {
        // Original array
        int[] arr = {1, 2, 3, 5, 6};
        // Number to insert
        int num = 4;
        // Position to insert the number
        int pos = 3;

        // Insert the number and get the new array
        int[] newArr = insert(arr, num, pos);

        // Print the new array
        System.out.println("Array after insertion:");
        for (int value : newArr) {
            System.out.print(value + " ");
        }
    }
}
