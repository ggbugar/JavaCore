package JavaCore.Chapter3;
import java.util.*;

/**
 * test in[]
 * help people to choose lottery
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("how many numbers do you need to draw?");
        int k=in.nextInt();
        System.out.println("what is the biggest number you can draw?");
        int n=in.nextInt();

        //fill an array with 1,2,3,...n
        int[] numbers=new int[n];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
        //draw k numbers and put them into a second array
        int[] result=new int[k];
        for (int i=0;i<k;i++){
            //choose a random number between 0 and n-1
            int randomNumber=(int)(Math.random()*n);
            //pick the number at the random position
            result[i]=numbers[randomNumber];
            //move the last element to the random position
            numbers[randomNumber]=numbers[n-1];
            n--;
        }
        //print the sorted array
        Arrays.sort(result);
        System.out.println("bet the following combination.it will make you rich!");
        for (int e:result){
            System.out.println(e);
        }
    }
}
