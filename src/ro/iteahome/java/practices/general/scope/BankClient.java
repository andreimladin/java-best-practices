package ro.iteahome.java.practices.general.scope;

public class BankClient {

    public void transfer(String iban, long amount) {
        System.out.println("Bank transfer successully done");
    }

    public String getIban(String cardNo) {
        System.out.println("Thread ID: " + Thread.currentThread().getName() + " BankClient CardNo: " + cardNo);
        return "ROBTRL0121312446465454242";
    }
}
