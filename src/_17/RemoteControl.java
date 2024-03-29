package _17;

public interface RemoteControl {
    
    final int MAX_SPEED = 200;
    final int MIN_SPEED = 0;
    
    public void on();
    public void off();

    public void setSpeed(int speed);
    public void changeBattery();
}
