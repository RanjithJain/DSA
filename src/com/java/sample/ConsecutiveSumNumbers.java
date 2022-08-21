package com.java.sample;

class ConsecutiveSumNumbers
{
    static void findConsecutive(int N)
    {

        int start =1;
        int end = (N+1)/2;
        int sum=0;
        while (start<end){

            for(int i=start;i<=end;i++){
                sum=sum+i;
                if(sum==N){

                    for(int j=start;j<=i;j++){
                        System.out.print(j+" ");

                    }
                    System.out.println("");
                    break;
                }
                if(sum>N){
                    break;
                }

            }

            start++;
            sum=0;
        }

    }

    // Driver code
    public static void main (String[] args)
    {
        int N = 25;
        findConsecutive(N);
    }
}
