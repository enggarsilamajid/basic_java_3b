import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budget = Double.parseDouble(input.nextLine());
        String season = input.nextLine();
        String dest = "a";
        String holi = "b";
        double spent = 0;
        if (budget <= 100) {
            dest = "Bulgaria";
            switch (season) {
                case "summer":
                    holi = "Camp";
                    spent = 0.3*budget;
                    break;
                case "winter":
                    holi = "Hotel";
                    spent = 0.7*budget;
                    break;
            }
        } else if (budget > 100 && budget <= 1000) {
            dest = "Balkans";
            switch (season) {
                case "summer":
                    holi = "Camp";
                    spent = 0.4*budget;
                    break;
                case "winter":
                    holi = "Hotel";
                    spent = 0.8*budget;
                    break;
            }
        } else if (budget > 1000) {
            dest = "Europe";
            holi = "Hotel";
            spent = 0.9*budget;
        }
        System.out.printf("Somewhere in %s %n", dest);
        System.out.printf("%s - %.2f", holi, spent);
    }
}
