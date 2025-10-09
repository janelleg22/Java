class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    // Invoke the functions (test different situations)
// problem 1
// System.out.println("Enter GPA ( 0.0 - 4.0): ");
// double GPA = Input.readDouble();

// System.out.println("Enter SAT score (200 - 1600): ");
// int SAT = Input.readInt();

// String result = collegeApp(GPA, SAT);
// System.out.println("College admission result: " + result);

// problem 2
// System.out.println("Enter the car speed in MPH: ");
// double speed = Input.readDouble();

// String result = ecoFuel(speed);
// System.out.println("Driving condition: " + result);

// problem 3
//  System.out.println("Enter the speed on the speeding ticket: ");
//   double speed = Input.readDouble();

//   double result = speedFine(speed);
//   System.out.println("The speeding fine is: $" + result);



  }



  /*
    Problem 1:
    Write a function collegeApp() that accepts a GPA (0 - 4.0) and an SAT 
    score (200 - 1600) and returns "ACCEPTED" if gpa is 3.2 or better or
    if SAT score is 1450 or better; otherwise returns "Not Accepted".
  */
//  String collegeApp(double GPA, int SAT){
//   if (GPA >= 3.2 || SAT >=1450){
//     return "ACCEPTED";
//   } else
//   return "NOT ACCEPTED";
//  }
   

  /*
    Problem 2:
    Write a function ecoFuel() that takes in the speed of a car in MPH and 
    returns a string "Fuel Economy" if the speed is between 40 and 65 MPH inclusive;  
    otherwise it returns "Not Optimal".
  */
  //  String ecoFuel(double speed){
  //   if (speed >= 40 && speed <= 65){
  //     return "Fuel Economy";
  //   } else
  //   return "Not Optimal";
  //  }

  /*
    Problem 3:
    Write a function speedFine() that accepts the speed on a speeding ticket and returns a fine of $75 for speeds between 60 and 70 (inlcusive); otherwise return 
    a fine of $75 plus two dollars for every mile over 70.
  */
  // double speedFine(double speed) {
  // double fine;

  // if (speed >= 60 && speed <= 70) {
  //   fine = 75;
  // } 
  // else if (speed > 70) {
  //   fine = 75 + (2 * (speed - 70));
  // } 
  // else {
  //   fine = 0;
  // }

  // return fine;
  // } 
  /*
    Problem 4:
    Write a function discount() that takes in the cost of three items and returns the total amount discounted by 10% if the sum of the items is over $250 and if at least one of the items costs $100 or more; otherwise return the total amount with no discount.
  */
  double discount(double item1, douhble item2, double item3) {
    double total = item1 + item2 + item3;
    if (total > 250 && (item1 >= 100 || item2 >= 100 || item3 >=100)){
      total = total * 0.9;
    }
  }

  


}
