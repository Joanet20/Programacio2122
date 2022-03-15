package com.company.Entorns2122.Refactoitzacions.magicNumbers;

import java.util.Random;

public class PasswordGenerator {

    private Random random = new Random();
    private String characters = "abcdefghijkmnopqrstuvwxyz23456789";

    public String generatePassword(int length, int longitudMin, int longitudMax) throws Exception {
        if (length < longitudMin || length > longitudMax) {
            throw new Exception("Wrong password length: " + length);
        } else {
            String password = "";

            for (int i = 0; i < length; i++)
                password += characters.charAt(random.nextInt(characters.length()));

            return password;
        }
    }
}
