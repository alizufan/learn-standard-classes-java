package Scanner;

import java.util.Scanner;

// # Scanner Class
//   - Scanners are actually part of Java IO (Input Output),
//     and this will be discussed in a separate material
//   - But now we will briefly discuss the Scanner class.
//   - Class Scanner has been present since Java 5.
//   - The Scanner class is a class that can be used to read input,
//     whether from files, consoles, etc.
//   - This Scanner class is suitable to be used as an object to read user input
//     when we learn to create Java programs using the console / terminal.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html
//
// # Method Number Class
//   ------------------------------------
//   | Method         | Description     |
//   ------------------------------------
//   | nextLine()     | Reading strings |
//   | nextInt()      | Reading int     |
//   | nextLong()     | Reading long    |
//   | nextBoolean()  | Reading boolean |
//   | etc.           |                 |
//   ------------------------------------
//
public class ScannerApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input Name: ");
    String name = scanner.nextLine();

    // # Note:
    // You can only input integer values,
    // if you input values other than integers,
    // an error will occur.
    System.out.print("Input Age: ");
    int age = scanner.nextInt();

    System.out.println();

    System.out.println("Hello my name is " + name + ", my age is " + age + "yo.");
  }
}
