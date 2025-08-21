
import java.util.Scanner;
public class Atm{
    String username;
    int mobileNumber;
    int pin;
    double avlBalance;

    public Atm(String username,int mobileNumber,int pin,double avlBalance){
        this.username=username;
        this.mobileNumber=mobileNumber;
        this.pin=pin;
        this.avlBalance=avlBalance;
    }
    public void setpin(int oldpin,int newpin) {
        if(this.pin==oldpin) {
            pin=newpin;
            System.out.println("pin updated succesfully");

        }else {
            System.out.println("invalid pin");

        }

    }
    public void deposit(double amount) {
        avlBalance += amount;
        System.out.println("Amount deposited ");
    }
    public void withdraw(double amount) {
        if(amount<=avlBalance) {
            avlBalance-=amount;
            System.out.println("money withdrawal of"+ amount);
        }else {
            System.out.println("insufficient funds");
        }
    }
    public void checkbalance() {
        System.out.println("Balance is"+ avlBalance);

    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        Atm obj=new Atm("Raj",890123458,1234,999);
        System.out.println("enter your pin");
        int inputpin=sc.nextInt();

        if(obj.pin==inputpin) {

            do {
                System.out.println("login succesfull");
                System.out.println("1. CheckBalance");
                System.out.println("2. Deposit");
                System.out.println("3. withdraw");
                System.out.println("4. set newpin");
                System.out.println(" choose option");

                int option=sc.nextInt();
                switch(option) {
                    case 1:
                        obj.checkbalance();
                        break;
                    case 2:
                        System.out.println("enter amount to deposit");
                        double depamt=sc.nextDouble();
                        obj.deposit(depamt);
                        break;
                    case 3:
                        System.out.println("enter amount to withdraw");
                        double withamt=sc.nextDouble();
                        obj.withdraw(withamt);
                        break;
                    case 4:
                        System.out.println("enter old pin");
                        int oldpin=sc.nextInt();
                        System.out.println("enter new pin");
                        int newpin=sc.nextInt();
                        obj.setpin(oldpin, newpin);
                        break;
                    default:
                        System.out.println("invalid option");
                }
            }while(true);
        }else {
            System.out.println("invalid pin");






            sc.close();

        }

    }
}