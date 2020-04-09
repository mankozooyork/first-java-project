package com.company;

public class HealthyBurger extends Hamburger {
    private int additionalCount;
    private boolean additionalAllowed;

    public HealthyBurger(String meat, double price) {
        super("Brown Rye Bread", meat, price);
        this.additionalCount = 0;
        this.additionalAllowed = true;
    }

    @Override
    public int getAdditionalCount() {
        if(super.getAdditionalCount() == 2) {
            return -1;
        }
        return 0;
    }

    @Override
    public double calculateTotal() {
        return super.calculateTotal();
    }
}
