package com.mycompany.guessit;
import java.util.*;
public class GuessIt 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 1 + (int)(100* Math.random());
        int i,choice,k=0;
        
        System.out.println("------------------------------------------------");
        System.out.println("               GUESS THE NUMBER");
        System.out.println("------------------------------------------------");
        System.out.println("A number is randomly selected between 1 to 100");
        System.out.println("You have 5 chances to guess the number ");
        System.out.println("With each guess you loose 100 points");
        System.out.println("------------------------------------------------");
        System.out.println("                 BEST OF LUCK");
        for(i=0;i<5;i++)
        {
            System.out.println("------------------------------------------------");
            System.out.println("Enter the Guess :");
            choice=sc.nextInt();
            if(choice==n)
            {
                System.out.println("!! CONGRATS !!");
                System.out.println("You have guessed the number correctly.");
                System.out.println("You have earned "+(500-(i*100))+" Points");
                k=1;
                break;
            }
            else 
            {
                if(n>choice)
                {
                    System.out.println("!! WRONG GUESS !!");
                    System.out.println("The number is greater than " + choice);
                    k=0;
                }
                else
                {
                    System.out.println("!! WRONG GUESS !!");
                    System.out.println("The number is smaller than " + choice);
                    k=0;
                }
            }
        }
        if(k==0)
        {
            System.out.println("------------------------------------------------");
            System.out.println("The number was "+n);
            System.out.println("------------------------------------------------");
            System.out.println("You have used all your chances");
            System.out.println("BETTER LUCK NEXT TIME");
            System.out.println("You Scored 0 Points");
            System.out.println("------------------------------------------------");
        }
    }
}