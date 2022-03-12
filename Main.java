package com.company;
import java.util.Scanner;

class Animal{
    private String animalName;
    public String getAnimalName(){
        return animalName;
    }

    private String food;
    public String getFood(){
        return food;
    }

    private String location;
    public String getLocation(){
        return location;
    }

    public Animal(String food, String location, String animalName){
        this.food = food;
        this.location = location;
        this.animalName = animalName;
    }

    public void makeNoise(){
        System.out.println("Животное издаёт звук.");
    }
    public void eat(){
        System.out.println("Животное ест.");
    }
    public void sleep(){
        System.out.println("Животное спит.");
    }
}
class Dog extends Animal{

    String sound = "Гаф-гаф!";
    public Dog(String food,String location, String animalName){
        super(food, location, animalName);
    }
    
    public void makeNoise(){
        System.out.printf("Собака %s издаёт звук %s \n", getAnimalName(), sound);
    }
    public void eat(){
        System.out.printf("Собака %s хочет есть %s \n", getAnimalName(), getFood());
    }
    public void sleep(){
        System.out.printf("Собака %s после обследования врача уснула. \n", getAnimalName());
    }
}

class Cat extends Animal{

    String sound = "Мяу";
    public Cat(String food,String location, String animalName){
        super(food, location, animalName);
    }

    public void makeNoise(){
        System.out.printf("Кот %s издаёт звук %s \n", getAnimalName(), sound);
    }
    public void eat(){
        System.out.printf("Кот %s хочет есть %s \n", getAnimalName(), getFood());
    }
    public void sleep(){
        System.out.printf("Кот %s после обследования врача уснул. \n", getAnimalName());
    }
}

class Horse extends Animal{

    String sound = "Тыгыдык-тыгыдык";
    public Horse(String food,String location, String animalName){
        super(food, location, animalName);
    }

    public void makeNoise(){
        System.out.printf("Конь %s издаёт звук %s \n", getAnimalName(), sound);
    }
    public void eat(){
        System.out.printf("Конь %s хочет есть %s \n", getAnimalName(), getFood());
    }
    public void sleep(){
        System.out.printf("Конь %s после обследования врача уснул. \n", getAnimalName());
    }
}

class Veterinarian extends Animal{

    public Veterinarian(String food, String location, String animalName){
        super(food, location, animalName);
    }
    void treatAnimal(){
        System.out.printf("Врач приехал в %s, где вылечил %s от отравления от %s \n", getLocation(), getAnimalName(), getFood());
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите желаемый вид животного (Cat, Horse, Dog): ");
        String animal = in.nextLine();
        System.out.print("Введите название еды: ");
        String food = in.nextLine();
        System.out.print("Введите имя животного: ");
        String name = in.nextLine();
        System.out.print("Введите здание, в котором находится животное: ");
        String location = in.nextLine();
        Veterinarian veterinarian = new Veterinarian(food, location, name);
        switch (animal) {
            case ("Cat"):
                Cat cat = new Cat(food, location, name);
                cat.eat();
                cat.makeNoise();
                veterinarian.treatAnimal();
                cat.sleep();
                break;
            case ("Dog"):
                Dog dog = new Dog(food, location, name);
                dog.eat();
                dog.makeNoise();
                veterinarian.treatAnimal();
                dog.sleep();
                break;
            case ("Horse"):
                Horse horse = new Horse(food, location, name);
                horse.eat();
                horse.makeNoise();
                veterinarian.treatAnimal();
                horse.sleep();
                break;
            default:
                System.out.println("Введено некорректное название вида животного.");
        }
    }
}
