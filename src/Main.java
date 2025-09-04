import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        System.out.println("Выберите, как будет проходить умножение: \n1 - множественное сложение\n2 - через логарифм\n3 - через рекурсию");
        int what = sc.nextInt();
        switch (what){
            case 1:
                MultiSum(a, b);
                break;
            case 2:
                MultiLog(a, b);
                break;
            case 3:
                System.out.println("Ответ: "+MultiRecurs(a, b));
                break;
            default:
                System.out.println("Такого варианта в списке нет");
                break;
        }

    }

    public static void MultiSum(int a, int b){
        int res = 0;
        for(int i = 1; i<=a; i++){
            res+=b;
        }
        System.out.println("Ответ: "+res);
    }

    public static void MultiLog(int a, int b){
        double aLog = Math.log10(a);
        double bLog = Math.log10(b);
        double c = aLog+bLog;
        int res = (int) Math.pow(10, c);
        System.out.println("Ответ: "+res);
    }

    public static int MulRec(int summand, int steps_count){
        if(steps_count>0){
            return summand + MultiRecurs(summand, steps_count-1);
        }else{
            return 0;
        }
    }
    public static int MultiRecurs(int a, int b){
        int summand;
        int steps_count;
        Boolean negative;
        if(a>b){
            summand = a;
            steps_count=Math.abs(b);
            negative = (b<0);
        }else{
            summand=b;
            steps_count=Math.abs(a);
            negative = (a<0);
        }
        int sum=MulRec(summand, steps_count);
        return negative ? -sum : sum;
    }

}