package com.company.CorreccioExamenSegonaAv;

public class Caesar {

    public String xifrarText (String textClar){

        char[] charsTextClar = new char[textClar.length()];
        String textXifrat = "";

        for (int i = 0; i < charsTextClar.length; i++){
            charsTextClar[i] = textClar.charAt(i);
        }

        char aux;

        for (int i = 0; i < charsTextClar.length; i++){

            for (int j = i+4; j < charsTextClar.length; j++){

                if (j >= charsTextClar.length){
                    j = j - charsTextClar.length;
                }

                aux = charsTextClar[j];

                charsTextClar[j] = charsTextClar[i];

                charsTextClar[i] = aux;
            }
        }

        textXifrat = String.valueOf(charsTextClar);

        return textXifrat;
    }


    public String desxifrarText (String textXifrat) {

        char[] charTextXifrat = new char[textXifrat.length()];
        String textClar = "";

        for (int i = 0; i < charTextXifrat.length; i++){
            charTextXifrat[i] = textXifrat.charAt(i);
        }

        char aux;

        for (int i = 0; i < charTextXifrat.length; i++){

            for (int j = i-4; j < charTextXifrat.length; j++){

                if (j < 0){
                    j = j + charTextXifrat.length;
                }

                aux = charTextXifrat[j];

                charTextXifrat[j] = charTextXifrat[i];

                charTextXifrat[i] = aux;
            }
        }

        textClar = String.valueOf(charTextXifrat);

        return textClar;
    }
}
