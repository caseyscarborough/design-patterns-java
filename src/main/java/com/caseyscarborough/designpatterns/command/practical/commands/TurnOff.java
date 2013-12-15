package commandpattern.commands;

import commandpattern.receivers.Device;

/**
 * This is one of our ConcreteCommands in the Command
 * Pattern. This is used to turn a device off.
 */
public class TurnOff extends Command {

  public TurnOff(Device device) {
    super(device);
  }

  @Override
  public void execute() {
    device.off();
  }

  @Override
  public void undo() {
    device.on();
  }

}
