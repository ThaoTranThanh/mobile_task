package lesson06.Baitap;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRun {

    public static void raceResult(Dog dog, Horse horse, Tiger tiger ) {
        //a,b,c
        //if a>b&&a>c==> a lon nhat
        //else if b>a&&b>c==>b lon nhat
        //else c lon
        int dogSpeed = dog.getSpeed();
        int horseSpeed = horse.getSpeed();
        int tigerSpeed = tiger.getSpeed();
        System.out.println( " Dog is: " + dogSpeed);
        System.out.println( " Horse is: " + horseSpeed);
        System.out.println( " Tiger is: " + tigerSpeed);

        if (dogSpeed>horseSpeed && dogSpeed>tigerSpeed){
            System.out.println("Winner is:" + dog.getDefaultName());
        }else if (horseSpeed>dogSpeed && horseSpeed>tigerSpeed){
            System.out.println("Winner is:" + horse.getDefaultName());
        }else{
            System.out.println("Winner is:" + tiger.getDefaultName());
        }

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getClass().getSimpleName());

        Horse horse = new Horse();
        System.out.println(horse.getClass().getSimpleName());

        Tiger tiger = new Tiger();
        System.out.println(tiger.getClass().getSimpleName());

        raceResult(dog, horse, tiger);

    }
}
