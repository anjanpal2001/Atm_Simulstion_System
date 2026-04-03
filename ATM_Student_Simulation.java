import java . util.*;
class Atm{
    int balance;
    Atm(int balance){
        this .balance=balance;
    }
    public void GetBalence(){
        System.out.println(this.balance);
    }
    public void deposit(int amount){
        this.balance+=amount;
        System.out.println("You have successfully Add : "+amount);

    }
    public void withdraw(int amount){
        if(this.balance<amount) throw new Error("The insufficient Balance");
        else {
            this.balance-=amount;
            System.out.println("you successfully withdraw Rs : "+amount);
        }
    }
}
public class ATM_Student_Simulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Atm st1=new Atm(0);

        while(true){
            System.out.println("Enter a valid operation");
            System.out.println("1.Deposit \n 2.GetBalence \n 3.withdraw \n 4. Exit ");
            int expression=sc.nextInt();
            switch (expression) {
                case 1:

                    System.out.println("Enter Amount");
                    int am=sc.nextInt();
                    st1.deposit(am);
                    break;

                case 2:
                    st1.GetBalence();
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw");
                    int wth=sc.nextInt();
                    st1.withdraw(wth);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have choose invalid option .");
            }

        }

    }
}
