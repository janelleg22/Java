class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
   // Invoke functions with appropriate arguments
   //1
  //  System.out.println("Enter GPA value:");
  //  double value = Input.readDouble();
  //  double result = GPA(value);
  //  System.out.println( "result is: " + result);

   //2
//    System.out.println("Enter grade level (9-12): ");
//    int grade = Input.readInt();

//    System.out.println("Enter amount of credits:");
//    int credits = Input.readInt();

//   boolean result = isGraduating (grade,credits);

//    if (result) {
//     System.out.println("Student Graduating");
// } else {
//     System.out.println("Student NOT Graduating");
// }

//3
  // System.out.println("Enter weight in pounds:");
  // double weight = Input.readDouble();

  // System.out.println("Enter height in inches:");
  // double height = Input.readDouble();
  // String result = BMI(weight, height);
  // System.out.println("BMI Category: " + result);

  //4
    // System.out.println("Enter package weight in pounds:");
    // double weight = Input.readDouble();

    // double cost = shippingCost(weight);

    // System.out.println("Shipping Cost: $" + cost);

    //5
    System.out.println("Enter light frequency in THz:");
    double freq = Input.readDouble();

    boolean result = blueOrViolet(freq);

    if (result) {
        System.out.println("Blue or Violet Light");
    } else {
        System.out.println("Not Blue or Violet Light");
    }
  }

/* Challenge 1:
  Write a function "gpa" that takes in the GPA value and returns the following: 
  if GPA is over 90, return GPA weighted by an extra 10%;
  otherwise return the raw GPA.
*/
// double GPA(double value){
//   if (value > 90){
//      return 1.1*value;
//   } else
//   return value;
// }

  
/* Challenge 2:
    Write a function "isGraduating" that accepts a grade level and number of credits earned. It returns the boolean value TRUE if a student is a Senior and has 44 or more credits; otherwise it returns FALSE. 
  
  In the init() function:
  Display to console "Student Graduating" or "Student NOT Graduating" depending on the value returned by the function.
*/
// boolean isGraduating (int grade, int credits){
//   if (grade == 12 && credits >= 44){
//     return true;
//   } else
//   return false;
// }


/* Challenge 3:  BMI
  Write a function "BMI" that accepts a weight in pounds and a height in inches. 
  Calculate the BMI (search up the formula) and return the following:
    BMI 18.4 or less:  return Underweight
    BMI over 18.4 to under 25.0:  return Normal
    BMI of 25.0 or more to under 40.0:  return Overweight
    BMI of 40.0 or more:  return  Obese 
*/
  // String BMI(double weight, double height) {
  //   double bmi = weight/Math.pow(height,2)*703;
    
  //   if (bmi <= 18.4) {
  //       return "Underweight";
  //   } 
  //   else if (bmi > 18.4 && bmi < 25.0) {
  //       return "Normal";
  //   } 
  //   else if (bmi >= 25.0 && bmi < 40.0) {
  //       return "Overweight";
  //   } 
  //   else {
  //       return "Obese";
  //   }

  // }

/* Challenge 4:
  Write a function "shippingCost" that accepts a weight in pounds and returns:
       0.00, if 10 pounds or less,
       5.00, if more than 10 pounds but 15 pounds or less,
       10.00, if more than 15 pounds but 25 pounds or less,
       10.00 plus 2 cents per pound over 25 pounds, if over 25 pounds.
*/
//   double shippingCost(double weight) {
//     if (weight <= 10) {
//         return 0.00;
//     } 
//     else if (weight > 10 && weight <= 15) {
//         return 5.00;
//     } 
//     else if (weight > 15 && weight <= 25) {
//         return 10.00;
//     } 
//     else {
//       double extra = weight - 25;
//         return 10.00 + (extra * 0.02);
//     }
// }

/* Challenge 5:
  Write a function "blueOrViolet" that accepts a light frequency in THz and returns true for either blue frequencies (600-670 THz inclusive) or violet frequencies (700-750 THz inclusive), otherwise return false.
*/
  boolean blueOrViolet(double freq) {
    if ((freq >= 600 && freq <= 670) || (freq >= 700 && freq <= 750)) {
        return true;
    } else {
        return false;
    }
}

  
} 