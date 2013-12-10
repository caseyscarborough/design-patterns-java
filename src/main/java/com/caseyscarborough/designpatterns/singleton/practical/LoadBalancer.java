package com.caseyscarborough.designpatterns.singleton.practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Singleton Practical Example
 *
 * This example is a practical use of the Singleton Design Pattern. It
 * is a load balancer used to direct traffic to different servers to
 * balance out its load.
 * This example roughly follows the C# Singleton example from dofactory.
 */
public class LoadBalancer {

  // Private LoadBalancer instance.
  private static LoadBalancer instance;

  // An ArrayList to store available servers in.
  private List<Server> servers = new ArrayList<Server>();

  // Random number generator.
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
    if (instance == null) {
      instance = new LoadBalancer();
    }
    return instance;
  }

  // Randomly select and return a server from the servers ArrayList.
  public Server getServer() {
    int r = random.nextInt(servers.size());
    return servers.get(r);
  }

}
