public class CheckingAccount {
    private double AccBal;
    private int AccNo;

    public CheckingAccount(double accBal, int accNo) {
        AccBal = accBal;
        AccNo = accNo;
    }

    public double getAccBal() {
        return AccBal;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void deposit(double deposit) throws Exception{
        if (deposit < 0) {
            throw new Exception ("Deposit must be a positive amount");
        }
        this.AccBal = deposit;
    }

    public void withdraw(double withdraw){
        try{
            WithdrawAmt(withdraw, this.AccBal);
            this.AccBal -= withdraw;
            System.out.println("Balance after Withdrawal: $" + this.AccBal);
        }catch(InsufficientFundsException e){
            e.printStackTrace();
        }
    }
    public static boolean WithdrawAmt(double withdraw , double AccBal) throws InsufficientFundsException{
        if(withdraw > AccBal){
            throw new InsufficientFundsException("Sorry, but your account is short by: $" + (withdraw - AccBal));
        }

        return true;
    }
}
