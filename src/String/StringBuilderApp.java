package String;

// # StringBuffer vs StringBuilder
//   - The capabilities of StringBuffer and StringBuilder are quite the same,
//     they can be used to manipulate Strings.
//   - The difference is, StringBuffer is thread safe,
//     while StringBuilder is not thread safe.
//   - If we want to manipulate Strings in parallel at the same time,
//     it is recommended to use StringBuffer, but if we don't need parallels, just use StringBuilder.
//   - Because StringBuffer is made to be thread safe,
//     it automatically performs slower than StringBuilder.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuffer.html
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuilder.html
//
public class StringBuilderApp {
  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    builder.append("August");
    builder.append(" ");
    builder.append("Destiny");

    String fullName = builder.toString();
  }
}
