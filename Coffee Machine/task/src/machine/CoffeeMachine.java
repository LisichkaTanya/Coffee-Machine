package machine;
import java.util.Scanner;
public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int disposableCups = 9;
    static int money = 550;

    public static void main(String[] args) {
        String exit = "true";
        while (exit.equals("true")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy": buy();
                    break;
                case "fill": fill();
                    break;
                case "take": take();
                    break;
                case "remaining": remaining();
                    break;
                case "exit":
                    exit = "false";
                    break;
            }
        }
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        switch (scanner.next()) {
            case "1": //espresso
                if (water < 250) {
                    System.out.println("Sorry, not enough water!\n");
                    break;
                } else {
                    if (beans < 16) {
                        System.out.println("Sorry, not enough coffee beans!\n");
                        break;
                    } else {
                        if (disposableCups < 1) {
                            System.out.println("Sorry, not enough disposable cups!\n");
                            break;
                        } else {
                            System.out.println("I have enough resources, making you a coffee!\n");
                            water -= 250;
                            beans -= 16;
                            disposableCups -= 1;
                            money += 4;
                            break;
                        }
                    }
                }

            case "2": //latte
                if (water < 350) {
                    System.out.println("Sorry, not enough water!\n");
                    break;
                } else {
                    if (milk < 75) {
                        System.out.println("Sorry, not enough coffee milk!\n");
                        break;
                    } else {
                        if (beans < 20) {
                            System.out.println("Sorry, not enough coffee beans!\n");
                            break;
                        } else {
                            if (disposableCups < 1) {
                                System.out.println("Sorry, not enough disposable cups!\n");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                disposableCups -= 1;
                                money += 7;
                                break;
                            }
                        }
                    }
                }

            case "3": //cappuccino
                if (water < 200) {
                    System.out.println("Sorry, not enough water!\n");
                    break;
                } else {
                    if (milk < 100) {
                        System.out.println("Sorry, not enough coffee milk!\n");
                        break;
                    } else {
                        if (beans < 12) {
                            System.out.println("Sorry, not enough coffee beans!\n");
                            break;
                        } else {
                            if (disposableCups < 1) {
                                System.out.println("Sorry, not enough disposable cups!\n");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!\n");
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                disposableCups -= 1;
                                money += 6;
                                break;
                            }
                        }
                    }
                }
            case "back":
                break;
        }
    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposableCups += scanner.nextInt();
    }

    public static void remaining() {
        System.out.println("\nThe coffee machine has:\n" + water +
                " of water\n" + milk +
                " of milk\n" + beans +
                " of coffee beans\n" + disposableCups +
                " of disposable cups\n" + money +
                " of money\n");
    }

    public static void take() {
        System.out.println("\nI gave you $" + money + "\n");
        money = 0;
    }
}
