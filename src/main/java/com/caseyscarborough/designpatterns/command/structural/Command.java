package com.caseyscarborough.designpatterns.command.structural;

/**
 * This is the Command interface. It sets the rules
 * that each command will have to follow. In this case,
 * every command must have an execute method.
 */
public interface Command {

  public void execute();

}