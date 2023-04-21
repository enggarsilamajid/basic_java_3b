import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int budget = Integer.parseInt(input.nextLine());
        String season = input.nextLine();
        int num = Integer.parseInt(input.nextLine());
        double total = 0;
        double rent = 0;
        if (budget > 0 && budget <= 8000) {
            switch (season) {
                case "Spring":
                    rent = 3000;
                    break;
                case "Summer":
                case "Autumn":
                    rent = 4200;
                    break;
                case "Winter":
                    rent = 2600;
                    break;
            }
            if (num <= 6) {
                total = rent - (rent * 0.1);
            } else if (num > 6 && num <= 11) {
                total = rent - (rent * 0.15);
            } else if (num > 11) {
                total = rent - (rent * 0.25);
            }
            if ((num % 2 == 0) && (!season.equals("Autumn"))) {
                total = total - (total * 0.05);
            }
            double rem = budget - total;
            if (rem >= 0) {
                System.out.printf("Yes! You have %.2f USD left.", rem);
            } else {
                rem = Math.abs(rem);
                System.out.printf("Not enough money! You need %.2f USD.", rem);
            }
        }
    }
}