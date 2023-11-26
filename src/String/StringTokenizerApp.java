package String;

import java.util.StringTokenizer;

// # String Tokenizer Class
//   - StringTokenizer class is a class that can be used to cut strings
//     into tokens or smaller strings.
//   - We can cut the String with the delimiter we want.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/StringTokenizer.html.
//
public class StringTokenizerApp {
  public static void main(String[] args) {
    String name = "August de Destiny";
    StringTokenizer tokenizer = new StringTokenizer(name, " ");

    while (tokenizer.hasMoreTokens()) {
      String token = tokenizer.nextToken();
      System.out.println(token);
    }

  }
}
