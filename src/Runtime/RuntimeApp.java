package Runtime;

// # Runtime Class
//  - When our Java application is running,
//    we can see information about the environment
//    where the Java application is running
//  - That information is contained in the Runtime class.
//  - Runtime classes cannot be created,
//    Java will automatically create a single object.
//    We can access this object using the static method getRuntime()
//    belonging to the Runtime class.
//  - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Runtime.html
//
// # Method Runtime Class
//   ------------------------------------------------------------------------------
//   | Method                     | Description                                   |
//   ------------------------------------------------------------------------------
//   | int availableProcessors()  | Gets the number of CPU cores                  |
//   | long freeMemory()          | Get the amount of free memory in the JVM      |
//   | long totalMemory()         | Gets the total amount of memory in the JVM    |
//   | long maxMemory()           | Gets the maximum amount of memory in the JVM  |
//   | void gc()                  | Run a garbage collector to delete             |
//   |                            | data in memory that is no longer used         |
//   ------------------------------------------------------------------------------
//
public class RuntimeApp {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();

    System.out.println(runtime.availableProcessors());
    System.out.println(runtime.freeMemory());
    System.out.println(runtime.totalMemory());
    System.out.println(runtime.maxMemory());
  }
}
