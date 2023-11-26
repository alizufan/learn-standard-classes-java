package ArraysClass;

import java.util.Arrays;

// # Arrays Class
//   - The Arrays class is a class that contains static
//     methods that we can use to manipulate array data,
//     such as searching and sorting.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html
//
// # Method Arrays Class
//   ------------------------------------------------------------------
//   | Method                     | Description                       |
//   ------------------------------------------------------------------
//   | binarySearch(array, value) | Search for values in the array    |
//   | copyOf(...)                | Copying array data                |
//   | equals(array1, array2)     | Comparing array1 and array2       |
//   | sort(array)                | Sorting arrays                    |
//   | toString(array)            | Returns an string representation  |
//   | etc.                       |                                   |
//   ------------------------------------------------------------------
//
public class ArraysApp {
  public static void main(String[] args) {
    int[] numbers = {
            1, 4, 234, 5, 6, 19, 5, 67, 4, 5, 67, 4, 6, 7
    };

    System.out.println("\nTry to sort a data");
    System.out.println("Original: " + Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println("Result  : " + Arrays.toString(numbers));

    System.out.println("\nTry to look for data with binary search");
    System.out.println("Result Find Key '7'  : " + Arrays.binarySearch(numbers, 7));
    System.out.println("Result Find Key '234': " + Arrays.binarySearch(numbers, 234));

    System.out.println("\nTry to look for data with binary search that doesn't exist");
    // what if we look for data that doesn't exist.
    System.out.println("Result Find Key '100': " + Arrays.binarySearch(numbers, 100));

    System.out.println("\nTry to copy of a data");
    int[] resultFrom = Arrays.copyOf(numbers, 5);
    System.out.println("Result: " + Arrays.toString(resultFrom));

    System.out.println("\nTry to copy of range a data ");
    int[] resultFromRange = Arrays.copyOfRange(numbers, 5, 10);
    System.out.println("Result: " + Arrays.toString(resultFromRange));
  }
}
