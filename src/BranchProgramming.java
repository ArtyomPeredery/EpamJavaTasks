import java.util.Scanner;

public class BranchProgramming extends CycleProgramming {

public static String Task21() {
    Scanner in = new Scanner(System.in);
    System.out.print("Input x angle: ");
    int x = in.nextInt();
    System.out.print("Input y angle: ");
    int y = in.nextInt();
    int z = 180 - x - y;

    if ((x + y + z == 180)&(x>0)&(y>0)&(z>0)) {
        if ((x == 90) | (y == 90) | (z == 90)){
            return "прямоугольный";
        }
        else return "произвольный";

    } else return "не треугольник";
}

public static int Task22(){
    Scanner in = new Scanner(System.in);
    System.out.print("Input a: ");
    int a = in.nextInt();
    System.out.print("Input b: ");
    int b = in.nextInt();
    System.out.print("Input c: ");
    int c = in.nextInt();
    System.out.print("Input d: ");
    int d = in.nextInt();
    return Math.max(Math.min(a,b), Math.min(c,d));
}

public static boolean Task23(){
    Scanner in = new Scanner(System.in);
    System.out.print("Input A(x1, ..): ");
    int x1 = in.nextInt();
    System.out.print("Input A(.., y1): ");
    int y1 = in.nextInt();
    System.out.print("Input B(x2, ..): ");
    int x2 = in.nextInt();
    System.out.print("Input B(.. , y2: ");
    int y2 = in.nextInt();
    System.out.print("Input C(x3, ..): ");
    int x3 = in.nextInt();
    System.out.print("Input C(.. , y3: ");
    int y3 = in.nextInt();

    return  ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1));
}

public static boolean Task24(){
    Scanner in = new Scanner(System.in);
    System.out.print("Input A(cm): ");
    int a = in.nextInt();
    System.out.print("Input B(cm): ");
    int b = in.nextInt();
    System.out.print("Input X(cm): ");
    int x = in.nextInt();
    System.out.print("Input Y(cm): ");
    int y = in.nextInt();
    System.out.print("Input Z(cm): ");
    int z = in.nextInt();

    if (((a >= x)&(b>=y))|((b >= x)&(a >= y)))
        return true;
    else {
      if (((a >= x)&(b>=z))|((a >= z)&(a >= x)))
          return true;
      else {
          if (((a >= y)&(b>=z))|((a >= z)&(a >= y)))
              return true;
          else return false;
      }
    }
}

public static double Task25(){
    Scanner in = new Scanner(System.in);
    System.out.print("Input X: ");
    int x = in.nextInt();
    double res=0;
    if (x<=3) res = Math.pow(x,2)-(3*x)+9;
    else
        if (x>3) res = 1/(Math.pow(x,3)+6 );
return res;
}

}
