package com.caseyscarborough.designpatterns.singleton.structural;

/**
 * Singleton Class
 *
 * This class is the only component of the Singleton design pattern.
 * The point of this design pattern is to ensure a class has only one
 * instance and to provide a global point of access to it.
 */
public class Singleton {

  private static Singleton instance;

  // Singleton uses a private or protected constructor.
  private Singleton() { }

  public static Singleton getInstance() {
    // Lazily instantiate our Singleton instance.
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }

}
