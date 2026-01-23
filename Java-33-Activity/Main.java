class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

	//3: create 3 new item objects
    CartItem item1 = new CartItem("Tomato", 1.99, 3, true);
    CartItem item2 = new CartItem("Apple", 2.99, 3, false);
    CartItem item3 = new CartItem("Avacado", 1.79, 3, true);



	
	//4: display name & original price of items that are on sale
  if(item1.onSale){
    print("Name" +item1.itemName);
    print("Price" + item1.itemPrice);
  }
  if(item3.onSale){
    print("Name" +item3.itemName);
    print("Price" + item3.itemPrice);
  }
	
	//5: subtotal (for all quantities of all items in cart, using discounted prices)
  double subtotal = item1.getPrice();
	// display subtotal, tax and total
    
  }

}