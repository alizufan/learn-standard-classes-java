package ObjectsClass;

import java.util.Objects;

// # Objects Class
//   - Be careful not to get confused,
//     this is the Objects class, not Object.
//   - Objects is a utility class that contains
//     many static methods that we can use for object operations or
//     to carry out checks before the operation is carried out.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Objects.html
//
public class ObjectsApp {
  public static class Data {
    private String data;

    Data(String data) {
      this.data = data;
    }

    public String getData() {
      return data;
    }

    public void setData(String data) {
      this.data = data;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) return true;
      if (object == null || getClass() != object.getClass()) return false;

      Data data1 = (Data) object;

      return Objects.equals(data, data1.data);
    }

    @Override
    public int hashCode() {
      return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
      return "Data{" +
              "data='" + data + '\'' +
              '}';
    }
  }

  public static void main(String[] args) {
    // Even with null execute function still running,
    // when we are using an 'Objects' Class.
    // execute(null);
    execute(new Data("August"));
  }

  public static void execute(Data data) {
    // Must be checked if
    // it doesn't error null pointer exception
    // if(data != null) {
    //   System.out.println(data.toString());
    //   System.out.println(data.hashCode());
    // }

    // But the code above checks manually
    // to automatically use the 'Objects' Class
    System.out.println(Objects.toString(data));
    System.out.println(Objects.hashCode(data));
  }
}
