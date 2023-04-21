import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deg = Integer.parseInt(input.nextLine());
        String time = input.nextLine();
        String cloth = "a";
        String shoes = "b";
        if (deg >= 10 && deg <= 18) {
            if (time.equals("Morning")) {
                cloth = "Sweatshirt";
                shoes = "Sneakers";
            }
            else if (time.equals("Afternoon")) {
                cloth = "Shirt";
                shoes = "Moccasins";
            }
            else if (time.equals("Evening")) {
                cloth = "Shirt";
                shoes = "Moccasins";
            }
        } else if (deg > 18 && deg <= 24) {
            if (time.equals("Morning")) {
                cloth = "Shirt";
                shoes = "Moccasins";
            }
            else if (time.equals("Afternoon")) {
                cloth = "T-Shirt";
                shoes = "Sandals";
            }
            else if (time.equals("Evening")) {
                cloth = "Shirt";
                shoes = "Moccasins";
            }
        } else if (deg >= 25 && deg <= 42) {
            if (time.equals("Morning")) {
                cloth = "T-Shirt";
                shoes = "Sandals";
            }
            else if (time.equals("Afternoon")) {
                cloth = "Swim Suit";
                shoes = "Barefoot";
            }
            else if (time.equals("Evening")) {
                cloth = "Shirt";
                shoes = "Moccasins";
            }
        } if (cloth != "a" || shoes != "b") {
            System.out.printf("It's %d degrees, get your %s and %s.", deg, cloth, shoes);
        }
    }
}
