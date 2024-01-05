package ro.iteahome.java.practices.exceptions;

import java.util.List;

public class AvoidIndexOutOfBoundsException {

    public static void arrayIndexWrongUsage() {
        int[] dataSegment = new int[] {1, -2, 4, 5};
        System.out.println(dataSegment[5]); // => ArrayIndexOutOfBoundsException
    }

    private static void arrayIndexGoodUsage() {
        int[] dataSegment = new int[] {1, -2, 4, 5};

        for (int data: dataSegment) {
            System.out.println(data);
        }

        for (int i=0;i<dataSegment.length; i++) {
            System.out.println(dataSegment[i]);
        }

        int position = 2;

        if (0 <= position && position < dataSegment.length) {
            System.out.println("Am accessat pozitia direct");
            System.out.println(dataSegment[position]);
        }
    }

    public static void main(String[] args) {
//        arrayIndexWrongUsage();
//
        arrayIndexGoodUsage();

//        new ThePowerCollection().setNewValue(5, 7);
    }
}

class ThePowerCollection {

    private final int[] dataSegment = new int[5];

    public void setNewValue(int position, int newValue) {
        if (position >=0 && position < dataSegment.length) {
            dataSegment[position] = newValue;
        } else {
            System.out.println("Wrong position");
        }
    }
}
