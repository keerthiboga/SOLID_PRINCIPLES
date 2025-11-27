
// class DiscountCalculator
// {
//     public double calculateDiscount(int price,String customerType)
//     {
//         if(customerType=="silver")
//             return price*0.1;
//         else if(customerType=="Gold")
//             return price*0.3;
//         else 
//             return price*0.0;

//     }
// }-------------------Violation of Open Closed Principle
abstract class DiscountCalculator
{
    abstract public double calculateDiscount(int price);
}
class SilverCustomer extends DiscountCalculator
{
    public double calculateDiscount(int price){
        return price*0.1;
    }
}
class GoldCustomer extends DiscountCalculator
{
    public double calculateDiscount(int price){
        return price*0.3;
    }
}
class PremiumCustomer extends DiscountCalculator
{
    public double calculateDiscount(int price){
        return price*0.4;
    }
}
public class OpenClosedPrinciple {
    public static void main(String[] args) {
        DiscountCalculator customer1=new GoldCustomer();
        double discount=customer1.calculateDiscount(4000);
        System.out.println(discount+" is the discount recieved by customer1");
    }
}
