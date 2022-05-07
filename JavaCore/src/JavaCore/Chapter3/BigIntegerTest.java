package JavaCore.Chapter3;
import java.math.*;
import java.util.*;
/**
 * test BigInteger
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("how many numbers do you need to draw?");
        int k=in.nextInt();
        System.out.println("what is the biggest number you can draw?");
        int n=in.nextInt();
        BigInteger lotteryOdds=BigInteger.valueOf(1);

        for (int i=1;i<=k;i++){
            lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("your odds id 1 in "+lotteryOdds+".good luck.");

    }
}
