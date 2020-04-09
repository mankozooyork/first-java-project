package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int loopCnt = 0;
            System.out.println("Hello, What can I get for you?");
            System.out.println("------------------------------");
            System.out.println("1. Hamburger                  ");
            System.out.println("2. Healthy Burger             ");
            System.out.println("3. Deluxe Burger              ");
            System.out.println("4. No Thanks                  ");
            System.out.println("------------------------------");
            boolean hasNextInt = scanner.hasNextInt();
            if (!scanner.hasNextInt()) {
                System.out.println("Error! Please select valid Hamburger No.");
            }

            Hamburger theOrder = returnObjType(scanner.nextInt());
            if (theOrder == null) {
                break;
            }

            if(!theOrder.isAdditionalAllowed()) {
                System.out.println("This type of burger can not add any additional");
                System.out.println("it's " + theOrder.calculateTotal() + " dollars.");
                System.out.println("------------------------------");
                scanner.nextLine();
                continue;
            }

            while (loopCnt < 4) {
                System.out.println("Want some additional on it?");
                System.out.println("------------------------------");
                System.out.println("1. Lettuce                    ");
                System.out.println("2. Tomato                     ");
                System.out.println("3. Carrot                     ");
                System.out.println("4. Cucumber                   ");
                System.out.println("5. Nope                       ");
                System.out.println("------------------------------");

                if (!scanner.hasNextInt()) {
                    System.out.println("Error! Please select valid Additional No.");
                    break;
                }

                switch (scanner.nextInt()) {
                    case 1:
                        theOrder.setAddLettuce(true);
                        break;
                    case 2:
                        theOrder.setAddTomato(true);
                        break;
                    case 3:
                        theOrder.setAddCarrot(true);
                        break;
                    case 4:
                        theOrder.setAddCucumber(true);
                        break;
                    case 5:
                        loopCnt = 5;
                        break;
                    default:
                        System.out.println("Err1or! Please select valid Additional No.");
                        loopCnt = 5;
                        break;
                }
                if (theOrder.getAdditionalCount() == -1) {
                    System.out.println("This type of burger can not add more than 2 additional");
                    break;
                }
                loopCnt++;
            }
            System.out.println(theOrder.getBasePrice());
            System.out.println(theOrder.isAddCarrot());
            System.out.println(theOrder.getCarrotPrice());
            System.out.println(theOrder.isAddCucumber());
            System.out.println(theOrder.getCucumberPrice());
            System.out.println(theOrder.isAddLettuce());
            System.out.println(theOrder.getLettucePrice());
            System.out.println(theOrder.isAddTomato());
            System.out.println(theOrder.getLettucePrice());
            System.out.println("it's " + theOrder.calculateTotal() + " dollars.");
            System.out.println("------------------------------");
            scanner.nextLine();
        }
        scanner.close();
    }
    public static Hamburger returnObjType(int option) {
        switch(option) {
            case 1:
                return new Hamburger("Normal", "Normal", 10.0);
            case 2:
                return new HealthyBurger("Soy Beef", 13.0);
            case 3:
                return new DeluxeHamburger("Deluxe Bread", "Deluxe Patty", 15.0);
            case 4:
                System.out.println("Thank you :)");
                return null;
        }
        System.out.println("Error! Please select valid Additional No.");
        return null;
    }
}
