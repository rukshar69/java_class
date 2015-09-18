package customer;

/**
 * Created by rukshar on 9/17/2015.
 */
public class Customer {
    private String name;
    private String email;
    private char gender;


    public Customer(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public Customer(String name){this.name = name;}

    public String getName(){return  this.name;}
    public String getEmail(){return  this.email;}
    public char getGender(){return  this.gender;}

    public void setEmail(String email){this.email = email;}
    public void setGender(char gender){this.gender = gender;}
    public void print(){
        System.out.println(name+ "( "+gender+" ) "+email);
    }
}
