package com.company.Entorns2122.Refactoitzacions.inlineMethod;

public class UrlCleaner {
    public String clean(String title) {

        String url = "";

        return url.replaceAll("[\\s]+", " ").replaceAll("[\\s]", "-").replaceAll("[\\.\\:\\,\\?\\!\\_\\;]", "").trim();
    }

}
