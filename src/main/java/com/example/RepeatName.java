package com.example;

import java.util.Scanner;

class display
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter number of times");
    int n=sc.nextInt();
int i;
System.out.println("\n\n\nUsing For Loop");
    for( i=0;i<n;i++)
    {
        System.out.println("Ganesh");
    }
i=0;
System.out.println("\n\n\nwhile");
    while(i<n){
        
        System.out.println("Ganesh");
        i++;
    }
    i=0;
    System.out.println("\n\n\n\ndowhile");

    do
    {System.out.println("Ganesh");
i++;}
    while(i<n);
  }
}