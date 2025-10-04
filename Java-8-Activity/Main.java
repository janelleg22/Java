class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  // 1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
  double FtoC (double F){
    double C = (F-32) * 5 / 9.0;
    return C;
   }

  //3: Sphere volume
  double sphereVolume 
  
  //4: Cone volume


  //5: Distance between two coordinate points



  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
    System.out.println("Enter temp in deg F");
  double F = Input.readDouble();
  System.out.println("Enter temp in deg C" + FtoC(F));

    //3.6

    //4

    //5
    
    
  }
 
}