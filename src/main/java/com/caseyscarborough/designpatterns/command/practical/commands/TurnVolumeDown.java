package commandpattern.commands;

import commandpattern.receivers.Device;

/**
 * This is one of our ConcreteCommands in the Command
 * Pattern. This is used to turn a device's volume up.
 */
public class TurnVolumeDown extends Command {

  public TurnVolumeDown(Device device) {
    super(device);
  }

  @Override
  public void execute() {
    device.volumeDown();
  }

  @Override
  public void undo() {
    device.volumeUp();
  }

}
