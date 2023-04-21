import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = Integer.parseInt(input.nextLine());
        String type = input.nextLine();
        String grade = input.nextLine();
        int night = day-1;
        double pnight = 0;
        double price = 0;
        switch (type) {
            case "room for one person":
                pnight = 18.00;
                price = night*pnight;
                break;
            case "apartment":
                pnight = 25.00;
                price = (night*pnight);
                if (day < 10) {
                    price = price-(0.3*price);
                } else if (day >= 10 && day <= 15) {
                    price = price-(0.35*price);
                } else {
                    price = price-(0.5*price);
                }
                break;
            case "president apartment":
                pnight = 35.00;
                price = (night*pnight);
                if (day < 10) {
                    price = price-(0.1*price);
                } else if (day >= 10 && day <= 15) {
                    price = price-(0.15*price);
                } else {
                    price = price-(0.2*price);
                }
                break;
            }
            if (grade.equals("positive")) {
                price = price + (price * 0.25);
            } else if(grade.equals("negative")) {
                price = price - (price * 0.1);
            }
            System.out.printf("%.2f", price);
    }
}