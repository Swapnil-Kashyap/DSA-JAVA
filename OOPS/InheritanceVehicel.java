public class InheritanceVehicel {

    public String name;
    public String model;
    public int noofTyres;

    // Default constructor
    InheritanceVehicel() {
        this.name = "";
        this.model = "";
        this.noofTyres = -1;
    }

    // Parameterized constructor
    InheritanceVehicel(String name, String model, int noofTyres) {
        this.name = name;
        this.model = model;
        this.noofTyres = noofTyres;
    }

    void startEngine() {
        System.out.printf("Engine is starting of %s : %s\n", name, model);
    }

    void stopEngine() {
        System.out.printf("Engine is stopping of %s : %s\n", name, model);
    }

    // Car class
    public static class Car extends InheritanceVehicel {

        public int noofDoors;
        public String transmissionType;

        Car(String name, String model, int noofTyres,
            int noofDoors, String transmissionType) {

            super(name, model, noofTyres);

            this.noofDoors = noofDoors;
            this.transmissionType = transmissionType;
        }

        public void startAC() {
            System.out.println("AC is started " + name);
        }
    }

    // Motorcycle class
    public static class Motorcycle extends InheritanceVehicel {

        public String handlebarstyle;
        public String SuspenssionType;

        Motorcycle(String name, String model, int noofTyres,
                   String handlebarstyle, String SuspenssionType) {

            super(name, model, noofTyres);

            this.handlebarstyle = handlebarstyle;
            this.SuspenssionType = SuspenssionType;
        }

        public void wheelie() {
            System.out.println("Motorcycle is doing wheelie " + name);
        }
    }

    public static void main(String[] args) {

        Car c = new Car("Maruti", "800", 4, 4, "Auto");

        c.startEngine();
        c.startAC();
        c.stopEngine();

        Motorcycle m = new Motorcycle(" Shine", "125cc", 04, "u", "Soft");
        m.wheelie();
    }
}