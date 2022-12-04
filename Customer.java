import java.util.Random;

public class Customer extends Person {
  private int Money;

  public int GetMoney() {
    return Money;
  };

  public void SetMoney(int _Money) {
    Money = _Money;
    return;
  }
  
  public int Buy(Product product) {
    System.out.println(
        GetName() + " has bought " + product.GetName() + " for " + product.GetPrice() + " yuans");
    Money -= product.GetPrice();
    return product.GetPrice();
  };

  Customer() {
    super();
    Money = 0;
  }
}