/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // inputs 1-3 hold's the info for the user's pizza party
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int inputPeople = Integer.parseInt(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.print("How many pizzas do you have? ");
        int inputPizzas = Integer.parseInt(input2.nextLine());

        Scanner input3 = new Scanner(System.in);
        System.out.print("How many slices per pizza? ");
        int inputSlicesPerPizza = Integer.parseInt(input3.nextLine());

        // math for the total number of slices and whatever is left over
        int totalSlices = inputSlicesPerPizza * inputPizzas;
        int slicesPerPerson = totalSlices / inputPeople;
        int leftoverSlices = totalSlices % inputPeople;

        // formatted string which includes all the info for the pizza party, resulting in one output statement in the next line
        String pizzaParty = String.format("%d people with %d pizzas (%d slices)\nEach person gets %d pieces of pizza.\nThere are %d leftover slices", inputPeople, inputPizzas, totalSlices, slicesPerPerson, leftoverSlices);

        System.out.println(pizzaParty);
    }
}