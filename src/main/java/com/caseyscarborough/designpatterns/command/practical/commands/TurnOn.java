package commandpattern.commands;

import commandpattern.receivers.Device;

/**
 * This is one of our ConcreteCommands in the Command
 * Pattern. This is used to turn a device on.
 */
public class TurnOn extends Command {

  public TurnOn(Device device) {
    super(device);
  }

  @Override
  public void execute() {
    device.on();
  }

  @Override
  public void undo() {
    device.off();
  }

}
