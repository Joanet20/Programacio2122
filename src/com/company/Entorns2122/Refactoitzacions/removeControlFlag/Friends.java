package com.company.Entorns2122.Refactoitzacions.removeControlFlag;

public class Friends {

    private String[] friends;

    public Friends (String[] friends) {
        this.friends = friends;
    }

    public int indexOf (String friend) {
        boolean found = false;
        //int i = 0;

        /*while (i < friends.length && !found ) {
            if (friends[i].equals(friend)) {
                found = true;
            }
            i++;
        }

        if (found) {
            return (i-1);
        } else {
            return -1;
        }*/

        for (int i = 0; i < friends.length; i++){

            if (friends[i].equals(friend)) {
                found = true;
            }

            if (found){
                return (i-1);
            } else {
                return -1;
            }

        }
        return -1;
    }

}
