package com.biswa.time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MaskedDOBExample {

    public static void main(String[] args) {
        String maskedDOBString = "01-01-1990"; // Your masked date of birth

        // Define the format of the masked date
        DateTimeFormatter maskedDOBFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse the masked date of birth
        LocalDate maskedDOB = LocalDate.parse(maskedDOBString, maskedDOBFormatter);

        // Print the masked date of birth
        System.out.println("Masked DOB: " + maskedDOB);
    }
}

