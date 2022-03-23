package com.company.Entorns2122.Refactoitzacions.magicNumbers;

import java.util.Random;

public class PasswordGenerator {

    private Random random = new Random();
    private String characters = "abcdefghijkmnopqrstuvwxyz23456789";

    private static int MIN_LENGTH = 6;
    private static int MAX_LENGTH = 15;

    public String generatePassword(int length, int minLength, int maxLength) throws Exception {
        if (length < minLength || length > maxLength) {
            throw new Exception("Wrong password length: " + length);
        } else {
            String password = "";

            for (int i = 0; i < length; i++)
                password += characters.charAt(random.nextInt(characters.length()));

            return password;
        }
    }
}
