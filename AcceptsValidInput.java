package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = 0;
        do{
            System.out.print("Height: ");
            height = input.nextInt();
        } while (height < 1 || height > 8);

        System.out.println("Stored: " + height);
        }
    }
