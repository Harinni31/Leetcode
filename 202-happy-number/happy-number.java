class Solution {
    public boolean isHappy(int n) {
       int slow=n;
       int fast=n;
       do
       {
        slow=nextno(slow);
        fast=nextno(nextno(fast));
       }while (slow!=fast);
       
     
        return slow==1;
    }
    private static int nextno(int num)
    {
        int sum=0;
         while(num>0)
            {
            int rem=num%10;
            sum+=rem*rem;
            num=num/10;
            }
           
            return sum;

    }
}
/*  HashSet<Integer>set=new HashSet<>();
       while(n!=1)
       {
        int sum=0;
        if(set.contains(n))
        {
            return false;
        }

        set.add(n);
     
            
            while(n>0)
            {
            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
            }
           
            n=sum;

        }
        
        return true;*/