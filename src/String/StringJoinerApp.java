package String;

import java.util.StringJoiner;

// # String Joiner Class
//   - StringJoiner is a class that can be used to create
//     String sequences separated by delimiters.
//   - StringJoiner also supports prefixes and suffixes if we want to add them.
//   - This is exceptional when there are cases.
//     For example, we want to print an Array in the format we want.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/StringJoiner.html.
//
public class StringJoinerApp {
  public static void main(String[] args) {
    String[] names = {"August", "d", "Destiny"};
    StringJoiner joiner = new StringJoiner(
            ",", "[", "]"
    );

    for(var name: names) {
      joiner.add(name);
    }

    System.out.println("Name String Joiner: " + joiner.toString());
  }
}
