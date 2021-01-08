package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Your Question.");

        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();

        Random rand = new Random();
        int x = rand.nextInt(5);
        System.out.println(x);

        if (x == 0){System.out.println("Whats on your mind?");
        } else if (x==1){System.out.println("Maybe, Ion Know tho.");
        } else if (x==2){ System.out.println("If you say so");
        } else if (x==3) {
            System.out.println("Who you playing with?");
        } else if (x==4){System.out.println("I'll see what i can do.");
        }





    }
}
