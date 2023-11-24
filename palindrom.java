class Solution {
    public boolean isPalindrome(int x) {
        int sing = 1;
        if(x<0){
            sing = -1;
            x=-x;
        }
        int reverse=0;int original = x;
        while(x>=1){
            int x1= x%10;
            x/=10;
            reverse=(reverse*10)+x1;
           
        }
       
        return reverse==original*sing;
    }
}