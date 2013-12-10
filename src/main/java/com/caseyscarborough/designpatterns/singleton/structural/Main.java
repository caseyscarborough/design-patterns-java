package com.caseyscarborough.designpatterns.singleton.structural;

public class Main {

  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    if (s1 == s2) {
      System.out.println("Objects are the same instance.");
    }
  }

}
