package JavaCore.Chapter3;
import java.util.*;

/**
 *
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("how much money will you contribute every year?");
        double payment=in.nextDouble();
        System.out.println("Interest rate in %:");
        double interestRate=in.nextDouble();

        double balance=0;
        int years=0;

        String input;
        //add the balance while the user isn't ready to retire
        do {
            balance+=payment;
            double interest=balance*(interestRate/100);
            balance+=interest;
            years++;
            //print current balance
            System.out.printf("after %d years,your balance is %,.2f",years,balance);
            //ask if ready to retire and get input
            System.out.println("Ready to retire?(Y/N)");
            input=in.next();
        }while (input.equals("N"));
    }
}
