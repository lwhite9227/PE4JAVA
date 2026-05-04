public class Car {
    private int year;
    private String model;
    private String brand;
    private double price;

    // Constructor
    public Car(int year, String brand, String model, double price) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters
    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Modified displayInfo method to include new attributes
    public void displayInfo() {
        System.out.println("================================");
        System.out.println("Car Information");
        System.out.println("================================");
        System.out.println("Year:  " + year);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("================================");
    }

    @Override
    public String toString() {
        return year + " " + brand + " " + model + " - $" + String.format("%.2f", price);
    }
}
