package Base64;

import java.util.Base64;

// # Base64 Class
//   - Since Java 8, Java has provided classes for base64 encoding.
//   - Web programmers definitely know about base64,
//     which is an encoding that can be used to convert binary data to safe text.
//   - Safe here is not from a security perspective,
//     but safe from parsing errors.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Base64.html
//   - https://www.ietf.org/rfc/rfc4648.txt
public class Base64App {
  public static void main(String[] args) {
    String query = "You Base64 Dude! Haha!";

    String encode = Base64.getEncoder().encodeToString(query.getBytes());
    System.out.println(encode);

    System.out.println();

    String decode = new String(Base64.getDecoder().decode(encode));
    System.out.println(decode);
  }
}
