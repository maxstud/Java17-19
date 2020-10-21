package com.company2;

public class DogNursery {
    int dogs_count = 2;
    int last_empty_place = 0;
    Dog[] dogs = new Dog[dogs_count];

    public void addDog(Dog dog) {
        dogs[last_empty_place] = dog;
        last_empty_place++;
    }

    public Dog[] getDogsList() {
        return dogs;
    }
}