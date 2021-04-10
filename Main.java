package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        int count=0;                                      // counts the number of factors
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        for(i=1;i<=n;i++)
            if(n % i == 0)                                // checking the factors of the number (n)
                count++;
        if(count == 2)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number");
    }
}
