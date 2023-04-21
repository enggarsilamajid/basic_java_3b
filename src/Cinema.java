import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String project = input.nextLine();
        int row = Integer.parseInt(input.nextLine());
        int column = Integer.parseInt(input.nextLine());
        double income = 0;
        if (project.equals("Premiere")) {
            income = 12.00*row*column;
        } else if (project.equals("Normal")) {
            income = 7.50*row*column;
        } else if (project.equals("Discount")) {
            income = 5.00*row*column;
        }
        System.out.printf("%.2f USD", income);
    }
}
