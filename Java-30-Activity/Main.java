class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}
  


  void init(){
    // create objects
    Car car1 = new Car("BMW", "X3", "White", 2025, 50000.50);
    Car car2 = new Car("Porsche", "911", "Black", 2019, 200000.75);
    Car car3 = new Car("Mercedez-Benz", "C-class", "Red", 2021, 41600.25);

    // display brand, model and value of each car
     print(car1.brand);
     print(car1.model);
     print(car1.value);
       
     print(car2.brand);
     print(car2.model);
     print(car2.value);

     print(car3.brand);
     print(car3.model);
     print(car3.value);

    // Display brand and model of any car with value over 30,000
    print("\nCars with value exceeding $30,000:");
    if(car1.value > 30000){
      print(car1.value);
    }
    if(car2.value > 30000){
      print(car2.value);
    }
    if(car3.value > 30000){
      print(car3.value);
    }
	// Make BMW honk
	print("\nUsing car functions(behavior):");	
  car1.honk();
  }

}