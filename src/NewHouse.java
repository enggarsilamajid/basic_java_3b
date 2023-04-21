import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String flower = input.nextLine();
        int num = Integer.parseInt(input.nextLine());
        int budget = Integer.parseInt(input.nextLine());
        double price = 0;
        switch (flower) {
            case "Roses":
                price = 5*num;
                if (num > 80) {
                    price = 5*num-(5*num*0.1);
                } break;
            case "Dahlias":
                price = 3.80*num;
                if (num > 90) {
                    price = 3.80*num-(3.80*num*0.15);
                } break;
            case "Tulips":
                price = 2.80*num;
                if (num > 80) {
                    price = 2.80*num-(2.80*num*0.15);
                } break;
            case "Narcissus":
                price = 3*num;
                if (num < 120) {
                    price = 3*num+(3*num*0.15);
                } break;
            case "Gladiolus":
                price = 2.50*num;
                if (num < 80) {
                    price = 2.50*num+(2.50*num*0.2);
                } break;
        } double pay = budget-price;
        if (pay < 0) {
            pay = Math.abs(pay);
            System.out.printf("Not enough money, you need %.2f USD more.", pay);
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f USD left.", num, flower, pay);
        }
    }
}
