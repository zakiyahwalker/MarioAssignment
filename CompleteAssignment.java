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

        pyramid(height);
        }

        static void pyramid(int n) {
                for (int x = 0; x < n+1; x++) {
                    hash(x);
                    for (int p = x; p < (n-1); p = p+1) {
                        System.out.print(" ");
                    }
                }
            }
        static void hash(int num) {
            for (int i = 0; i < num; i++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

