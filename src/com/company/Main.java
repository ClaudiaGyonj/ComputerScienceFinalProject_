package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner.*;

public class Main {

    public static int numItems;
    public static int numUsers;
    public static int numFeatures;


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // asking user how many items/users/features they want
        numItems = getNumItems(keyboard);
        numUsers = getNumUsers(keyboard);
        numFeatures = getNumFeatures(keyboard);

        // creating 2D arrays with the number of items/users/features requested
        int[][] itemFeature = getItemFeatureMatrix(keyboard);
        int[][] userFeature = getUserFeatureMatrix(keyboard);
        int[][] userItem = getUserItemMatrix(keyboard, userFeature, itemFeature);

        // printing out final matrix with proper formatting
        System.out.println("Here's your final user-item matrix:");
        for (int i = 0; i < numUsers-1; i++) {
            for (int j = 0; j < numItems-1; j++) {
                System.out.print(userItem[i][j] + " ");
            }
            System.out.println();
        }

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

    public static int[][] getItemFeatureMatrix(Scanner keyboard){
        int featureIndex = 1;
        boolean errorOccurred = false;
        int[][] itemFeature = new int[numFeatures][numItems];
        System.out.println("Let's start with the item-feature matrix.");
        do{
            System.out.println("Enter" + numItems + "values for feature" + featureIndex + "separated by spaces.");
            String input = keyboard.nextLine();

            //more code



        } while(featureIndex < numFeatures + 2 || errorOccurred);

        System.out.println("Here's your item-feature matrix:");
        for (int i = 0; i < numFeatures-1; i++) {
            for (int j = 0; j < numItems-1; j++) {
                System.out.print(itemFeature[i][j] + " ");
            }
            System.out.println();
        }

        return itemFeature;
    }

    public static int[][] getUserFeatureMatrix(Scanner keyboard){
        int userIndex = 1;
        boolean errorOccurred = false;
        int[][] userFeature = new int[numUsers][numFeatures];
        System.out.println("Next let's make the user-feature matrix.");
        do{
            System.out.println("Enter" + numFeatures + "values for user" + userIndex + "separated by spaces.");
            String input = keyboard.nextLine();

            //more code



        } while(userIndex < numUsers + 2 || errorOccurred);





        System.out.println("Here's your user-feature array:");
        for (int i = 0; i < numUsers-1; i++) {
            for (int j = 0; j < numFeatures-1; j++) {
                System.out.print(userFeature[i][j] + " ");
            }
            System.out.println();
        }

        return userFeature;
    }

    public static int[][] getUserItemMatrix(Scanner keyboard, int[][] userFeature, int[][] itemFeature){
        int[][] userItem = new int[numUsers][numItems];

        //math



        return userItem;
    }

}
