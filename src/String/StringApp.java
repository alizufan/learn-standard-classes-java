package String;

import java.util.Arrays;

// # String Class
//   - As discussed in the Basic Java material, String is an object,
//     meaning it has a class representation.
//   - There are lots of methods that we can use in String,
//     we can see details of what methods are available on
//     the javadoc documentation page.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html
//
// # Method String Class
//   -----------------------------------------------------------------------------
//   | Method                    | Description                                   |
//   -----------------------------------------------------------------------------
//   | String toLowerCase()      | Create a new string with lower case format    |
//   | String toUpperCase()      | Create a new string with upper case format    |
//   | int length()              | Gets the length of the string                 |
//   | boolean startsWith(value) | Checks whether it starts with a string value  |
//   | boolean endsWith(value)   | Checks whether it ends with a string value    |
//   | String[] split(value)     | Cuts a string with a string value             |
//   -----------------------------------------------------------------------------
//
// # Immutable String
//   - String is an immutable data type, meaning its contents cannot change.
//     When we change a string, what we actually do in Java is create a new String.
//   - If we want to manipulate a large number of Strings,
//     it is not recommended to use Strings, because it will take up quite a lot of memory,
//     for cases like this, it is recommended to use StringBuffer or StringBuilder.
//
public class StringApp {
  public static void main(String[] args) {
    String name = "August Destiny";
    String nameLowercase = name.toLowerCase();
    String nameUppercase = name.toUpperCase();

    System.out.println("Name          : " + name);
    System.out.println("Name Lowercase: " + nameLowercase);
    System.out.println("Name Uppercase: " + nameUppercase);
    System.out.println("Name Length   : " + name.length());

    System.out.println();

    char[]   chars = name.toCharArray();
    String[] names = name.split(" ");
    boolean  start = name.startsWith("August");
    boolean  end   = name.endsWith("Destiny");

    System.out.println("Name Start With 'August': " + start);
    System.out.println("Name End With 'Destiny' : " + end);
    System.out.println("Name Split By Space     : " + Arrays.toString(names));
    System.out.println("Name to Char Array      : " + Arrays.toString(chars));
  }
}
