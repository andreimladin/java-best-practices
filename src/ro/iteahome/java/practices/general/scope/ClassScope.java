package ro.iteahome.java.practices.general.scope;

import java.util.ArrayList;
import java.util.List;

public class ClassScope {

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();
        for (int i=0; i<100; i++) {
            threadList.add(new Thread(runnable(new PaymentServiceBad(), "4961" + i)));
        }

        for (Thread th: threadList) {
            th.start();
        }

        for (Thread th: threadList) {
            th.join();
        }
    }

    private static Runnable runnable(PaymentServiceBad paymentServiceBad, String cardNo) {
        return () -> {
            PaymentServiceBad.cardNo = cardNo;
            try {
                Thread.sleep(100l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            paymentServiceBad.doPayment(100);
        };
    }

}

class PaymentServiceBad {
    private BankClient bankClient = new BankClient();

    public static String cardNo;

    public void doPayment(long amount) {
        System.out.println("Thread ID: " + Thread.currentThread().getName() + " Card No: " + cardNo);
        String iban = bankClient.getIban(cardNo);
        bankClient.transfer(iban, amount);
    }
}
