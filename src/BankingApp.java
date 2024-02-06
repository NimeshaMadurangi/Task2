import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankDetails bank = new BankDetails();

        int n;

        System.out.println("Please select what you want");

        System.out.println("1. Open a new Account");
        System.out.println("2. Show Details");
        System.out.println("3. Deposit Money");
        System.out.println("4. Money Withdraw");
        System.out.println("5. Search");

        System.out.print("Enter Your Need: ");
        n = sc.nextInt();

            switch (n){

                case 1:
                    bank.openAcc();
                    System.out.println("Successfully created");
                    break;
                case 2:
                    bank.showAcc();
                    System.out.println("Thank You");
                    break;
                case 3:
                    bank.deposit();
                    System.out.println("Successfully Deposit");
                    break;
                case 4:
                    bank.withdrawal();
                    System.out.println("Thank You");
                    break;
                case 5:
                    Long searchAcc = sc.nextLong();
                    bank.search(searchAcc);
                    System.out.println("Thank You");
                    break;
            }
        }
}

