# Structural Practical Example

The classes located in this directory make up the structural example for the Singleton Design Pattern. There are two main classes:

* [LoadBalancer](https://github.com/caseyscarborough/design-patterns-java/blob/master/src/main/java/com/caseyscarborough/designpatterns/singleton/practical/LoadBalancer.java) - This class is a simple implementation of a [load balancer](http://en.wikipedia.org/wiki/Load_balancing_(computing)), and serves as the __Singleton__ in this example.
* [Server](https://github.com/caseyscarborough/design-patterns-java/blob/master/src/main/java/com/caseyscarborough/designpatterns/singleton/practical/Server.java) - This is a simple class representing a server with two properties, a name and an IP address.
* [Main](https://github.com/caseyscarborough/design-patterns-java/blob/master/src/main/java/com/caseyscarborough/designpatterns/singleton/practical/Main.java) - This is the main _driver_ for the application.

> Note: Some explanations are show here, but see the source files for further documentation.

The [LoadBalancer](https://github.com/caseyscarborough/design-patterns-java/blob/master/src/main/java/com/caseyscarborough/designpatterns/singleton/practical/LoadBalancer.java) class is shown here:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {

  // Private LoadBalancer instance.
  private static LoadBalancer instance;

  // An ArrayList to store available servers in.
  private List<Server> servers = new ArrayList<Server>();

  private Random random = new Random();

  private LoadBalancer() {
    // Add five servers to our servers ArrayList.
    servers.add(new Server("Server A", "123.456.1.12"));
    servers.add(new Server("Server B", "123.456.4.27"));
    servers.add(new Server("Server C", "123.456.0.91"));
    servers.add(new Server("Server D", "123.456.91.2"));
    servers.add(new Server("Server E", "123.456.8.66"));
  }

  public static LoadBalancer getInstance() {
    // Lazily instantiate the LoadBalancer.
    if (instance == null)
      instance = new LoadBalancer();
    return instance;
  }

  // Randomly select and return a server from the servers ArrayList.
  public Server getServer() {
    int r = random.nextInt(servers.size());
    return servers.get(r);
  }
}
```

The following is the simple server implementation used in the LoadBalancer class:

```java
public class Server {
  private String name;
  private String ipAddress;

  public Server(String name, String ipAddress) {
    this.name = name;
    this.ipAddress = ipAddress;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }
}
```

And the Main class uses the LoadBalancer in the following manner:

```java
public class Main {
  public static void main(String[] args) {

    // Retrieve the LoadBalancer instance four times.
    LoadBalancer lb1 = LoadBalancer.getInstance();
    LoadBalancer lb2 = LoadBalancer.getInstance();
    LoadBalancer lb3 = LoadBalancer.getInstance();
    LoadBalancer lb4 = LoadBalancer.getInstance();

    // Show that they are all the same instance.
    if (lb1 == lb2 && lb2 == lb3 && lb3 == lb4) {
      System.out.println("All instances are the same instance.");
    }

    LoadBalancer balancer = LoadBalancer.getInstance();

    // Show the load balancing functionality.
    for (int i = 0; i < 10; i++) {
      Server server = balancer.getServer();
      System.out.printf("Request was sent to %s at IP Address %s.\n",
          server.getName(), server.getIpAddress());
    }
  }
}
```

The output of the program is shown below:

```bash
All instances are the same instance.
Request was sent to Server A at IP Address 123.456.1.12.
Request was sent to Server D at IP Address 123.456.91.2.
Request was sent to Server E at IP Address 123.456.8.66.
Request was sent to Server E at IP Address 123.456.8.66.
Request was sent to Server D at IP Address 123.456.91.2.
Request was sent to Server E at IP Address 123.456.8.66.
Request was sent to Server B at IP Address 123.456.4.27.
Request was sent to Server B at IP Address 123.456.4.27.
Request was sent to Server C at IP Address 123.456.0.91.
Request was sent to Server C at IP Address 123.456.0.91.
```