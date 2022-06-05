// Tn=1/2n(n+1)
import java.util.Scanner;
public class lession_two {
public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Введите число: ");
    boolean flag = iScanner.hasNextInt();
    if (flag == true) {
        int x = iScanner.nextInt();
        System.out.println(x);
        int z = x/2*(x+1);
        System.out.println("Результат треугольного числа = " + z);
    }
    else{
        System.out.println("Введите целое число!");
    }
    iScanner.close();
}
}
