package lesson08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingController {
    static List<Animal> animalList = new ArrayList<>();
    static List<Animal> flyAbleList = new ArrayList<>();
    static List<Animal> nonFlyList = new ArrayList<>();
    static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Animal tiger = new Tiger(random.nextInt(100), false);
        Animal horse = new Horse(random.nextInt(70),false);
        Animal dog = new Dog(random.nextInt(50),false);
        Animal falcon = new Falcon(random.nextInt(40),true);
        Animal squirrel = new Squirrel(random.nextInt(90), true);
        animalList.add(tiger);
        animalList.add(horse);
        animalList.add(dog);
        animalList.add(falcon);
        animalList.add(squirrel);
        FilterAnimals();
        Animal winner = getWinner();
        System.out.println("Animal winner is: " + winner.getClass().getSimpleName() + "- With speed: " + winner.getSpeed());


    }
    public static void FilterAnimals(){
        for (Animal animal : animalList) {
            if(animal.isFlyAble()){
                flyAbleList.add(animal);
            }else{
                nonFlyList.add(animal);
            }

        }
    }
    public static Animal getWinner(){
        Animal winner = null;
        for (Animal animal : nonFlyList) {
            if(winner == null){
                winner = animal;
            }else {
                if(winner.getSpeed()< animal.getSpeed()){
                    winner = animal;
                }
            }
        }
        return winner;
    }
}
