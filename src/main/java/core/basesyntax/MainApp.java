package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine buldMachine = new Bulldozer();
        Machine truckMachine = new Truck();
        Machine excMachine = new Excavator();

        Machine[] arrayOfMachines = new Machine[] { buldMachine, truckMachine, excMachine };

        for (Machine machine : arrayOfMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
