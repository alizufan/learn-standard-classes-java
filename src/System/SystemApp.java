package System;

// # System Class
//  - The System class is a class that contains many utility static methods in Java,
//    for example, previously we often used the println method belonging to
//    the out field in the System class.
//  - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html
//
// # Method System Class
//   ------------------------------------------------------------------------------
//   | Method                   | Description                                     |
//   ------------------------------------------------------------------------------
//   | String getenv(key)       | Gets the operating system environment variables |
//   | void exit(status)        | Stops Java programs                             |
//   | long currentTimeMilis()  | Gets the current time in milliseconds           |
//   | long nanoTime()          | Gets the current time in nanosecond nature      |
//   | void gc()                | Runs Java garbage collection                    |
//   | etc.                     |                                                 |
//   ------------------------------------------------------------------------------
//
public class SystemApp {
  public static void main(String[] args) {
    System.out.println(System.currentTimeMillis());
    System.out.println(System.nanoTime());
    System.out.println(System.getenv("HOMEPATH"));

    System.gc();

    // 0 = no error;
    // 1 = with error;
    System.exit(0);

    System.out.println("Never Show in Console");
  }
}
