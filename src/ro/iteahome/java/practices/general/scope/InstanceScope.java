package ro.iteahome.java.practices.general.scope;

public class InstanceScope {

    public static class PaymentServiceBad {

        private String cardNo;
        private long amount;

        private BankClient bankClient = new BankClient();

        public PaymentServiceBad(String cardNo, long amount) {
            this.cardNo = cardNo;
            this.amount = amount;
        }

        public void doPayment() {
            String iban = bankClient.getIban(this.cardNo);
            bankClient.transfer(iban, this.amount);
        }
    }

    public static class PaymentServiceGood {

        private BankClient bankClient = new BankClient();

        public void doPayment(String cardNo, long paymentAmount) {
            String iban = bankClient.getIban(cardNo);
            long accountAmount = 0;

            long currentAmount = accountAmount - paymentAmount;

            bankClient.transfer(iban, currentAmount);
        }
    }

    public static void main(String[] args) {
        PaymentServiceBad paymentService = new PaymentServiceBad("1231321321122", 1000);
        paymentService.doPayment();

        PaymentServiceGood paymentServiceGood = new PaymentServiceGood();
        paymentServiceGood.doPayment("1231321321122", 1000);
    }
}
