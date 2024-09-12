public class subscription {
  String name;
   int price;
   int months;
   int pricetotal;
  
  public subscription(String name, int price, int months) {
    this.name = name;
    this.price = price;
    this.months = months;
  }
  public String getName() {
    return name;
  }
  public int getPrice() {
    return price;
  }
  public int getMonths() {
    return months;
  }
  public int getTotalPrice() {
    pricetotal = price * months;
    return pricetotal;
  }
}