class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  // define the functions
  void madlib(String noun, String adj, String verb){
    System.out.println("The "+ adj + " " + noun + " " + verb);
  }

  double areaSq(double s){
    return s * s;
  }
   
  double areaOfCircle(double radius){ 
    return Math.PI*Math.pow(radius,2); 
  }


  void init() {
    madlib("person", "loud", "runs");

    double result = areaSq(2.5);
    System.out.println("Area is " + result);

     result = areaOfCircle(3);
    System.out.println("Area of a circle is " + result);

  }
}