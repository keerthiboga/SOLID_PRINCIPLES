//----------------------This is an example for SRP--------------
// class Cart
// {
//     public void calcTotalPrice()
//     {
//         System.out.println("Calculating total price...");
//     }
//     public void printInvoice()
//     {
//         System.out.println("Printing Invoice....");
//     }
//     public void saveToDB()
//     {
//         System.out.println("save to database...");
//     }
// }--------------------------------------------Violates SRP

class CalcTotalPrice
{
    public void calcTotalPrice()
    {
        System.out.println("Calculating total price...");
    }
}

class PrintInvoice
{
     public void printInvoice()
    {
        System.out.println("Printing Invoice....");
    }
}

class SaveToDB{
    public void saveToDB()
    {
        System.out.println("save to database...");
    }
}
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        CalcTotalPrice itemsPrice=new CalcTotalPrice();
        itemsPrice.calcTotalPrice();

        PrintInvoice invoice=new PrintInvoice();
        invoice.printInvoice();

        SaveToDB save=new SaveToDB();
        save.saveToDB();
    }
}
