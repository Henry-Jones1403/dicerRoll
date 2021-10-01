package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    Random random = new Random();
    System.out.println("How many sides are there to your dice>");
    int sides = input.nextInt();
    System.out.println("How many times would you like to throw the dice?");
    int repeats = input.nextInt();

    HashMap<Integer, Integer> Thrown = new HashMap<Integer, Integer>();
    for (int i = 0; i <repeats ; i++) {
        int roll = random.nextInt(sides);
        Thrown.put(roll,1);
        }System.out.println(Thrown);
    }
}
