package com.rubicon.swachh.other;


import java.util.Scanner;

import static com.rubicon.swachh.util.RegularExpConstants.*;

public class Validator {

    private Scanner scanner = new Scanner(System.in);

    public String checkName(String name) {

        if (name.replaceAll(" ","").matches(NAME_REXP)) {
            return name;
        } else {
            System.out.println("Enter a valid name.");
            System.out.print("Enter Again: ");
            name = checkName(scanner.next());
            return name;
        }
    }

    public String checkEmail(String email) {
        if (email.matches(EMAIL_REXP)) {
            return email;
        } else {
            System.out.println("\nPlease, Enter a valid Email:");
            System.out.print("Enter Again: ");
            email = checkEmail(scanner.next());
            return email;
        }
    }

    public Long checkNumber(String number) {
        if (String.valueOf(number).matches(NUMBER_REXP)) {
            return Long.parseLong(number);
        } else {
            System.out.println("\nPlease, Enter a valid phone number:");
            System.out.print("Enter Again: ");

            return (checkNumber(scanner.nextLine().trim()));
        }
    }

    public String checkAddress(String address) {
        if (address.replaceAll(" ","").matches(ADDRESS_REXP)) {
            return address;
        } else {
            System.out.println("\nPlease, Enter a valid address:");
            System.out.print("Enter Again: ");

            address = checkAddress(scanner.nextLine().trim());
            return address;
        }

    }

    public int validateTypeInput(String typeSelected) {
        if (typeSelected.matches(TYPE_REXP)) {
            return Integer.parseInt(typeSelected);
        } else {
            System.out.println("\nPlease, Enter valid input for type:");
            return validateTypeInput(scanner.next().trim());
        }
    }

    public int validateBrandInput(String brandSelected) {

        if (brandSelected.matches(BRAND_REXP)) {
            return Integer.parseInt(brandSelected);
        } else {
            System.out.println("\nPlease, Enter valid input:");

            return validateBrandInput(scanner.next().trim());
        }
    }

    public boolean validateChoice(String choice){
        if (choice.matches(CHOICE_REXP)){
            return choice.equals("y")||choice.equals("Y");
        }else {
            System.out.println("\nPlease, Enter either Y or N:");
            validateChoice(String.valueOf(scanner.next().trim().charAt(0)));
        }
        return true;
    }
}
