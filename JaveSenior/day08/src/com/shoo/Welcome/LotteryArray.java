package com.shoo.Welcome;

public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++) {
            odds[n] = new int[n + 1];
        }

        for (int n = 0; n < odds.length; n++) {
            System.out.print(n);
            for (int k = 0; k < odds[n].length; k++) {
                //System.out.println(n);
                //System.out.print(k);
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    //System.out.println(n);
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                    //System.out.println(lotteryOdds);  //
                   // System.out.println(n);
                }
                odds[n][k] = lotteryOdds;
                //System.out.println(lotteryOdds);
            }

        }

        for (int[] row : odds) {
            for (int odd : row)
                System.out.printf("%4d", odd);

            System.out.println();
        }
    }
}
