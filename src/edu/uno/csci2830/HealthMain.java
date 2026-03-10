package edu.uno.csci2830;
import java.util.Scanner;


public class HealthMain {
    /**
     * Prompt user for calorie goal
     * Prompt user for amount of meals
     * Check if meal count is too high
     * Check if the number of calories is higher or lower than the goal
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("What is your calorie goal?: \n");
            int goal = sc.nextInt();
            System.out.print("How many meals did you eat today? \n");
            int meals = sc.nextInt();
            while (meals >= 10) {
                System.out.print("High number of meals (enter again) \n");
                meals = sc.nextInt();
            }

            int totalCalories = 0;


            for (int i = 1; i <= meals; i++) {
                System.out.print("Amount of calories for meal " + i + ": \n");
                totalCalories += sc.nextInt();
            }
            System.out.println("Total Calories: " + totalCalories + "\n");

            GreekYogurt yogurt = new GreekYogurt();
            GrilledChicken chicken = new GrilledChicken();
            HeartySandwich sandwich = new HeartySandwich();
            Pasta pasta = new Pasta();
            Fruit fruit = new Fruit();

            if (Math.abs(totalCalories - goal) <= 50) {
                System.out.println("You are so close to your goal but...");
            }


            if (totalCalories < goal) {
                System.out.print("You are " + (goal - totalCalories) + " calories below your goal\n");
                System.out.print("--------------------\n");
                if ((goal) >= 700) {
                    System.out.print("Here are some high calorie food recommendations\n");
                    System.out.print("--------------------\n");
                    System.out.println(sandwich);
                    System.out.println(pasta);
                    System.out.print("--------------------\n");
                } else if ((goal > 400)) {
                    System.out.print("Here are some food recommendations\n");
                    System.out.println(yogurt);
                    System.out.println(chicken);
                    System.out.print("--------------------\n");
                } else {
                    System.out.print("Here is a food recommendation\n");
                    System.out.println(fruit);
                    System.out.print("--------------------\n");
                }
            }

                else if (totalCalories > goal) {
                System.out.print("You are " + (totalCalories - goal) + " calories above your goal\n");
                System.out.print("--------------------\n");
                //Offer food recommendations
                if (goal >= 2000) {
                    System.out.print("Here are some lower calorie food recommendations\n");
                    System.out.print("--------------------\n");
                    System.out.println(sandwich);
                    System.out.println(pasta);
                    System.out.println(fruit);
                    System.out.println(yogurt);
                    System.out.println(chicken);
                    System.out.print("--------------------\n");
                } else if (goal > 450) {
                    System.out.print("Here are some low calorie food recommendations\n");
                    System.out.print("--------------------\n");
                    System.out.println(yogurt);
                    System.out.println(chicken);
                    System.out.println(fruit);
                    System.out.print("--------------------\n");
                } else {
                    System.out.print("Here is a low calorie food recommendation\n");
                    System.out.println(fruit);
                    System.out.print("--------------------\n");
                }
            }
                else {
                    System.out.println("You meet your goal!");
            }
                    System.out.println("Do you want to calculate again? Enter (no) to exit");
                    String choice = sc.next();

                    if (choice.equalsIgnoreCase("no")) {
                        System.out.print("Exiting Calorie Tracker!");
                        break;
                    }
                }
                sc.close();
            }
        }








