public class LargestNumberInArray {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {45, 72, 8, 56, 23, 91, 12};

        // Call the function to find the largest number
        int largest = findLargest(numbers);

        // Output the result
        System.out.println("The largest number in the array is: " + largest);
    }

    // Function to find the largest number in the array
    public static int findLargest(int[] array) {
        // Assume the first element is the largest
        int largest = array[0];

        // Traverse through the array to find the largest number
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Return the largest number found
        return largest;
    }
}

