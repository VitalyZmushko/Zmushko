package by.just_learn_java_1;

import java.util.Scanner;

public class GalToLit {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       // gal_to_lit();
       // System.out.println(weightOnMoon(scan.nextInt()));
        String string = "12.84";
        double result = Double.parseDouble(string);
        result = Math.round(result);
        System.out.println(result);
    }

    private static double weightOnMoon(int weight) {
        double coefficients = 0.83;
        return coefficients * weight;
    }

    private static void gal_to_lit() {
        double litres;
        int counter = 0;
        for (double gallons = 0; gallons < 100; gallons++) {
            litres = gallons * 3.7856;
            System.out.printf("В %.0f галлонах %.4f литров", gallons, litres);
            System.out.println();
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
