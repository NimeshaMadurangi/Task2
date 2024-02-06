import java.util.Scanner;

public class BankDetails {

    private Long acc_no;
    private String name;
    private String acc_type;
    private int balance;

    Scanner sc = new Scanner(System.in);

    public void openAcc() {

        System.out.print("Enter Account Number: ");
        acc_no = sc.nextLong();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Account Type: ");
        acc_type = sc.next();

        System.out.print("Enter Balance: ");
        balance = sc.nextInt();

    }

    public void showAcc(){

        System.out.println("Account Number: " +acc_no);
        System.out.println("Holder Name: " +name);
        System.out.println("Account Type: " +acc_type);
        System.out.println("Account Balance: " +balance);

    }

    public void deposit(){

        int amount;

        System.out.print("Enter Deposit Amount: ");
        amount = sc.nextInt();

        balance = balance + amount;
    }

    public void withdrawal(){

        int amount;

        System.out.print("Enter Amount: ");
        amount = sc.nextInt();

        if (balance >= amount){
            balance = balance - amount;

            System.out.println("Withdrawal Amount: " +amount);
            System.out.println("Balance: " +balance);
        }
        else{
            System.out.println("Your Account Balance is not Sufficient.");
        }
    }

    public void search(Long ac){

        if (acc_no.equals(ac)){
            showAcc();
        }

    }

}
