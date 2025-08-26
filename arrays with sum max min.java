public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Traditional for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Enhanced for loop
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Calculate sum, max, and min
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            sum += num; // add each number to sum
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
