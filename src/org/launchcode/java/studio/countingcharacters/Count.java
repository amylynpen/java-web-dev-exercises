package org.launchcode.java.studio.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {

    public static void main(String [] args) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there";

        char[] charactersInString = myString.toCharArray();



        for (char c : charactersInString) {
            if (charCount.containsKey(c)) {

                charCount.put(c, charCount.get(c) + 1);
            }
            else {

                charCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> onChar : charCount.entrySet()) {
            System.out.println(onChar.getKey() + " " + onChar.getValue());
        }
    }


}