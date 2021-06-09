package JavaCodes;

import java.util.Scanner;

public class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int r;
        int sum=0;
        int temp=n;

        while(n>0)
        {
            r=n%10;
            sum = sum +(r*r*r);
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong Number");
        }
        else
            System.out.println("Not Armstrong");
    }
}
