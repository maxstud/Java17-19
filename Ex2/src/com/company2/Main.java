package com.company2;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
        DogNursery dogs = new DogNursery();
        Dog dog = new Dog(3,"Luffi", 21);
        Dog dog2 = new Dog(4,"Teo", 28);
        dogs.addDog(dog);
        dogs.addDog(dog2);

        System.out.println(Arrays.toString(dogs.getDogsList()));
    }
}