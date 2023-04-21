import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = input.nextLine();
        int night = Integer.parseInt(input.nextLine());
        double studio = 0;
        double apart = 0;
        double price1 = 0;
        double price2 = 0;
        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apart = 65;
                if (night > 14) {
                    studio = studio-(studio*0.3);
                    apart = apart-(apart*0.1);
                } else if (night > 7 && night <= 14) {
                    studio = studio-(studio*0.05);
                }
                break;
            case "June":
            case "September":
                studio = 75.20;
                apart = 68.70;
                if (night > 14) {
                    studio = studio-(studio*0.2);
                    apart = apart-(apart*0.1);
                }
                break;
            case "July":
            case "August":
                studio = 76;
                apart = 77;
                if (night > 14) {
                    apart = apart-(apart*0.1);
                }
                break;
        }
        price1 = apart*night;
        price2 = studio*night;
        System.out.printf("Apartment: %.2f USD.%n", price1);
        System.out.printf("Studio: %.2f USD.", price2);
    }
}
