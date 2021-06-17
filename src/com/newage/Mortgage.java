package com.newage;

import java.text.NumberFormat;

public class Mortgage {

    private final byte MONTHS_IN_YEAR = 12;

    private int principal;
    private float yearlyInterestConvert;
    private int yearlyPaymentConvert;

    public void printMortgage() {
        System.out.println(formatCalculatedMortgage());
    }

    private double calculateMortgage() {
        return principal * (yearlyInterestConvert * Math.pow(1 + yearlyInterestConvert, yearlyPaymentConvert))
                / (Math.pow(1 + yearlyInterestConvert, yearlyPaymentConvert) - 1);
    }

    private String formatCalculatedMortgage() {
        return NumberFormat.getCurrencyInstance().format(calculateMortgage());
    }

    // Setter for Principal Value
    public void setPrincipal(int principal) {
        if (principal <= 0)
            throw new IllegalArgumentException("Principal amount can't be a zero nor negative!");
        this.principal = principal;
    }

    // Setter for Monthly Interest Rate: Converts input param annualInterest to months @monthlyInterestRate
    public void setMonthlyInterestRate(float annualInterest) {
        if (annualInterest < 0)
            throw new IllegalArgumentException("Annual interest can't be a negative value!");
        byte PERCENT = 100;
        this.yearlyInterestConvert = annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    // Setter for Monthly payments: converts input param pay
    public void setPaymentInMonths(byte paymentInYears){
        if (paymentInYears <= 0)
            throw new IllegalArgumentException("Years Can't be a negative number!");
        this.yearlyPaymentConvert = paymentInYears * MONTHS_IN_YEAR;
    }

}
