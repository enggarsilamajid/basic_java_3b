import java.util.Scanner;

public class OnTimeExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hoexam = Integer.parseInt(input.nextLine());
        int minexam = Integer.parseInt(input.nextLine());
        int hoarriv = Integer.parseInt(input.nextLine());
        int minarriv = Integer.parseInt(input.nextLine());
        int tminex = (60*hoexam)+minexam;
        int tminar = (60*hoarriv)+minarriv;
        int hour = 0;
        int minute = 0;
        if (tminex < tminar) {
            System.out.println("late");
            int la = tminar-tminex;
            if (la >= 60) {
                hour = la/60;
                minute = la%60;
                if (minute >= 60) {
                    hour = hour+1;
                }
                System.out.printf("%d:%02d hours after the start", hour, minute);
            } else {
                System.out.printf("%d minutes after the start", la);
            }
        } else if ((tminex > tminar) && ((tminex-tminar) > 30)) {
            System.out.println("early");
            int ear = tminex-tminar;
            if (ear >= 60) {
                hour = ear/60;
                minute = ear%60;
                if (minute >= 60) {
                    hour = hour+1;
                }
                System.out.printf("%d:%02d hours before the start", hour, minute);
            } else {
                System.out.printf("%d minutes before the start", ear);
            }
        } else {
            System.out.println("on time");
            int on = tminex-tminar;
            if (on > 0) {
                System.out.printf("%d minutes before the start", on);
            }
        }
    }
}
