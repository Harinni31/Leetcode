class Solution {
    public int maxProduct(int n) {
        int org=n;
        int largest =-1;
        int secondLargest=-1;
        while(0<org)
        {
            int rem=org%10;
            if(secondLargest<rem)
            {
                if(largest<rem)
                {
                    secondLargest=largest;
                    largest=rem;
                }
                else
                {
                    secondLargest=rem;
                }
            }
            org=org/10;

        }
        return largest*secondLargest;
    }
}
/*
if (rem > largest) {
    secondLargest = largest;
    largest = rem;
} else if (rem > secondLargest) {
    secondLargest = rem;
}*/