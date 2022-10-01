package pack1;

public class Taxi extends Transport implements Pay {
    String destination;
    int distToDestination;
    int basicDist = 1;
    int farePerDist = 1000;
    int basicFare = 3000;
    String[] stat = {"빈차", "탑승중", "운행불가"};
    String status = stat[0];
    int fareToPaid;


    public Taxi(){
        super.type = "택시";
        super.maxPassenger = 4;
        num = cnt++;
    }
    public Taxi(int numOfPassengers, String destination, int distToDestination){
        super.type = "택시";
        super.maxPassenger = 4;
        super.passengerNow += numOfPassengers;
        this.destination = destination;
        this.distToDestination = distToDestination;
        this.fareToPaid = basicFare + ((distToDestination-basicDist) * farePerDist);
        num = cnt++;
    }


    @Override
    public void end() {
        super.end();
        status = stat[2];
    }

    @Override
    public void board(int numOfPassengers) {
    }

    public void board(int numOfPassengers, String destination, int distToDestination) {
        if (status == stat[0] && numOfPassengers <= maxPassenger){
            this.passengerNow += numOfPassengers;
            this.destination = destination;
            this.distToDestination = distToDestination;
            this.fareToPaid = basicFare + ((distToDestination-basicDist) * farePerDist);
            status = stat[1];
        }else {
            System.out.println("탑승할 수 없습니다!!");
        }
    }

    @Override
    public void pay() {
        totalFare += fareToPaid;
        fareToPaid = 0;
        destination = "";
        passengerNow = 0;
        status = this.fuel >= 10 ? stat[0] : stat[2];
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("탑승 가능 여부 : " + status);
        System.out.println("기본 요금 : " + basicFare);
        System.out.println("목적지 : " + destination);
        System.out.println("승객 현황 : " + passengerNow + " / " + maxPassenger);
        System.out.println("목적지 까지의 거리 : " + distToDestination);
        System.out.println("지불할 요금 : " + fareToPaid);
        System.out.println("누적 요금 : " + totalFare);

    }


}
