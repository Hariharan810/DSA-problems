class ArmstrongNumbers {
    static String armstrongNumber(int n){
        int num=n;
        int sum=0;
        while(num>0){
            int temp=num%10;
            int cube=temp*temp*temp;
            sum+=cube;
            num/=10;
        }
        if(n==sum){
            return "Yes";
        }else{
            return "No";
        }
    }
}
