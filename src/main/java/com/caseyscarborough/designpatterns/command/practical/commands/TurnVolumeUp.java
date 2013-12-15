package commandpattern.commands;

import commandpattern.receivers.Device;

/**
 * This is one of our ConcreteCommands in the Command
 * Pattern. This is used to turn a device's volume up.
 */
public class TurnVolumeUp extends Command {

  public TurnVolumeUp(Device device) {
    super(device);
  }

  @Override
  public void execute() {
    device.volumeUp();
  }

  @Override
  public void undo() {
    device.volumeDown();
  }

}
