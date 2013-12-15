package commandpattern.invokers;

import commandpattern.commands.Command;

/**
 * This is our Invoker. It handles the execution of the
 * command. It knows nothing about the command, or the
 * device that it is executing the command on.
 */
public class DeviceButton {

  private Command command;

  public DeviceButton(Command command) {
    this.command = command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void press() {
    command.execute();
  }

  public void pressUndo() {
    command.undo();
  }

}
