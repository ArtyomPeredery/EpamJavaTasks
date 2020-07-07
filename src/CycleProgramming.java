import java.util.ArrayList;
import java.util.Scanner;

public class CycleProgramming {


public static int Task31(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int x = in.nextInt();
        int sum=0;
        for (int i =1;i<=x; i++){
            sum = sum + i;
        }
        return sum;
    }

public static int Task32(){
    Scanner in = new Scanner(System.in);
    System.out.print("Input the number A: ");
    int a = in.nextInt();
    System.out.print("Input the number B: ");
    int b = in.nextInt();
    System.out.print("Input the number H: ");
    int h = in.nextInt();
    int sum=0;
     while (a <= b){
         if (a > 2) sum += a;
         else
             sum -= a;

       a += h;
     }
return sum;

}

public static int Task33(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+= Math.pow(i,2);
        }
        return sum;
}

public static long Task34(){
    long sum=1;
    for (int i=1;i<=200;i++){
        sum*= Math.pow(i,2);

    }
    return sum;


}

public static float Task35(){
    Scanner in = new Scanner(System.in);
    System.out.print("Input the number e: ");
    double e = in.nextDouble();
    System.out.print("Input the number n: ");
    int n = in.nextInt();
    float sum = 0;
    int znam = 2;
            double temp;
    for (int i=1;i<=n;i++){
        temp = 1/Math.pow(znam,n);
        if (Math.abs(temp) >= e ) sum += temp;
        znam++;
    }
return sum;

}

public static String Task36(){
    Scanner in = new Scanner(System.in);
    System.out.print("Input the string: ");
    String str = in.nextLine();
    String res = "";
    for (int i=0; i < str.length(); i++){
        res += " " + str.charAt(i) + " - " + (int)str.charAt(i);
    }
return res;
}

public static void Task37(){
    Scanner in = new Scanner(System.in);
    System.out.print("Input the number m: ");
    int m = in.nextInt();
    System.out.print("Input the number n: ");
    int n = in.nextInt();
    in.close();
    String res = "";
    for(int j = m; j <= n; j++){

        res =  "делители " + j + " - ";
        for (int i = 1; i <= j; i++)
        {
            if(0 == (j % i))
                if ((i != j)&(i != 1))
                res += i+ ",";
        }
        System.out.println(res);
    }
}

public static void Task38(){
    Scanner in = new Scanner(System.in);
    System.out.print("Input the number m: ");
    int m = in.nextInt();
    System.out.print("Input the number n: ");
    int n = in.nextInt();

    StringBuilder digits1 = new StringBuilder();
    StringBuilder digits2 = new StringBuilder();
    while ((m > 0) & (n>10) ){
     digits1.insert(0, m % 10);
     m /= 10;
        digits2.insert(0, n % 10);
    n /= 10;
    }

    digits1.insert(0, m % 10);
    digits2.insert(0, n % 10);
for (int i=0; i < digits1.length(); i++)
    for (int j=0; j < digits2.length(); j++)
        if (digits1.charAt(i) == digits2.charAt(j))
        System.out.print(digits1.charAt(i));
}
}
