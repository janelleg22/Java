class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    //1
    System.out.println("Enter amount of tickets");
    double tickets = Input.readDouble();
    double result = groupSavings(tickets);
    System.out.println( "Total cost is: " + result);
    
    //2
    System.out.println("Enter total amount spent: ");
    double total = Input.readDouble();
    System.out.println("Enter amount of cans purchased");
    int cans = Input.readInt();
    double savings = groceryDiscount(total, cans);
    System.out.println("You saved: $" + savings);
    
  }

  /*
    Problem 1:      
    Write a function groupSavings() that takes the number of tickets you want 
    to purchase. Return the total cost by applying the following prices:
    1 to 8 tickets  : each ticket costs $11.00
    9 to 16 tickets : each ticket costs $10.50
    over 16 tickts  : each ticket costs $8.50
  */
 double groupSavings(double tickets){
  if (tickets >= 1 && tickets <= 8)
    return 11*tickets;
  else if (tickets >= 9 && tickets <= 16) {
    return 10.5*tickets;
 } else if (tickets > 16){
    return tickets*8.5;
 } else
  return 0;
 }

  
  /*
    Problem 2:
    Write a function groceryDiscount() that takes the total amount spent at 
    a grocery store and the number of cans purchased. Based on the total amount 
    and the number of cans purchased, you get a savings on your total bill.
    
    
    Return the amount saved:
      Spend $100 to $200 and purchase at least 3 cans: $10 savings
      Spend over $200 and purchase more than 4 cans: $25 savings
      Otherwise: No discount.
    */
   double groceryDiscount(double total, int cans){
    double savings = 0;
    if (total >= 100 && total <= 200 && cans >=3){
      savings = 10;
    } else if (total > 200 && cans >4){
      savings = 25;
    } 

    return savings;
   }
   


}