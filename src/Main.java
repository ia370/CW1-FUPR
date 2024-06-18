import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //COMPLETE THE main METHOD
        //Add a new account holder with the first name "John", last name "Doe", and date of birth "01/01/2000"
        AccountHolder accountholder = new AccountHolder("john", "Doe", "01/01/2000");
        System.out.println(accountholder.toString());
        //Set up a new savings account with an initial balance of £1000 and an interest rate of 5%
        SavingsAccount savingsAccount = new SavingsAccount( accountholder,1000, 0.05);
        System.out.println(savingsAccount);
        //Set the deposit date of the savings account to the opening date
        savingsAccount.setDepositDate(LocalDate.now());
        System.out.printf("Initial Balance: £%.2f%n",savingsAccount.balance);
        //Deposit £1000 into the savings account every year for 10 years
        for (int i = 2015; i <= 2024; i++) {
            double newbalance = savingsAccount.deposit(1000.00);
            //Print the balance after each deposit
            System.out.printf("Year %d: Balance: %.2f%n",i,newbalance);
            //Set the deposit date of the savings account to the opening date
            savingsAccount.setDepositDate(LocalDate.now());
        }
    }

}
