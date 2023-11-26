package Math;

// # Math Class
//   - The Math class is a utilities class that contains many
//     static methods for numerical operations, such as trigonometric,
//     logarithms, square roots, and others.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Math.html
//
// # Method Math Class
//   ------------------------------------------------------------
//   | Method                 | Description                     |
//   ------------------------------------------------------------
//   | double cos(double)     | Calculating cos in trigonometry |
//   | double sin(double)     | Calculating sin in trigonometry |
//   | double tan(double)     | Calculating tan in trigonometry |
//   | min(number1, number2)  | Take the smallest value         |
//   | max(number1, number2)  | Take the largest value          |
//   | etc.                   |                                 |
//   -------------------------------------------------
//
public class MathApp {
  public static void main(String[] args) {
    var min = Math.min(1000, 2000);
    System.out.println(min);

    var max = Math.max(1000, 2000);
    System.out.println(max);

    System.out.println(Math.PI);
  }
}
