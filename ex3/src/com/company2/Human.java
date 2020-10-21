package com.company2;
public class Human {

    public Head head = new Head("blue", true);
    public Leg leg = new Leg(2);
    public Hand hand = new Hand(2);

    @Override
    public String toString() {
        return "Human{ " + head.toString() + leg.toString() + hand.toString()
                + "}";
    }
}

class Head {
    private String eyesColor;
    private boolean hair;

    public Head(String eyesColor, boolean hair) {
        this.eyesColor = eyesColor;
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "Head[Eyes color=" + eyesColor + " Hair=" + hair + "] ";
    }
}

class Leg {
    private int quantity;

    public Leg(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Legs[quantity=" + quantity + "] ";
    }
}

class Hand {
    private int quantity;

    public Hand(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Hand[quantity=" + quantity + "] ";
    }
}