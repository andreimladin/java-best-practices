package ro.iteahome.java.practices.exceptions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class EmptyCatchBlock {

    static class ExeptionHandlingBad1 {

        public void executeSomething() {
            try {
                InputStream countryStream = new BufferedInputStream(new FileInputStream("country.txt"));
            } catch (FileNotFoundException e) {
            }

            System.out.println("Successfully executed!");
        }
    }

    static class ExceptionHandlingBad2 {
        public void executeSomething() {
            try {
                InputStream countryStream = new BufferedInputStream(new FileInputStream("country.txt"));
            } catch (FileNotFoundException e) {
                // Nothing important
            }

            System.out.println("Successfully executed!");
        }
    }

    static class ExceptionHandlingBad3 {
        public void executeSomething() {
            try {
                InputStream countryStream = new BufferedInputStream(new FileInputStream("country.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("There is an error");
            }

            System.out.println("Successfully executed!");
        }
    }

    static class ExceptionHandlingGood1 {
        public void executeSomething() {
            try {
                InputStream countryStream = new BufferedInputStream(new FileInputStream("country.txt"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException("An error appeared trying to load the countries", e);
            }

            System.out.println("Successfully executed!");
        }
    }

    static class ExceptionHandlingGood2 {
        public void executeSomething() throws FileNotFoundException {
            InputStream countryStream = new BufferedInputStream(new FileInputStream("country.txt"));
            System.out.println("Successfully executed!");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
//        new ExeptionHandlingBad1().executeSomething();
//        new ExceptionHandlingBad2().executeSomething();
//        new ExceptionHandlingBad3().executeSomething();
//
//        new ExceptionHandlingGood1().executeSomething();
        new ExceptionHandlingGood2().executeSomething();

    }
}
