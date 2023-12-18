package ro.iteahome.java.practices.clean.enums;

public class UseEnums {

}


abstract class Constants {

    private static final long MIN_INT_VALUE = -232323132;
    private static final long MAX_INT_VALUE = 2000000200;
    private static final long MIN_LONG_VALUE = -23232313222222l;
    private static final long MAX_LONG_VALUE = 20000002003323l;

}

enum DataTypeInterval {
    C_INTEGER(-232323132, 2000000200),
    C_LONG(-23232313222222l, 20000002003323l);

    private long min;
    private long max;

    DataTypeInterval(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public long getMin() {
        return min;
    }

    public long getMax() {
        return max;
    }
}