package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {


        String regex1 = "#.*";//check if the color starts with #
        Pattern hashtagAtStart = Pattern.compile(regex1);
        //String regex3 = "#[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]";//works
        //String regex3 = "[0-9a-fA-F]{3}";//doesn't work
        //String regex3 = "([0-9a-fA-F]){3}";//doesn't work
        String regex3 = "#{1}[0-9a-fA-F]{3}";
        Pattern colorHex3 = Pattern.compile(regex3);
        //String regex6 = "#[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]";//works
        //String regex6 = "[0-9a-fA-F]{6}";//doesn't work
        //String regex6 = "([0-9a-fA-F]){6}"//doesn't work
        String regex6 = "#{1}[0-9a-fA-F]{6}";
        Pattern colorHex6 = Pattern.compile(regex6);
        if (color == null || !hashtagAtStart.matcher(color).matches()){
            return false;
        }else{

            boolean three = colorHex3.matcher(color).matches();
            boolean six = colorHex6.matcher(color).matches();
            return three || six;
        }

    }
}





