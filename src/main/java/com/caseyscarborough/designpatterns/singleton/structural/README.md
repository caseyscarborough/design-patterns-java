# Structural Singleton Example

The classes located in this directory make up the structural example for the Singleton Design Pattern. There are two main classes:

* [Singleton](https://github.com/caseyscarborough/design-patterns-java/blob/master/src/main/java/com/caseyscarborough/designpatterns/singleton/structural/Singleton.java) - The implementation of the Singleton Design Pattern.
* [Main](https://github.com/caseyscarborough/design-patterns-java/blob/master/src/main/java/com/caseyscarborough/designpatterns/singleton/structural/Main.java) - The main "driver" for the sample application.

The Singleton class is a basic Singleton, containing the following implementation:

> _Note: See the source files for additional documentation._

```java
public class Singleton {
  private static Singleton instance;

  // Singleton uses a private or protected constructor.
  private Singleton() { }

  public static Singleton getInstance() {
    if (instance == null)
      instance = new Singleton();
      
    return instance;
  }
}
```

And the Main class uses the Singleton in the following manner:

```java
public class Main {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    if (s1 == s2) {
      System.out.println("Objects are the same instance.");
    }
  }
}
```

The output of the program shows that only one instance is ever created from our Singleton class:

```bash
Objects are the same instance.
```