package ro.iteahome.java.practices.strings;

import java.util.stream.IntStream;

public class StringBuilderBetter {

    private static String tellMeTheStoryString() {
        String story = "Ana";
        story += " are";
        story += " mere.";
        story += " Andrei";
        story += " are";
        story += " pere";

        return story;
    }

    private static String tellMeTheStoryStringBuilder() {
        StringBuilder story = new StringBuilder("Ana");
        story.append(" are");
        story.append(" mere.");
        story.append(" Andrei");
        story.append(" are");
        story.append(" pere");

        return story.toString();
    }


    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        IntStream.range(1, 1000).forEach((i) -> tellMeTheStoryString());
        long after = System.currentTimeMillis();
        System.out.println("String concatenation: " + (after-before) + " ms");

        before = System.currentTimeMillis();
        IntStream.range(1, 1000).forEach((i) -> tellMeTheStoryStringBuilder());
        after = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (after-before) + " ms");
    }
}
