package UUID;

import java.util.UUID;

// # UUID Class
//   - When creating an application, sometimes we have cases where we want
//     to create unique data, for example for primary key data needs, for example.
//   - Java provides a UUID class or
//     an abbreviation for Universally Unique Identifier.
//   - UUID is a standard format for creating guaranteed unique values.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/UUID.html
//   - https://www.ietf.org/rfc/rfc4122.txt
//
public class UUIDApp {
  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      UUID uuid = UUID.randomUUID();
      System.out.println(uuid);
    }

  }
}
