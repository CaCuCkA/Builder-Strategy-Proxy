package ua.edu.ucu.apps.proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProxyImage realImageTrue = new ProxyImage("img2.jpg");
        ProxyImage realImageFalse = new ProxyImage("img1.jpg");
        System.out.println("To show the image, answer True or False (t/f):");
        System.out.println("""
                Do you have insomnia? 
                Do you think you are the dumbest person in the world? 
                Has your self-esteem sunk to a low point? 
                """);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("true") || answer.equalsIgnoreCase("t")) {
            System.out.println("Perhaps you've fallen victim to this man's lab");
            realImageTrue.display();
        } else {
            System.out.println("Congratulations, you don't have psychological problems as your teacher Oles!");
            realImageFalse.display();
        }
    }
}
