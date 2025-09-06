public class Multiple {

    public int multiSumFor(int a, int b){
        int res = 0;
        for(int i = 1; i<=a; i++){
            res+=b;
        }
        return res;
    }

    public int multiLog(int a, int b){
        double aLog = Math.log10(a);
        double bLog = Math.log10(b);
        double c = aLog+bLog;
        int res = (int) Math.pow(10, c);
        return res;
    }

    public int mulRec(int summand, int steps_count){
        if(steps_count>0){
            return summand + multiRecurs(summand, steps_count-1);
        }else{
            return 0;
        }
    }
    public int multiRecurs(int a, int b){
        int summand;
        int steps_count;
        boolean negative;
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

    public int multiSumWhile(int a, int b){
        int sum = 0;
        while(b>0){
            sum+=a;
            b--;
        }
        return sum;
    }

    public boolean isPowerTwo(int n){
        return n>0 && (n & (n-1))==0;
    }

    public int multiPower(int a, int b){
        int ost = 0;
        while(!isPowerTwo(b)){
            ost++;
            b--;
        }
        int res = a << (int)(Math.log(b)/Math.log(2));
        for(int i = 1; i<=ost; i++){
            res+=a;
        }
        return res;
    }
}
