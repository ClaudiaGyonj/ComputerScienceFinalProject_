package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner.*;

public class Main {

    public static int numItems;
    public static int numUsers;
    public static int numFeatures;
    public static int [][] userItem;
    public static int [][] itemFeature;
    public static int [][] userFeature;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // asking user how many items/users/features they want
        numItems = getNumItems(keyboard);
        numUsers = getNumUsers(keyboard);
        numFeatures = getNumFeatures(keyboard);

        // creating 2D arrays with the number of items/users/features requested
        userItem = new int[numUsers][numItems];
        itemFeature = new int[numFeatures][numItems];
        userFeature = new int[numUsers][numFeatures];

        System.out.println(Arrays.deepToString(userItem));
        System.out.println(Arrays.deepToString(itemFeature));
        System.out.println(Arrays.deepToString(userFeature));
    }
    public static int getNumItems(Scanner keyboard){
        System.out.println("How many items are there?");
        int numItems = keyboard.nextInt();
        return numItems;
    }
    public static int getNumUsers(Scanner keyboard) {
        System.out.println("How many users are there?");
        int numUsers = keyboard.nextInt();
        return numUsers;
    }
    public static int getNumFeatures(Scanner keyboard) {
        System.out.println("How many features are there?");
        int numFeatures = keyboard.nextInt();
        return numFeatures;
    }

}
