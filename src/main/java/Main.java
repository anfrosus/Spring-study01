public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        bus1.printStatus();
        bus2.printStatus();

//
//        bus1.board(2);
//        bus1.printStatus();
//        bus1.refuel(-50);
//        bus1.end();
//        bus1.refuel(10);
//        bus1.run();
//        bus1.board(45);
//        bus1.board(5);
//        bus1.printStatus();
//        bus1.refuel(-55);
//        bus1.printStatus();

        Taxi taxi1 = new Taxi(2, "서울역", 2);
        taxi1.printStatus();
//        taxi1.printStatus();
//        taxi1.refuel(-80);
//        taxi1.pay();
//        taxi1.printStatus();
//        taxi1.board(5);
//        taxi1.board(3, "구로디지털단지역", 12);
//        taxi1.printStatus();
//        taxi1.refuel(-20);
//        taxi1.pay();
//        taxi1.printStatus();
    }
}
