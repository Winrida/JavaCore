package Task_3;

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        Dog dog = new Dog();

        @Override
        public void move() {
            dog.move();
        }

        @Override
        public void eat() {
            dog.eat();
        }
    }

    public class Duck implements CanMove, CanEat, CanFly {
        Duck duck = new Duck();


        @Override
        public void fly() {
            duck.fly();
        }

        @Override
        public void move() {
            duck.move();
        }

        @Override
        public void eat() {
            duck.eat();
        }
    }

    public class Car implements CanMove {
        Car car = new Car();

        @Override
        public void move() {
            car.move();
        }
    }

    public class Airplane implements CanFly, CanMove {
        Airplane airplane = new Airplane();

        @Override
        public void move() {
            airplane.move();
        }

        @Override
        public void fly() {
            airplane.fly();
        }
    }
}
