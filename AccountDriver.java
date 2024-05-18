class Account
{
  long accountNo ;
  String bankName;
  String accountHolderName;
  String ifsc;


  Account(long accountNo, String bankName, String accountHolderName, String ifsc){
    super();
    this.accountNo = accountNo;
    this.bankName = bankName;
    this.accountHolderName = accountHolderName;
    this.ifsc = ifsc;
  }

  public void displayAccount(){
    System.out.println("*** Account Details ***");
    System.out.println("Account Number : " + this.accountNo);
    System.out.println("Bank Name : " + bankName);
    System.out.println("Account Holder Name : " + accountHolderName);
    System.out.println("IFSC : " + ifsc);
  }
}

class Saving extends Account
{
  
  double limit;
  double minBalance;
  double atmLimit;

  Saving( double limit, double minBalance, double atmLimit, long accountNo, String bankName, String accountHolderName, String ifsc)
  {
    super(accountNo, bankName, accountHolderName, ifsc);
    this.limit = limit;
    this.minBalance = minBalance;
    this.atmLimit = atmLimit;
  }

  public void displaySaving(){
    // System.out.println("*** Saving Details ***");
    System.out.println("Account Limit : " + limit);
    System.out.println("Minimum Balance Limit : " + minBalance);
    System.out.println("ATM one time Limit : " + atmLimit);
    System.out.println();
  }
}

class Current extends Account
{

  double dailyLimit;
  double creditCard;
  double loan;
  boolean overDraft;

  Current(double dailyLimit, double creditCard, double loan, boolean overDraft, long accountNo, String bankName, String accountHolderName, String ifsc){
    super( accountNo, bankName,  accountHolderName,  ifsc);
    this.dailyLimit = dailyLimit;
    this.creditCard = creditCard;
    this.loan = loan;
    this.overDraft = overDraft;
  }

  public void displayCurrent()

  {
    // System.out.println("*** Current Details ***");
    System.out.println("Daily transaction Limit : " + this.dailyLimit);
    System.out.println("Credit card Limit : " + this.creditCard);
    System.out.println("Maximum Loan : " + loan);
    System.out.println("Over Draft is Available or Not : " + overDraft);
    System.out.println();
  }

}

class Salary extends Account
{
  boolean directSalary;
  boolean zeroBalance;
  double interestRate;
  boolean insuranceCoverage;
  double debitCardLimit;


  Salary (boolean directSalary, boolean zeroBalance, double interestRate, boolean insuranceCoverage, double debitCardLimit,long accountNo, String bankName, String accountHolderName, String ifsc)
  {
    super( accountNo,  bankName,  accountHolderName,  ifsc);
    this.directSalary = directSalary;
    this.zeroBalance = zeroBalance;
    this.interestRate = interestRate;
    this.insuranceCoverage = insuranceCoverage;
    this.debitCardLimit = debitCardLimit;
  }

  public void displaySalary(){
    // System.out.println("*** Salary Details ***");
    System.out.println("Direct Salary : " + this.directSalary);
    System.out.println("Zero Balance : " + zeroBalance);
    System.out.println("Interest Rate : " + interestRate);
    System.out.println("Insurance Coverage : " + insuranceCoverage);
    System.out.println("Debit Card Limit : " + debitCardLimit);
    System.out.println();
  }

}



class AccountDriver 
{
  public static void main(String[] args) 
  {

    Saving obj = new Saving(50000, 500, 25000, 627648213l, "SBI", "Vijay", "SBI00052");
    obj.displayAccount();
    obj.displaySaving();

    Current obj1 = new Current(100000, 50000, 100000000, true, 627648213l, "SBI", "Vijay", "SBI00052");
    obj1.displayAccount();
    obj1.displayCurrent();

    Salary obj2 = new Salary(true, true, 5, true, 50000, 627648213l, "SBI", "Vijay", "SBI00052");
    obj.displayAccount();
    obj2.displaySalary();
  }
}