package _17;

public class Driver {

    public static void main(String[] args) {
        
        RemoteControl rcRemote; //rc카 리모컨
        RemoteControl dRemote;  // 드론 리모컨

        RemoteControl rcCar = new RcCar();
        RemoteControl drone = new Drone();

        rcRemote = rcCar;
        dRemote = drone;

    }
}
