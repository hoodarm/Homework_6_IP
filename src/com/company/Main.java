package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int w = 11;
        int p = 0;
        if (w <= 2)
        {
            p = 3;
        }
        if (w > 5)
        {
            p = 9 + (w - 5) * 3;
        }
        else
        {
            p = 3 + (w - 2) * 2;
        }
        System.out.println(p);
    }
}
