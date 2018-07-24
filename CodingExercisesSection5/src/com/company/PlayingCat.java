package com.company;

public class PlayingCat {

    public static void main(String[] args) {

        boolean catPlayed = isCatPlaying(true, 10);
        System.out.println("Cat played " + catPlayed);

        catPlayed = isCatPlaying(false, 36);
        System.out.println("Cat played " + catPlayed);

        catPlayed = isCatPlaying(false, 35);
        System.out.println("Cat played " + catPlayed);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxTemperature = 35;
        int maxTemperatureSummer = 45;
        int minTemperature = 25;

        if (summer && temperature <= maxTemperatureSummer && temperature >= minTemperature) {
            return true;
        }

        if (!summer && temperature <= maxTemperature && temperature >= minTemperature) {
            return true;
        }

        return false;
    }
}
