package com.caseyscarborough.designpatterns.command.structural;

/**
 * The invoker asks the command to carry out the request.
 * It is bound to one specific command at any given time.
 */
public class Invoker {

  // Binding to command.
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void executeCommand() {
    this.command.execute();
  }

  // "Shortcut" method to set the command and
  // execute it at the same time.
  public void executeCommand(Command command) {
    this.setCommand(command);
    this.executeCommand();
  }

}