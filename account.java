package account;


import customer.Customer;

/**
 * Created by rukshar on 9/17/2015.
 */
public class Account {
    private Customer customer;
    private double balance;
    private  String branch;
    int accountNumber;

    public Account(Customer customer, int accountNumber, double balance)
    {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public Account(Customer customer, int accountNumber, String branch)
    {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.branch = branch;

    }

    public  void setBranch(String branch){this.branch = branch;}

    public String getBranch(){return  this.branch;}

    public  String getCustomerName(){return  customer.getName();}

    public int getAccountNumber(){return  this.accountNumber;}

    public double getBalance(){return this.balance;}

    public double credit(double money){return  getBalance()+money;}
    public double debit(double money){return getBalance()-money;}

    public void setBalance(double balance){this.balance = balance;}

    public Customer getCustomer(){return this.customer;}
    public void print(){
        System.out.println("Customer :"+getCustomerName()+" branch : "+getBranch()+" A\\C no: "+getAccountNumber()+" balance: "+getBalance());
    }
}
