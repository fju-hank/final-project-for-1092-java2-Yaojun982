package com.fju.lottery;

public class LotteryClothes {

        public static void main(String[] args) {
        Going A1 = new Going();
        Going A2 = new Going();
        LotteryRunnable A3 = new LotteryRunnable();
        Thread thread = new Thread(A3);
        thread.start();
        A1.start();
        A2.start();
    }


}
