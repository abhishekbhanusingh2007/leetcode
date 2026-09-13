class Solution {
    public boolean isPalindrome(int x) {
        String original=Integer.toString(x);
        StringBuilder sb=new StringBuilder(original);
            String rev=sb.reverse().toString();
            return original.equals(rev);
            
            
            

    }
}