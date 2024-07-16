package com.chainsys.bank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Banks {
    private String name;
    private String accountNumber;
    private String ifsc;
    private ArrayList<String> customers = new ArrayList<>();

    public static void main(String[] args) {
        Banks banks = new Banks();
        banks.collectAndStoreData();
        banks.printCustomerList();
    }

    public void collectAndStoreData() {
        Scanner sc = new Scanner(System.in);

        this.name = validateName();

        this.accountNumber = validateAccountNumber();

        this.ifsc = validateIfsc();

        customers.add(name);
        customers.add(accountNumber);
        customers.add(ifsc);
    }

    public void printCustomerList() {
        System.out.println("Customer details:");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }

    private String validateName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        String regex = "^[a-zA-Z]{5,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            System.out.println("Valid name format");
            return name;
        } else {
            System.out.println("Invalid name format. Please enter again.");
            return validateName(); 
        }
    }

    private String validateAccountNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String accountNumber = sc.nextLine();
        String regex = "^[1-9]\\d{11}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(accountNumber);
        if (matcher.matches()) {
            System.out.println("Valid account number format.");
            return accountNumber;
        } else {
            System.out.println("Invalid account number format. Please enter again.");
            return validateAccountNumber(); 
        }
    }

    private String validateIfsc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your IFSC code:");
        String ifsc = sc.nextLine();
        String regex = "^[A-Z]{4}0[A-Z0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ifsc);
        if (matcher.matches()) {
            System.out.println("Valid IFSC code format.");
            return ifsc;
        } else {
            System.out.println("Invalid IFSC code format. Please enter again.");
            return validateIfsc(); 
        }
    }
}
