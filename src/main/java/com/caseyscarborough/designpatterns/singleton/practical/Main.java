package com.caseyscarborough.designpatterns.singleton.practical;

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
