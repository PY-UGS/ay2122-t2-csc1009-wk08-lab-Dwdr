import java.util.*;

public class BankDemoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a deposit");
        double deposit = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a withdrawal: ");
        double withdraw = input2.nextDouble();
        input.close();
        input2.close();
        CheckingAccount acc = new CheckingAccount(0, 5264);
        try{
            acc.deposit(deposit);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("\nBalance before withdrawal is: $" + acc.getAccBal());
        System.out.println("Account no :" + acc.getAccNo());
        acc.withdraw(withdraw);
        System.out.println("The balance after withdraw is: $" + acc.getAccBal());
    }
}