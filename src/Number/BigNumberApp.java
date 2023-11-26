package Number;

import java.math.BigInteger;

// # Big Number
//   - If we need to use large numbers that exceed the capacity of Long and Double,
//     Java has provided classes to handle such large data.
//   - BigInteger is a class for handling the Integer data type.
//   - BigDecimal is a class for handling floating point data types.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/math/BigInteger.html
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/math/BigDecimal.html
//
// # Method BigInteger And BigDecimal
//   --------------------------
//   | Method     |  Operator |
//   --------------------------
//   | add()      |     +     |
//   | subtract() |     -     |
//   | multiply() |     *     |
//   | divide()   |     /     |
//   | mod()      |     %     |
//   | etc.       |           |
//   --------------------------
//
public class BigNumberApp {
  public static void main(String[] args) {
    // error: Long number too large
    // Long v = 10_000_000_000_000_000_000L;

    BigInteger a = new BigInteger("10000000000000000000");
    BigInteger b = new BigInteger("10000000000000000000");

    BigInteger c = a.add(b);
    System.out.println(c);
  }
}
