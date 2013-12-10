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
  private List<String> servers = new ArrayList<String>();

  // Random number generator.
  private Random random = new Random();

  private LoadBalancer() {
    // Add five servers to our servers ArrayList.
    servers.add("Server A");
    servers.add("Server B");
    servers.add("Server C");
    servers.add("Server D");
    servers.add("Server E");
  }

  public static LoadBalancer getInstance() {
    // Lazily instantiate the LoadBalancer.
    if (instance == null) {
      instance = new LoadBalancer();
    }
    return instance;
  }

  // Randomly select and return a server from the servers ArrayList.
  public String getServer() {
    int r = random.nextInt(servers.size());
    return servers.get(r);
  }

}
