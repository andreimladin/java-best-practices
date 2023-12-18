package ro.iteahome.java.practices.primitives;

public class SaveMemory {

    private static final short BYTES_IN_KB = 1024;
    private static final short KB_IN_MB = 1024;
    private static final int BYTES_IN_MB = BYTES_IN_KB * KB_IN_MB;
    private static final int ARRAY_SIZE = 100000000;

    private static void useLong() {
        long[] a = new long[ARRAY_SIZE];
        showMemory();
    }

    private static void useByte() {
        byte[] a = new byte[ARRAY_SIZE];
        showMemory();
    }

    private static void showMemory() {
        Runtime rt = Runtime.getRuntime();
        System.out.println("--- Memory usage ---");
        System.out.println("Free memory: " +  rt.freeMemory()/BYTES_IN_KB + " kb - " + rt.freeMemory()/BYTES_IN_MB + " mb");
        System.out.println("Used memory: "  + rt.totalMemory()/BYTES_IN_KB + " kb - " + rt.totalMemory()/BYTES_IN_MB + " mb");
        System.out.println("Max memory: " + rt.maxMemory()/BYTES_IN_KB + " kb - " + rt.maxMemory()/BYTES_IN_MB + " mb");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        useLong();
//        useByte();
    }

}
