package by.just_learn_java_1;

public class GalToLit {
    public static void main(String[] args) {
        gal_to_lit();

    }

    private static void gal_to_lit() {
        double litres;
        int counter = 0;
        for (double gallons = 0; gallons < 100; gallons++) {
            litres = gallons * 3.7856;
            System.out.printf("В %.0f галлонах %.3f литров", gallons, litres);
            System.out.println();
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
