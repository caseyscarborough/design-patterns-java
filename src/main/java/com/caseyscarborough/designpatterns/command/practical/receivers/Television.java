package commandpattern.receivers;

/**
 * This is our actual receiver. It implements the methods
 * defined in the Device abstract class. This class (Receiver)
 * holds the information needed to execute the actual commands.
 */
public class Television extends Device {

  @Override
  public void on() {
    System.out.println("TV is now on.");
  }

  @Override
  public void off() {
    System.out.println("TV is now off.");
  }

  @Override
  public void volumeUp() {
    this.volume++;
    System.out.println("TV volume: " + this.volume);
  }

  @Override
  public void volumeDown() {
    this.volume--;
    System.out.println("TV volume: " + this.volume);
  }

}
