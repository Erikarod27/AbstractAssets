package com.pluralsight;

public class Cash extends Asset{
    private double amount;

    public Cash(double amount) {
        super();
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getValue(){
        return this.amount;
    }

    @Override
    public String toString() {
        return "Cash" + "\nAmount: $" + getAmount();
    }
}
