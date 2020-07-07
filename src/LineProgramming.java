import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LineProgramming extends BranchProgramming{
    public static String Task11(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number A: ");
        float A = in.nextInt();

        System.out.print("Input a number B: ");
        float B = in.nextInt();

        System.out.print("Input a number C: ");
        float C = in.nextInt();

        float Z = ((A - 3)*B/2) + C;
        return "(("+A+" - 3.0) * "+B+" / 2.0) + "+C+" = "+Z;
    }

    public static double Task12(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number A: ");
        float a = in.nextInt();

        System.out.print("Input a number B: ");
        float b = in.nextInt();

        System.out.print("Input a number C: ");
        float c = in.nextInt();

   return (b+Math.pow(Math.pow(b,2)+4*a*c,0.5))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
   }

    public static  double Task13(){
       Scanner in = new Scanner(System.in);
       System.out.print("Input a number(degrees) X: ");
        float x = in.nextInt();

       System.out.print("Input a number(degrees) Y: ");
        float y = in.nextInt();

        double X = Math.toRadians(x);
        double Y = Math.toRadians(y);

       return ((Math.sin(X)+Math.cos(Y))/(Math.cos(X)-Math.sin(Y)))*Math.tan(X*Y);

   }

    public  static String Task14(){
       Scanner in = new Scanner(System.in);
       System.out.print("Input a number xxx.xxx type: ");
            double x = in.nextDouble();
            double right = Math.round(x);
            double left = (x - right)*1000;

        return (int)left+"."+(int)right;
   }

    public static String Task15(){
       Scanner in = new Scanner(System.in);
       System.out.print("Input a number of seconds to convert: ");
        int seconds = in.nextInt();

       return new SimpleDateFormat("HHчmmмssс").format(new Date(TimeUnit.SECONDS.toMillis(seconds-10800)));
    }

    public static boolean Task16(){

        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();

        System.out.print("Input y: ");
        int y = in.nextInt();

        return (y>-3)&(y<4)&(x<4)&(x>-4);
    }
}


