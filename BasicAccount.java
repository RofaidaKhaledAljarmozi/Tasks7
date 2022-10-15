public class BasicAccount extends BankAccount {
    public void withdraws(double amount)
    {
        if(amount<=this.balance)
        {
            super.withdraws(amount);
        }
        else
            super.withdraws(amount+30);
        System.out.println("Sorry you can not it is over your balance also the fees of withdraw is 30$");

    }}
