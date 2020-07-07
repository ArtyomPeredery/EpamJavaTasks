import java.util.Scanner;

public class Program extends LineProgramming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of task (num of section and num of task together): ");
        int select = in.nextInt();
        switch (select) {
            case 11:System.out.println(Task11());break;
            case 12:System.out.println(Task12());break;
            case 13:System.out.println(Task13());break;
            case 14:System.out.println(Task14());break;
            case 15:System.out.println(Task15());break;
            case 16:System.out.println(Task16());break;
            case 21:System.out.println(Task21());break;
            case 22:System.out.println(Task22());break;
            case 23:System.out.println(Task23());break;
            case 24:System.out.println(Task24());break;
            case 25:System.out.println(Task25());break;
            case 31:System.out.println(Task31());break;
            case 32:System.out.println(Task32());break;
            case 33:System.out.println(Task33());break;
            case 34:System.out.println(Task34());break;
            case 35:System.out.println(Task35());break;
            case 36:System.out.println(Task36());break;
            case 37:Task37();break;
            case 38:Task38();break;
        }

    }
}
