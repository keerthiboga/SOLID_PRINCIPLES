
abstract class DepositOnlyAccount
{
    abstract void deposit(int amount);
}

abstract class WithdrawableAccount extends DepositOnlyAccount
{
    abstract void withdraw(int amount);
}

class SavingsAccount extends WithdrawableAccount{
    int balance;

    SavingsAccount(int balance)
    {
        this.balance=balance;
    }

    void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Balance after deposit: "+balance);
    }

    void withdraw(int amount)
    {
        balance-=amount;
        System.out.println("balance after withdraw:"+balance);
    }
}

class FixedDepositAccount extends DepositOnlyAccount
{
      int balance;

    FixedDepositAccount(int balance)
    {
        this.balance=balance;
    }

    void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Balance after deposit: "+balance);
    }
}


public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        SavingsAccount acc1=new SavingsAccount(5000);
        acc1.deposit(1000);
        acc1.withdraw(2000);
        FixedDepositAccount acc2=new FixedDepositAccount(10000);
        acc2.deposit(4000);
    }
}
