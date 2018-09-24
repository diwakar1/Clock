package com.company;

import java.text.DecimalFormat;

public class Main
{

    public static void main(String[] args)
    {
        DecimalFormat f = new DecimalFormat("00");
        for(int hours = 1; hours<=12; hours++)
        {
            for(int minutes= 0; minutes<= 59; minutes++)
            {
                for (int seconds= 0; seconds<=59; seconds++)
                {
                    System.out.print(f.format(hours)+ ": ");
                    System.out.print(f.format(minutes)+ ": ");
                    System.out.println(f.format(seconds)+ ": ");
                }
            }
        }
    }
}
