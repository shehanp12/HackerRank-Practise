package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sun= new Scanner(System.in);

        int a = sun.nextInt();

        if(a%2!=0){
            System.out.println("Weird");
        }
        else if(a%2==0 && 2<a && a<=5){
            System.out.println("Not Weird");

        }
        else if(a%2==0 && 6<a && a<=20){
            System.out.println("Weird");
        }
        else if(a%2==0 && a>20){
            System.out.println("Not Weird");
        }



    }




}
