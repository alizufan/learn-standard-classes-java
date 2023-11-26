package Number;

// # Number Class
//   - All non-primitive number classes have the same parent class,
//     namely the Number class.
//   - The number class has many methods that
//     can be used to convert to other number types.
//   - This makes it easier for us to convert object
//     numbers from one type to another number type.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Number.html.
//
// # Method Number Class
//   -------------------------------------------------
//   | Method                | Description           |
//   -------------------------------------------------
//   | byte byteValue()      | Converts to byte type |
//   | double doubleValue()  | Change to double type |
//   | float floatValue()    | Change to float type  |
//   | int intValue()        | Change to int type    |
//   | long longValue()      | Change to long type   |
//   | short shortValue()    | Change to short type  |
//   -------------------------------------------------
//
// # Convert String to Number
//   - Long, Integer, Short and Byte have static methods to convert from String to number.
//   - parseXxx(string) is used to convert from string to primitive number data type.
//   - valueOf(string) is used to convert from string to non-primitive number data type.
//   - This method will throw NumberFormatException if it fails to convert String to number.
//
public class NumberApp {
  public static void main(String[] args) {
    Integer intValue = 10;

    Long longValue = intValue.longValue();
    Double doubleValue = longValue.doubleValue();
    Short shortValue = doubleValue.shortValue();

    String numberString = "1000";
    Integer integerVal = Integer.valueOf(numberString);
    System.out.println(integerVal);


    // # Error
    // "100.10", it will error even it's float number.
    // String numberStringError = "10A00";
    // Integer integerError = Integer.valueOf(numberStringError);
    // System.out.println(integerError);

    String floatNumberString = "100.10";
    Double doubleVal = Double.valueOf(floatNumberString);
    System.out.println(doubleVal);

  }
}
