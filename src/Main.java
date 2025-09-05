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
        switch (what){
            case 1:
                multiSumFor(a, b);
                break;
            case 2:
                multiLog(a, b);
                break;
            case 3:
                System.out.println("Ответ: "+multiRecurs(a, b));
                break;
            case 4:
                multiSumWhile(a, b);
                break;
            case 5:
                multiPower(a, b);
                break;
            default:
                System.out.println("Такого варианта в списке нет");
                break;
        }

    }

    public static void multiSumFor(int a, int b){
        int res = 0;
        for(int i = 1; i<=a; i++){
            res+=b;
        }
        System.out.println("Ответ: "+res);
    }

    public static void multiLog(int a, int b){
        double aLog = Math.log10(a);
        double bLog = Math.log10(b);
        double c = aLog+bLog;
        int res = (int) Math.pow(10, c);
        System.out.println("Ответ: "+res);
    }

    public static int mulRec(int summand, int steps_count){
        if(steps_count>0){
            return summand + multiRecurs(summand, steps_count-1);
        }else{
            return 0;
        }
    }
    public static int multiRecurs(int a, int b){
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
        int sum=mulRec(summand, steps_count);
        return negative ? -sum : sum;
    }

    public static void multiSumWhile(int a, int b){
        int sum = 0;
        while(b>0){
            sum+=a;
            b--;
        }
        System.out.println("Ответ: "+sum);
    }

    public static boolean isPowerTwo(int n){
        return n>0 && (n & (n-1))==0;
    }

    public static void multiPower(int a, int b){
        int ost = 0;
        while(!isPowerTwo(b)){
            ost++;
            b--;
        }
        int res = a << (int)(Math.log(b)/Math.log(2));
        for(int i = 1; i<=ost; i++){
            res+=a;
        }
        System.out.println("Ответ: "+res);
    }

}