package _17;

public class RcCar implements RemoteControl{

    int battery;
    double speed = 0;

    @Override
    public void on() {
        System.out.println("전원 ON");
    }
    
    @Override
    public void off() {
        System.out.println("전원 OFF");
    }

    @Override
    public void setSpeed(int speed) {

        // 속력이 양수 값일때,
        if (speed > 0) {
            if (this.speed + speed > MAX_SPEED) {
                this.speed = MAX_SPEED;
                System.out.println("최고 속력을 초과할 수 없습니다.");
                System.out.println("현재 속력: " + this.speed);
    
                return;
            }
            this.speed += speed;
            System.out.println("현재 속력: " + this.speed);
            return;
        }
         // 속력이 음수 값일때,
        else {
            // 계산값이 음수가 뜨면
            if (this.speed - speed < MIN_SPEED) {
                this.speed = MIN_SPEED;
                System.out.println("최저 속력을 초과할 수 없습니다.");
                System.out.println("현재 속력: " + this.speed);
                return;
            }

             // 계산값이 정상적이면 (양수)
            this.speed -= speed;
            System.out.println("현재 속력: " + this.speed);
            return;
        }
        
    }

    @Override
    public void changeBattery() {
        System.out.println("배터리 교체 완료");
        this.battery = 100; // 100퍼센트 충전
        System.out.println("현재 배터리 잔량: " + battery + "%");
    }
    
}
