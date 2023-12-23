package ro.iteahome.java.practices.clean.enums;

public class UseEnums {

    public static void main(String[] args) {
        long value = 2462;

        if (value > Constants.MIN_BYTE_VALUE && value < Constants.MAX_BYTE_VALUE) {
            System.out.println("'a' is an byte");
        }

        if (value > Constants.MIN_SHORT_VALUE && value < Constants.MAX_SHORT_VALUE) {
            System.out.println("'a' is a short");
        }

        if (DataTypeInterval.C_BYTE.doesBelong(value)) {
            System.out.println("'a' is an byte");
        }

        if (DataTypeInterval.C_SHORT.doesBelong(value)) {
            System.out.println("'a' is a short");
        }
    }

}


abstract class Constants {

    public static final long MIN_BYTE_VALUE = -128;
    public static final long MAX_BYTE_VALUE = 127;
    public static final long MIN_SHORT_VALUE = -32768;
    public static final long MAX_SHORT_VALUE = 32767;

}

enum DataTypeInterval {
    C_BYTE(-128, 127),
    C_SHORT(-32768, 32767);

    private long min;
    private long max;

    DataTypeInterval(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public boolean doesBelong(long a) {
        if (min < a && a < max) {
            return true;
        }

        return false;
    }
}