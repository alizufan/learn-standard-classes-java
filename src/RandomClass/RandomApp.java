package RandomClass;

import java.util.Random;

// # Random Class
//   - Random class is a class that we can use to
//     generate random numbers
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html
//
public class RandomApp {
  public static void main(String[] args) {
    Random random = new Random();

    for (int i = 0; i < 1000; i++) {
      var value = random.nextInt(1000);
      System.out.println(value);
    }
  }
}
