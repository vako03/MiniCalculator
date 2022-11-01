import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  num1;
        String  num2;
        String op;

        System.out.println("num 1 = ");
        num1 = scanner.next();
        System.out.println("num 2 = ");
        num2 = scanner.next();
        System.out.println("op  ");
        op=scanner.next();

        double num1d;
        double num2d;
        double res=0;

        num1d = Double.parseDouble(num1);
        num2d = Double.parseDouble(num2);

        if (op.equals("+")){
            res = num1d + num2d;
        }else  if (op.equals("-")){
            res = num1d - num2d;
        }else {
            System.out.println("Unknown operation");
        }

        System.out.println(res);
        String someString = " " + num1d;
        someString=Double.toHexString(num1d);


    }
}