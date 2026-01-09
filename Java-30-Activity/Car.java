class Car{
//class properties
    String brand;
    String model;
    String color;
    int year;
    double value;

// add constructor
    Car(String brand, String model, String color, int year, double value){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.value = value;
    }
//class function
    void honk(){
        System.out.println("Beep Beep!");
    }
}
