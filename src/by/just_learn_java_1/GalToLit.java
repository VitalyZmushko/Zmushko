package by.just_learn_java_1;

public class GalToLit {
    public static void main(String[] args) {
        gal_to_lit();

    }

    private static void gal_to_lit() {
        double gallons = 10;
        double litres;
        litres = gallons * 3.7856;
        System.out.printf("В %.0f галлонах %.3f литров", gallons, litres);
    }
}
