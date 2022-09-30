public class Bus extends Transport{
    final int BUS_FARE = 1000;



    public Bus() {
        super.type = "버스";
        super.maxPassenger = 30;
        num = cnt++;
    }

    @Override
    void end() {
        super.end();
        totalFare = 0;
    }

    @Override
    void board(int numOfPassengers) {
        seatsNow = maxPassenger - passengerNow;
        if (runEnd && seatsNow >= numOfPassengers){
            totalFare += BUS_FARE * numOfPassengers;
            passengerNow += numOfPassengers;
            System.out.println(numOfPassengers + "명 탑승");
        }else {
            System.out.println("정원 초과 ! 탑승 불가능 합니다.");
        }
    }

    @Override
    void printStatus() {
        super.printStatus();
        System.out.println("승객 현황 : " + passengerNow + " / " + maxPassenger);
        System.out.println("요금 확인 : " + totalFare);
    }
}
