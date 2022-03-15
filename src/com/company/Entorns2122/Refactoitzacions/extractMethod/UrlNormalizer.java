package com.company.Entorns2122.Refactoitzacions.extractMethod;

public class UrlNormalizer {

    public String trimWhiteSpaces(String title){
        String url = "";
        url = title.trim();
        return url;
    }

    public String removeSpecialCharacters(String title){
        String specialRemoved = "";

        for (int i = 0; i < trimWhiteSpaces(title).length(); i++) {
            if (trimWhiteSpaces(title).charAt(i) != ',' && trimWhiteSpaces(title).charAt(i) != ':'
                    && trimWhiteSpaces(title).charAt(i) != '.' && trimWhiteSpaces(title).charAt(i) != '?') {
                specialRemoved += trimWhiteSpaces(title).charAt(i);
            }
        }

        return specialRemoved;
    }

    public String replaceWhiteSpaces(String title){
        String spacesReplaced = "";
        for (int i = 0; i < trimWhiteSpaces(title).length(); i++) {
            if (trimWhiteSpaces(title).charAt(i) == ' ') {
                spacesReplaced += "-";
            } else {
                spacesReplaced += trimWhiteSpaces(title).charAt(i);
            }
        }

        return spacesReplaced;
    }

    public String minuscules(String title){

        String textMinus = "";
        textMinus = trimWhiteSpaces(title).toLowerCase();

        return textMinus;
    }

}
