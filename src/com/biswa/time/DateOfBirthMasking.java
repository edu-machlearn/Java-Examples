package com.biswa.time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfBirthMasking {

    public static void main(String[] args) throws ParseException {
        // Original date of birth
        String originalDOBString = "1990-05-15"; // Replace this with the actual date of birth

        // Parse the original date string
        SimpleDateFormat originalDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date originalDOB = originalDateFormat.parse(originalDOBString);

        // Mask the date of birth
        Date maskedDOB = maskDateOfBirth(originalDOB);

        // Print the results
        System.out.println("Original Date of Birth: " + originalDOB);
        System.out.println("Masked Date of Birth: " + maskedDOB);
    }

    private static Date maskDateOfBirth(Date originalDOB) {
        // Here, you can implement your logic to mask the date of birth.
        // For example, you may want to set the day and month to a default value,
        // while keeping the year unchanged.

        // In this example, we are setting day and month to 01.
        SimpleDateFormat maskedDateFormat = new SimpleDateFormat("yyyy-##-##");
        String maskedDOBString = maskedDateFormat.format(originalDOB);

        try {
            return maskedDateFormat.parse(maskedDOBString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
