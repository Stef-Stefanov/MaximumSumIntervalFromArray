import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * This program finds the maximum sum interval in an array read from a text file.
 * The maximum sum interval is the pair of indexes (i, j) such that the sum of
 * array values from i to j is maximized.
 */
public class MaxSumInterval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the location of the text file
        System.out.print("Enter the location of the text file: ");
        String filePath = scanner.nextLine();

        // Read array from the file
        try {
            double[] array = readArrayFromFile(filePath);
            if (array == null || array.length < 3) {
                System.out.println("Invalid input. Program will terminate.");
                return;
            }

            // Find the maximum sum interval
            Result result = findMaxSumInterval(array);

            // Output the result
            System.out.println("Maximum Sum: " + result.maxSum);
            System.out.println("Start Index: " + result.startIndex);
            System.out.println("End Index: " + result.endIndex);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file. Program will terminate.");
        }
    }

    /**
     * Reads the array from the specified file.
     * @param filePath The path to the text file.
     * @return The array of double values read from the file, or null if the input is invalid.
     * @throws IOException If an error occurs while reading the file.
     */
    private static double[] readArrayFromFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String firstLine = br.readLine();
        String secondLine = br.readLine();

        if (firstLine == null || secondLine == null) {
            return null;
        }

        try {
            int n = Integer.parseInt(firstLine.trim());
            String[] numberStrings = secondLine.trim().split("\\s+");
            if (numberStrings.length != n) {
                return null;
            }

            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = Double.parseDouble(numberStrings[i]);
            }

            return array;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Finds the maximum sum interval in the array.
     * @param array The input array.
     * @return A Result object containing the maximum sum and the start and end indexes of the interval.
     */
    public static Result findMaxSumInterval(double[] array) {
        int arrayLength = array.length;

        double maxSum = array[0];
        double currentSum = array[0];
        int startInd = 0;
        int currentStartInd = 0;
        int endInd = 0;

        for (int i = 1; i < arrayLength; i++) {
            if (currentSum + array[i] > array[i]) {
                currentSum += array[i];
            } else {
                currentSum = array[i];
                currentStartInd = i;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startInd = currentStartInd;
                endInd = i;
            }
        }

        return new Result(maxSum, startInd, endInd);
    }

    /**
     * A class to store the result of the maximum sum interval computation.
     */
    static class Result {
        double maxSum;
        int startIndex;
        int endIndex;

        /**
         * Constructs a Result object.
         * @param maxSum The maximum sum of the interval.
         * @param startIndex The start index of the interval.
         * @param endIndex The end index of the interval.
         */
        public Result(double maxSum, int startIndex, int endIndex) {
            this.maxSum = maxSum;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }
}
