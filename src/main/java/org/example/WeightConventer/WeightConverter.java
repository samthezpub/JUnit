package org.example.WeightConventer;

public class WeightConverter {

    // Перевод из миллиграммов в граммы
    public static double milligramsToGrams(double milligrams) {
        return milligrams / 1000;
    }

    // Перевод из граммов в килограммы
    public static double gramsToKilograms(double grams) {
        return grams / 1000;
    }

    // Перевод из килограммов в центнеры
    public static double kilogramsToCentners(double kilograms) {
        return kilograms / 100;
    }

    // Перевод из центнеров в тонны
    public static double centnersToTonnes(double centners) {
        return centners / 10;
    }

    // Перевод из тонн в килограммы
    public static double tonnesToKilograms(double tonnes) {
        return tonnes * 1000;
    }
}