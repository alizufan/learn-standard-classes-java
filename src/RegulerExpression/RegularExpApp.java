package RegulerExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// # Regular Expression
//   - Regular Expression or abbreviated as regex
//     is a way to search patterns.
//   - Usually done to search in String data.
//   - In simple terms, we may have often done text searches,
//     either in a text editor or in the Word application.
//   - Regex is a more advanced search than usual text searches - for example,
//     we want to search for all words that start with the letter a and
//     end with the letter a, etc.
//
// # Regex Package
//   - Java already provides the 'java.util.regex'
//     package which contains utilities for processing regular expressions.
//   - In general, there are 2 classes that we can use,
//     namely the Pattern class and the Matcher class.
//   - The pattern class is a compiled representation of
//     the regular expression patterns that we create.
//   - Matcher class is an engine for searching for
//     patterns that we have created.
//
// # Rules of Regular Expression
//   - Regular expression rules are prosperous,
//     so they probably cannot be discussed in one material.
//   - We can see the detailed rules on
//     the Pattern class javadoc page.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/regex/Pattern.html
//
public class RegularExpApp {
  public static void main(String[] args) {
    String name = "August de Uruguay";

    Pattern pattern = Pattern.compile("[a-zA-Z]*[u][a-zA-Z]*");
    Matcher matcher = pattern.matcher(name);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
