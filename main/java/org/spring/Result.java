package org.spring;

public class Result {

    public static void typeCounter(String sentence) {

        int stringCount = 0;
        int integerCount = 0;
        int doubleCount = 0;

        String[] words = sentence.split(" ");


        for (String word : words) {
            if (isInteger(word)) {
                integerCount++;
            } else if (isDouble(word)) {
                doubleCount++;
            } else {
                stringCount++;
            }
        }

        System.out.println("String count: " + stringCount);
        System.out.println("Integer count: " + integerCount);
        System.out.println("Double count: " + doubleCount);
    }


    public static boolean isInteger(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static boolean isDouble(String word) {
        try {
            Double.parseDouble(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
