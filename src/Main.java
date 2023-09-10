public class Main {
    public enum Seasons{
        Spring(20){
            @Override
            public String toString() {
                return this.name() + " " + this.getTemp() + " " + getDescription();
            }
        }, Summer(27){
            @Override
            public String getDescription() {
                return "Теплое время года";
            }

            @Override
            public String toString() {
                return this.name() + " " + this.getTemp() + " " + getDescription();
            }
        }, Fall(15){
            @Override
            public String toString() {
                return this.name() + " " + this.getTemp() + " " + getDescription();
            }
        }, Winter(-10){
            @Override
            public String toString() {
                return this.name() + " " + this.getTemp() + " " + getDescription();
            }
        };
        private int temp;
        private Seasons(int temp){
            this.temp = temp;
        }
        public String getDescription(){
            return "Холодное время года";
        }
        public int getTemp() {
            return temp;
        }
    }
    public static void Seas(Seasons seasons){
        switch (seasons){
            case Fall -> System.out.println("I love Fall");
            case Spring -> System.out.println("I hate Spring");
            case Summer -> System.out.println("I'm ok with Summer");
            case Winter -> System.out.println("I more love than hate Winter");
        }
    }
    public static void main(String[] args) {
//        String favorite = "Fall";
//        System.out.println("Осень - частыне дожди и пасмурная погода");
//        for (Seasons seas: Seasons.values()){
//            System.out.println(seas);
//        }
//        //4.1 задание 2
//        Phone phone1 = new Phone();
//        Phone phone2 = new Phone(891430, "Samsung A5");
//        Phone phone3 = new Phone(881430, "Samsung A8", 63);
//        System.out.println(phone3.getNumber());
//        phone1.receiveCall("Jhon");
//        phone2.receiveCall("John", 9493);
//        phone3.sendMessage(1278,1256,1236,2323,2354,5578);

//        //4.1 задание 4
//        Matrix m1 = new Matrix(2,2);
//        Matrix m2 = new Matrix(2, 2);
//        m1.fillM();
//        m2.fillM();
//        m1.addM(m2);
//        m1.printM();
//        m1.multMonN(2);
//        m1.printM();
//        m1.multMonM(m2);
//        m1.printM();

        Car car = new Car();
        Boat boat = new Boat();
        Flight flight = new Flight();
        System.out.println(car.countPrice(6));
        System.out.println(boat.countTime(1000, 100));
        System.out.println(flight.countPrice(60) + " " + flight.countTime(8000, 60));
    }
}