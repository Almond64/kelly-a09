/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021  Paul Kelly
 */

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int width = input.nextInt();
        double squareFeet = length*width;
        double num_of_gallons = squareFeet / 350; //find out how to round up to the nearest whole number
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.\n", Math.round(num_of_gallons), (int)squareFeet);
    }
}
