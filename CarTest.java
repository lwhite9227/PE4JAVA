public class CarTest {
    public static void main(String[] args) {
        // Create a 2017 Audi S7
        Car audi = new Car(2017, "Audi", "S7", 69995.00);
        System.out.println("Testing 2017 Audi S7:");
        audi.displayInfo();

        System.out.println();

        // Create a 2018 BMW M5
        Car bmw = new Car(2018, "BMW", "M5", 104900.00);
        System.out.println("Testing 2018 BMW M5:");
        bmw.displayInfo();

        System.out.println();

        // Demonstrate toString method
        System.out.println("Using toString method:");
        System.out.println("Audi: " + audi);
        System.out.println("BMW: " + bmw);
    }
}
