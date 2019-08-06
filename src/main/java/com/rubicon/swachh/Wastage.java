package com.rubicon.swachh;

import com.rubicon.swachh.models.WastageType;

import java.util.Scanner;

public class Wastage {
    private Scanner scanner = new Scanner(System.in);
    private WastageType wastageType = new WastageType();

    WastageType generateWastageForm() {
        System.out.println("Type of Wastage: ");
        System.out.println("Please, select the type of wastage. You would like to deposit in the " +
                "Kiosk");
        System.out.println("\t1. Glass");
        System.out.println("\t2. Plastic");
        System.out.println("\t3. Metal");

        int switch_case = scanner.nextInt();
        switch (switch_case) {
            case 1:
                System.out.println("Glass has been selected.");
                wastageType.setGlass(true);
                break;
            case 2:
                System.out.println("Plastic has been selected.");
                wastageType.setPlastic(true);
                break;
            case 3:
                System.out.println("Metal has been selected.");
                wastageType.setMetal(true);
                break;
            default:
                System.out.println("Please select the correct option");
                break;
        }
        return wastageType;
    }


}
