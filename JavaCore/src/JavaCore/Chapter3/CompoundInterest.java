package JavaCore.Chapter3;

/**
 * test multiArray
 * calculate the interest in different interest rates
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double START_RATE=10;
        final int NRATES=6;
        final int NYEARS=10;

        //set interest rate 10 to 15
        double[] interestRate=new double[NRATES];
        for (int i=0;i<NRATES;i++){
            interestRate[i]=(START_RATE+i)/100;
        }

        double[][] balances=new double[NYEARS][NRATES];
        //set initial balances to 10000
        for (int i=0;i< NRATES;i++){
            balances[0][i]=10000;
        }
        //compute interest for future years
        for (int i=1;i<NYEARS;i++){
            for (int j=0;j<NRATES;j++){
                //get last year's balances from previous row
                double oldBalance=balances[i-1][j];
                //compute interest
                double interest=oldBalance*interestRate[j];
                //compute this year's balance
                balances[i][j]=oldBalance+interest;
            }
        }
        //print interest rate
        for (int i=0;i< NRATES;i++){
            System.out.printf("%9.0f",100*interestRate[i]);
        }
        System.out.println();
        //print balances
        for (double[] row:balances){
            //print double row
            for (double balance:row)
                System.out.printf("%10.2f",balance);
            System.out.println();
        }
    }
}
