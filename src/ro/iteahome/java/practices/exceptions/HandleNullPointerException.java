package ro.iteahome.java.practices.exceptions;

public class HandleNullPointerException {

    public static void main(String[] args) {
        String phoneNo = findContact("Andrei");
        callBad(phoneNo);

        String phoneNo2 = findContact("Mihai");
//        callBad(phoneNo2);
        callGood(phoneNo2);
    }

    public static String findContact(String firstName) {
        if ("Andrei".equals(firstName)) {
            return "07444 444 444";
        }

        return null;
    }

    private static void callBad(String phoneNo) {
        System.out.println("Calling no: " + phoneNo);
        phoneNo.split(" ");
    }

    private static void callGood(String phoneNo) {
        if (phoneNo != null && !phoneNo.isBlank()) {
            System.out.println("Calling no: " + phoneNo);
        } else {
            System.out.println("BIP: Wrong number");
        }

    }
}
