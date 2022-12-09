package atmpackage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    Scanner scan = new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void getSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    // calculate checking balance after withdraw
    private double calculateCheckingBalanceAfterWithdraw(double amount) {
        checkingBalance = checkingBalance - amount;//when user wants to withdraw money, their balance will be updated
        return checkingBalance;

    }

    //calculate checking account balance after deposite
    private double calculateCheckingBalanceAfterDeposite(double amount) {

        checkingBalance = checkingBalance + amount;
        return checkingBalance;

    }

    // calculate saving balance after withdraw
    private double calculateSavingBalanceAfterWithdroaw(double amount) {
        savingBalance = savingBalance - amount;
        return savingBalance;

    }

    //calculate saving balance after deposite
    private double calculateSavingBalanceAfterDeposite(double amount) {

        savingBalance = savingBalance + amount;
        return savingBalance;


    }

    //Interact with user to withdraw money from checking account
    public void getCheckingWithdraw(){

        System.out.println("Your checking balance : "+moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to withdraw: ");
        double amount = scan.nextDouble(); // how  much money do you want to withdraw from your accout. user gives amount
        if(amount <=0){
            System.out.println("Negative or zero amount is not exaptable!");
            getCheckingWithdraw(); // it is starting the proccess again
        }else if(checkingBalance>=amount){
            calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println("Your checking balance : "+moneyFormat.format(checkingBalance));

        }else{
            System.out.println("You do not have enough money on your checking account");
        }
    }
// interact wit customer to deposite money to their checking acount

    public void getCheckingDeposite(){
        System.out.println("Your checking balance : "+ moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to deposite: ");
        double amount=scan.nextDouble();
        if(amount<=0){
            System.out.println("Negative or zero amount is not exaptable!");
            getCheckingDeposite();

        }else{
            calculateCheckingBalanceAfterDeposite(amount);
            System.out.println("Your checking balance : "+moneyFormat.format(checkingBalance));
        }


    }

    //Interact with user to withdraw money from saving account
    public void getSavingWithdraw(){

        System.out.println("Your saving balance : "+moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like to withdraw: ");
        double amount = scan.nextDouble(); // how  much money do you want to withdraw from your accout. user gives amount
        if(amount <=0){
            System.out.println("Negative or zero amount is not exaptable!");
            getSavingWithdraw(); // it is starting the proccess again
        }else if(savingBalance>=amount){
            calculateSavingBalanceAfterDeposite(amount);
            System.out.println("Your saving balance : "+moneyFormat.format(savingBalance));

        }else{
            System.out.println("You do not have enough money on your checking account");
        }
    }
    // interact with customer to deposite money to their saving acount

    public void getSavingDeposite(){
        System.out.println("Your saving balance : "+moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like to deposite: ");
        double amount=scan.nextDouble();
        if(amount<=0){
            System.out.println("Negative or zero amount is not exaptable!");
            getSavingDeposite();

        }else{
            calculateSavingBalanceAfterDeposite(amount);
            System.out.println("Your saving balance : "+moneyFormat.format(savingBalance));
        }


    }




}
