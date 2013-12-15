package commandpattern.commands;

import commandpattern.receivers.Device;

/**
 * This is our Command abstract class. All ConcreteCommands
 * will implement this class, requiring them to implement
 * the methods in the interface.
 */
public abstract class Command {

  /**
   * This is the device (Receiver) that we will
   * perform our command on.
   */
  protected Device device;

  /**
   * The default constructor. Sets the device
   * (Receiver) for the Command to be executed on.
   * @param device
   */
  public Command(Device device) {
    this.device = device;
  }

  /**
   * Every command must implement an execute method.
   */
  public abstract void execute();

  /**
   * Every command must also be able to undo a command.
   */
  public abstract void undo();

}
