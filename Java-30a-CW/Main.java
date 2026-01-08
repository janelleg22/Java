class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    Dog dog1 = new Dog("Poodle", 3, "Whiskey");
    Dog dog2 = new Dog("Schnauzer", 1, "Snoopy");
    Dog dog3 = new Dog("Chihuahua", 2, "Miso");

    // display object property values
    print(dog1.age);
    
    // invoke object behaviors(functions)
   dog1.bark();
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}