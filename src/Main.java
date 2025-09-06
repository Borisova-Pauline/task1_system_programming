import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        System.out.println("Выберите, как будет проходить умножение:\n1 - множественное сложение через цикл for" +
                "\n2 - через логарифм\n3 - через рекурсию\n4 - через сложение в цикле while" +
                "\n5 - через сдвиговую операцию");
        int what = sc.nextInt();
        Multiple multiple = new Multiple();
        switch (what){
            case 1:
                System.out.println("Ответ: "+multiple.multiSumFor(a, b));
                break;
            case 2:
                System.out.println("Ответ: "+multiple.multiLog(a, b));
                break;
            case 3:
                System.out.println("Ответ: "+multiple.multiRecurs(a, b));
                break;
            case 4:
                System.out.println("Ответ: "+multiple.multiSumWhile(a, b));
                break;
            case 5:
                System.out.println("Ответ: "+multiple.multiPower(a, b));
                break;
            default:
                System.out.println("Такого варианта в списке нет");
                break;
        }

    }
}