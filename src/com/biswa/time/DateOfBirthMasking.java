package com.biswa.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfBirthMasking {

    public static Date maskDateOfBirth(String dob) {
        try {
            // Parse the input date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(dob);

            // Format the date with asterisks or any other character
            SimpleDateFormat maskedFormat = new SimpleDateFormat("yyyy-##-##");
            return date;
        } catch (ParseException e) {
            // Handle parsing exception
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Example usage
        String originalDateOfBirth = "1990-05-15";
        Date maskedDateOfBirth = maskDateOfBirth(originalDateOfBirth);
        SimpleDateFormat maskedFormat = new SimpleDateFormat("yyyy-##-##");
        System.out.println("Original Date of Birth: " + originalDateOfBirth);
        System.out.println("Masked Date of Birth: " +maskedFormat.format(maskedDateOfBirth));
    }
}

