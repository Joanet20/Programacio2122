package com.company.Entorns2122.Refactoitzacions.extractMethod;

public class UrlNormalizer {



    public String normalize(String title) {
        String url = "";
        // First we trim whitespaces
        url = title.trim();

        // Remove special chars
        String specialRemoved = "";
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) != ',' && url.charAt(i) != ':'
                    && url.charAt(i) != '.' && url.charAt(i) != '?') {
                specialRemoved += url.charAt(i);
            }
        }

        url = specialRemoved;

        // Replace white spaces with hyphens
        String spacesReplaced = "";
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == ' ') {
                spacesReplaced += "-";
            } else {
                spacesReplaced += url.charAt(i);
            }
        }
        url = spacesReplaced;

        // lowercase everything
        url = url.toLowerCase();

        return url;
    }

    public String trimSpaces (String url){
        return url.trim();
    }

    public String removeSpecialChars (String url){
        String specialRemoved = "";
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) != ',' && url.charAt(i) != ':'
                    && url.charAt(i) != '.' && url.charAt(i) != '?') {
                specialRemoved += url.charAt(i);
            }
        }

        return specialRemoved;
    }

    public String replaceSpaces (String url){
        String spacesReplaced = "";
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == ' ') {
                spacesReplaced += "-";
            } else {
                spacesReplaced += url.charAt(i);
            }
        }
        return spacesReplaced;
    }

    public String urlToLowerCase (String url){
        return url.toLowerCase();
    }

}
