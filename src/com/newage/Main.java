package com.newage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var mortgage = new Mortgage();

        System.out.print("Principal amount: ");
        mortgage.setPrincipal(scanner.nextInt());

        System.out.print("Annual Interest Rate: ");
        mortgage.setMonthlyInterestRate(scanner.nextFloat());

        System.out.print("Mortgage Years: ");
        mortgage.setPaymentInMonths(scanner.nextByte());

        mortgage.printMortgage();
    }
}

