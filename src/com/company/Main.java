package com.company;
import java.util.Scanner;
import java.util.Scanner.*;

public class Main {

    public static void main(String[] args) {

    }
    public int [][] dotProduct () {
        Scanner keyboard = new Scanner(System.in);

        // asking user how many items/users/features they want
        System.out.println("How many items are there?");
        int numItems = keyboard.nextInt();
        System.out.println("How many users are there?");
        int numUsers = keyboard.nextInt();
        System.out.println("How many features are there?");
        int numFeatures = keyboard.nextInt();

        // creating 2D arrays with the number of items/users/features requested
        int [][] userItem = new int[numUsers][numItems];
        int [][] itemFeature = new int[numItems][numFeatures];
        int [][] userFeature = new int[numUsers][numFeatures];

        //... more code

        return userItem;
    }
}
