class Solution {
    public int getLucky(String s, int k) {
       StringBuilder sb= new StringBuilder();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        sb.append(c-'a'+1);
       }
       String d=sb.toString();
       int sum=0;
       for(int i=0;i<k;i++){
         sum=0;
        for(int j=0;j<d.length();j++){
            char ch=d.charAt(j);
            sum=sum+(ch-'0');
        }
        d=String.valueOf(sum);
       }
       return sum;
    }
}