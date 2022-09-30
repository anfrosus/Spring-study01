public abstract class Transport {
    static int cnt = 0;
    int num;
    String type = "대중교통";
    int fuel = 100;
    int speed;
    boolean runEnd = true;
    int maxPassenger;
    int passengerNow;
    int totalFare;
    int seatsNow;


    void run(){
        if (fuel >= 10) {
            System.out.println(type + num + " 운행 시작!!");
            runEnd = true;
        }else {
            runEnd = false;
            System.out.println("!주유가 필요합니다!");
        }
    }

    void end(){
        System.out.println(type + num + " 운행 종료!!");
        this.passengerNow = 0;
        runEnd = false;
    }

    void refuel (int fuel){
        this.fuel += fuel;
        if (this.fuel < 10){
            System.out.println("!주유가 필요합니다!");
            end();
        }
    }

    void changeSpd(int speed){
        if (fuel >= 10) {
            this.speed += speed;
            System.out.println(type + num + "속도 변경 : " + this.speed);
        }else {
            System.out.println("!주유가 필요합니다!");
            end();
        }
    }

    abstract void board(int numOfPassengers);

    void printStatus() {
        System.out.println("=== " + type + num + " 운행 여부 : " + (runEnd ? "운행중" : "차고지행") + " ===");
        System.out.println("연료 : " + fuel);
        if(fuel < 10) {
            System.out.println("!주유가 필요합니다!");
        }
    }
}

