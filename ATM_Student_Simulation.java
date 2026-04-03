import java . util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Atm {
    int balance;
    LocalDateTime now;
    String name;

    Atm(int balance, String name) {
        this.balance = balance;
        this.name = name;
        this.now = LocalDateTime.now();

        // Creating a formatter to make the date readable
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);

        // Providing the arguments for the format specifiers
        System.out.printf("Account of %s is created at %s%n", this.name, formattedDate);
    }

    public void GetBalance(){
        now = LocalDateTime.now();
        System.out.println(this.name+" has current Balance"+this.balance+"At"+now);
    }
    public void deposit(int amount){
        this.balance+=amount;
        now = LocalDateTime.now();
        System.out.println(this.name+" has successfully Add : "+amount+" at "+now);

    }
    public void withdraw(int amount){
        now = LocalDateTime.now();
        if(this.balance<amount) throw new Error(this.name+"has  insufficient Balance");
        else {
            this.balance-=amount;
            System.out.println(this.name+" successfully withdraw Rs : "+amount+" at "+now);
        }
    }
}
public class ATM_Student_Simulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Atm st1=new Atm(0,"st1");

        while(true){
            System.out.println("Enter a valid operation");
            System.out.println("1.Deposit \n2.GetBalance \n3.withdraw \n4. Exit ");
            int expression=sc.nextInt();
            switch (expression) {
                case 1:

                    System.out.println("Enter Amount");
                    int am=sc.nextInt();
                    st1.deposit(am);
                    break;

                case 2:
                    st1.GetBalance();
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
