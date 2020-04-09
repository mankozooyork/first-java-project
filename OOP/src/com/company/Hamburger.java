package com.company;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private boolean isAddLettuce = false;
    private boolean isAddTomato = false;
    private boolean isAddCarrot = false;
    private boolean isAddCucumber = false;
    private double lettucePrice = 1.05;
    private double tomatoPrice = 1.50;
    private double carrotPrice = 1.25;
    private double cucumberPrice = 1.35;

    private int additionalCount;
    private double basePrice;
    private double totalPrice = 0;
    private boolean additionalAllowed;

    public Hamburger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = price;
        this.additionalCount = 0;
        this.additionalAllowed = true;
    }

    public void setAddLettuce(boolean addLettuce) {
        isAddLettuce = addLettuce;
    }

    public void setAddTomato(boolean addTomato) {
        isAddTomato = addTomato;
    }

    public void setAddCarrot(boolean addCarrot) {
        isAddCarrot = addCarrot;
    }

    public void setAddCucumber(boolean addCucumber) {
        isAddCucumber = addCucumber;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isAddLettuce() {
        return isAddLettuce;
    }

    public boolean isAddTomato() {
        return isAddTomato;
    }

    public boolean isAddCarrot() {
        return isAddCarrot;
    }

    public boolean isAddCucumber() {
        return isAddCucumber;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getCucumberPrice() {
        return cucumberPrice;
    }

    public boolean isAdditionalAllowed() {
        return additionalAllowed;
    }

    public int getAdditionalCount() {
        if(this.isAddCucumber) {
            this.additionalCount += 1;
        }else if(this.isAddCarrot) {
            this.additionalCount += 1;
        }else if(this.isAddTomato) {
            this.additionalCount += 1;
        }else if(this.isAddLettuce) {
            this.additionalCount += 1;
        }
        return this.additionalCount;
    }

    public double calculateTotal() {
        if(this.isAddLettuce) {
            this.totalPrice += this.lettucePrice;
        } if(this.isAddTomato) {
            this.totalPrice += this.tomatoPrice;
        } if(this.isAddCarrot) {
            this.totalPrice += this.carrotPrice;
        } if(this.isAddCucumber) {
            this.totalPrice += this.cucumberPrice;
        }
        return this.totalPrice += this.basePrice;
    }


}
