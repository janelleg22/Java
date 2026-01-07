class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create new dog objects 
      class Dog {
        //variables
        String breed;
        int age;
        String name;
        //functions
        void bark(){
          System.out.println("woof");
        }
      }

    // make dogs bark (invoke function)
         
   
    Dog Scooby = new Dog();
    Scooby.bark();
  }




  
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) +lower;
  }

}