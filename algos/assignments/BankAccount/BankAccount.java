public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int totalAccounts;
    private static double totalAmount;


    public BankAccount(){
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        totalAccounts++;
        totalAmount += (this.checkingBalance + this.savingsBalance);

    }

    public void displayInfo(){
        System.out.println("Checking account balance : $" + this.checkingBalance);
        System.out.println("Savings account balance : $"+ this.savingsBalance);
    }

    public double getChecking(){
        return this.checkingBalance;
    }
    public double getSavings(){
        return this.savingsBalance;
    }
    public void setChecking(double checkingBalance){
        this.checkingBalance = checkingBalance;
        totalAmount += this.checkingBalance;
    }
    public void setSaving(doube savingsBalance){
        this.savingsBalance = savingsBalance;
        total+=this.savingsBalance;
    }
    public void withdrawlSavings(double savingsBalance){
        if (this.savingsBalance > savingsBalance){
            this.savingsBalance-=savingsBalance;
            totalAmount -= savingsBalance;
        }
        else{
            System.out.println("Insufficent Funds")
        }
    }
    public void withdrawlChecking(double checkingBalance){
        if (this.checkingBalance > checkingBalance){
            this.checkingBalance-=checkingBalance;
            totalAmount -= checkingBalance;
        }
        else{
            System.out.println("Insufficent Funds")
        }
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    public static double getTotalAmount(){
        return totalAmount;
    }
}