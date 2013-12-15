package commandpattern;

import commandpattern.commands.Command;
import commandpattern.commands.TurnOff;
import commandpattern.commands.TurnOn;
import commandpattern.commands.TurnVolumeUp;
import commandpattern.invokers.DeviceButton;
import commandpattern.receivers.Device;
import commandpattern.receivers.Radio;
import commandpattern.receivers.Television;

public class Main {

  public static void main(String[] args) {

    // Instantiate a new television.
    Device television = new Television();

    // Create a new command to turn on the television.
    Command turnTelevisionOn = new TurnOn(television);

    // Create a new device button and set the command to
    // turn the television on.
    DeviceButton deviceButton = new DeviceButton(turnTelevisionOn);

    // Press the device button (in turn, executing the command).
    deviceButton.press();

    // Make a new command to turn off the television, set
    // the command for the device button, and "press" it.
    Command turnTelevisionOff = new TurnOff(television);
    deviceButton.setCommand(turnTelevisionOff);
    deviceButton.press();

    Command turnTelevisionVolumeUp = new TurnVolumeUp(television);
    deviceButton.setCommand(turnTelevisionVolumeUp);

    // Press the button multiple times, then "press" undo.
    deviceButton.press();
    deviceButton.press();
    deviceButton.press();
    deviceButton.pressUndo();
    deviceButton.pressUndo();

    // Instantiate a radio!
    Device radio = new Radio();

    // Make a command to turn the radio off, since we can
    // just use Spotify.
    Command turnRadioOff = new TurnOff(radio);

    deviceButton.setCommand(turnRadioOff);
    deviceButton.press();

  }
}
