package com.caseyscarborough.designpatterns.command.structural;

/**
 * The receiver is the object which the action is being
 * performed on. It knows how to perform the operations
 * associated with carrying out the request.
 */
public class Receiver {

  public void action() {
    System.out.println("Receiver.action() method has been called.");
  }

}
