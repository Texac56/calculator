import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Введите число1: ");
        float num = scan.nextFloat();
        System.out.println("Введите число2: ");
        float num1 = scan.nextFloat();
        float res = num + num1;
        float res1 = num - num1;
        float res2 = num * num1;
        float res3 = num / num1;
        System.out.println("Результат: ");
        System.out.println(res + "\n" + res1 + "\n" + res2 + "\n" + res3 + "\n");
    }

}