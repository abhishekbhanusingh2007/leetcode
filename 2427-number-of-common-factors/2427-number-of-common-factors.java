class Solution {
    public int commonFactors(int a, int b) {
        int g= gcd(a,b);
        int count=0;
        for(int i=1;i<=g;i++){
            if(g%i==0){
                count++;
            }
        }
        return count;
    }
    public static int gcd(int x,int y){
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
            return x;
    }

}  