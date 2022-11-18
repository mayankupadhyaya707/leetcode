class Solution 
{
    public boolean isPalindrome(int n) 
    {
        if(n<0 || (n%10==0 && n!=0))
            return false;
        int reversedNum=0;
        while(n>reversedNum)
        {
            int pop=n%10;
            reversedNum=reversedNum*10+pop;
            n=n/10;
        }
        return n==reversedNum||n==reversedNum/10;
    }
    
}