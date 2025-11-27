// import java.util.NoSuchElementException;

// interface Menu{
//     void VegetarianItems();
//     void NonVegetarianItems();
//     void Drinks();
// }

// class VegRestaurant implements Menu{
//     public void VegetarianItems()
//     {
//         System.out.println("This is the menu of vegetarian Items....");
//     }
//     public void NonVegetarianItems()
//     {
//         throw new NoSuchElementException("NonVeg items are not available");
//     }
//     public void Drinks()
//     {
//         throw new NoSuchElementException("drinks are not available");
//     }
// }-----------------------------violation of Interface Segregation principle
interface VegetarianMenu{
    void VegetarianItems();
    
}
interface NonVegetarianMenu{
    void NonVegetarianItems();
}

class VegRestaurant implements VegetarianMenu{
    public void VegetarianItems()
    {
        System.out.println("This is the menu of vegetarian Items....");
    }
}
class NonVegRestaurant implements NonVegetarianMenu{
    public void NonVegetarianItems()
    {
        System.out.println("This is the menu of Non-vegetarian Items....");
    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        VegRestaurant menu1=new VegRestaurant();
        menu1.VegetarianItems();
        NonVegRestaurant menu2=new NonVegRestaurant();
        menu2.NonVegetarianItems();
    }
    
}
