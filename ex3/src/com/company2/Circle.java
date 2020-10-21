package com.company2;
public class Circle {
    double pi = Math.PI;

    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Circle raduis => "
                +
                "radius = " + radius +
                ';';
    }
}