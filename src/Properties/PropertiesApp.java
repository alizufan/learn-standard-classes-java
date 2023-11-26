package Properties;

import java.io.*;
import java.util.Properties;

// # Properties File
//   - Most Java applications will save configuration files in
//     the form of a properties file.
//   - The properties file is a file that contains
//     key values separated by an equal sign (=).
//   - We can use the properties file to store our
//     application configuration.
//
// # Properties Class
//   - Properties Class is a class that we can use to retrieve or
//     save information to a properties file.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Properties.html
//
public class PropertiesApp {
  public static void main(String[] args) {
    try {
      Properties properties = new Properties();
      properties.load(new FileInputStream("application.properties"));

      var host = properties.getProperty("database.host");
      var port = properties.getProperty("database.port");
      var username = properties.getProperty("database.username");
      var password = properties.getProperty("database.password");

      System.out.println("host      : " + host);
      System.out.println("port      : " + port);
      System.out.println("username  : " + username);
      System.out.println("password  : " + password);

      System.out.println("success to gets a properties!");
    } catch (FileNotFoundException exception) {
      System.out.println("file not found");
    } catch (IOException exception) {
      System.out.println("failed to load file");
    }

    System.out.println();

    try {
      Properties properties = new Properties();
      properties.put("app.name", "Learn Java Classes");
      properties.put("app.description", "Learn Java Standard Classes Library");
      properties.put("database.host", "localhost");
      properties.put("database.port", "9999");
      properties.put("database.username", "admin");
      properties.put("database.password", "secret");

      properties.store(new FileOutputStream("application.properties"),"App Configuration Files");

      System.out.println("app.name           : Learn Java Classes");
      System.out.println("app.description    : Learn Java Standard Classes Library\n");
      System.out.println("database.host      : localhost");
      System.out.println("database.port      : 9999");
      System.out.println("database.username  : admin");
      System.out.println("database.password  : secret");
      System.out.println("success to put a properties!");
    } catch (FileNotFoundException exception) {
        System.out.println("failed to create file properties");
    } catch (IOException exception) {
      System.out.println("failed to save properties file");
    }

  }
}
