package com.company;

public class DeluxeHamburger extends Hamburger {
    private double chipsPrice = 3.00;
    private double drinkPrice = 2.50;
    private double totalPrice;
    private boolean additionalAllowed;

    public DeluxeHamburger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
        this.totalPrice = price + chipsPrice + drinkPrice;
        this.additionalAllowed = false;
    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    @Override
    public boolean isAdditionalAllowed() {
        return this.additionalAllowed;
    }

    @Override
    public double calculateTotal() {
        return this.totalPrice;
    }
}
