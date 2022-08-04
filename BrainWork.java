package com.tony.java;

import java.util.Scanner;

public class BrainWork {

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input Grade:");
        double passGrade = input.nextDouble();
        int y;
        int x = 10;
        int total = 0;

        if(passGrade >= 60)
        {
            if(passGrade >= 75)
            {
                while(x<=100)
                {
                    y = (x += x);
                    System.out.println(y);
                    total += y;
                    x+=10;
                }
            }
            else
            {
                while(x>0)
                {
                    y = x * x;
                    System.out.println(y+=2);
                    total += y;
                    x-=2;
                }
            }
        }
        else
        {
            while(x!=0)
            {
                y = x-2;
                total += y;
                System.out.println(y);
                --x;
            }

        }
        System.out.println(total);
    }
}
