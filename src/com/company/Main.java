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

        // creating item feature matrix
        int featureIndex = 1;
        int[][] it = new int[numFeatures][numItems];
        System.out.println("Let's start with the item-feature matrix.");
        Scanner keyboard1 = new Scanner(System.in);
        int[][] itemFeature = getItemFeatureMatrix(keyboard1, featureIndex, it);
        System.out.println("Here's your item-feature matrix:");
        for (int i = 0; i < numFeatures; i++) {
            for (int j = 0; j < numItems; j++) {
                System.out.print(itemFeature[i][j] + " ");
            }
            System.out.println();
        }

        //creating user feature matrix
        int userIndex = 1;
        int[][] uf = new int[numUsers][numFeatures];
        System.out.println("Next let's make the user-feature matrix.");
        Scanner keyboard2 = new Scanner(System.in);
        int[][] userFeature = getUserFeatureMatrix(keyboard2, userIndex, uf);
        System.out.println("Here's your user-feature matrix:");
        for (int i = 0; i < numUsers; i++) {
            for (int j = 0; j < numFeatures; j++) {
                System.out.print(userFeature[i][j] + " ");
            }
            System.out.println();
        }

        // printing out final matrix with proper formatting
        int[][] userItem = getUserItemMatrix(keyboard, userFeature, itemFeature);
        System.out.println("Here's the final user-item matrix:");
        for (int i = 0; i < numUsers; i++) {
            for (int j = 0; j < numItems; j++) {
                System.out.print(userItem[i][j] + " ");
            }
            System.out.println();
        }

    }

    // asking how many items/users/features
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

    // creating the item-feature matrix from numItems and numFeatures
    public static int[][] getItemFeatureMatrix(Scanner keyboard, int featureIndex, int[][] itemFeature){
        if(featureIndex == numFeatures + 1){
            return itemFeature;
        }

        System.out.println("Enter " + numItems + " item value(s) for feature" + featureIndex + " separated by spaces if needed (no spaces at the end).");
        String input = keyboard.nextLine();

        if(input.length() != numItems + (numItems - 1)){
            System.out.println("The input is the wrong length.");
            return getItemFeatureMatrix(keyboard, featureIndex, itemFeature);
        } else{
            boolean errorOccurred = false;
            for(int i = 0; i < input.length(); i++){
                char ch =  input.charAt(i);
                String str = Character.toString(ch);
                if(!Character.isDigit(ch) && !(str.equals(" "))){
                    errorOccurred = true;
                }
            }
            if(errorOccurred){
                System.out.println("Please enter digits separated by spaces only.");
                return getItemFeatureMatrix(keyboard, featureIndex, itemFeature);
            } else{
                int itemIndex = 0;
                for(int i = 0; i < input.length(); i++){
                    char ch = input.charAt(i);
                    if(!String.valueOf(ch).equals(" ")){
                        int featureValue = Character.getNumericValue(ch);
                        itemFeature[featureIndex- 1][itemIndex] = featureValue;
                        itemIndex++;
                    }
                }
                return getItemFeatureMatrix(keyboard, featureIndex + 1, itemFeature);
            }
        }
    }

    public static int[][] getUserFeatureMatrix(Scanner keyboard, int userIndex, int[][] userFeature){

        if(userIndex == numUsers + 1){
            return userFeature;
        }

        System.out.println("Enter " + numFeatures + " feature value(s) for user" + userIndex + " separated by spaces if needed (no spaces at the end).");
        String input = keyboard.nextLine();

        if(input.length() != numFeatures + (numFeatures - 1)){
            System.out.println("The input is the wrong length.");
            return getUserFeatureMatrix(keyboard, userIndex, userFeature);
        } else{
            boolean errorOccurred = false;
            for(int i = 0; i < input.length(); i++){
                char ch =  input.charAt(i);
                String str = Character.toString(ch);
                if(!Character.isDigit(ch) && !(str.equals(" "))){
                    errorOccurred = true;
                }
            }
            if(errorOccurred){
                System.out.println("Please enter digits separated by spaces only.");
                return getUserFeatureMatrix(keyboard, userIndex, userFeature);
            } else{
                int featureIndex = 0;
                for(int i = 0; i < input.length(); i++){
                    char ch = input.charAt(i);
                    if(!String.valueOf(ch).equals(" ")){
                        int featureValue = Character.getNumericValue(ch);
                        userFeature[userIndex - 1][featureIndex] = featureValue;
                        featureIndex++;
                    }
                }
                return getUserFeatureMatrix(keyboard, userIndex + 1, userFeature);
            }
        }
    }

    public static int[][] getUserItemMatrix(Scanner keyboard, int[][] userFeature, int[][] itemFeature){
        int[][] userItem = new int[numUsers][numItems];

        //math



        return userItem;
    }

}
