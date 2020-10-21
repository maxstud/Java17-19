package com.company2;
import java.util.Random;


// 3
public class CircleTest {

    public static void main(String[] args) {


        Circle Circle = new Circle(50);
        double radius = Circle.getRadius();
        System.out.println(radius);
        Circle.setRadius(40);
        System.out.println(Circle.getRadius());
        System.out.println(Circle);

    }
}
