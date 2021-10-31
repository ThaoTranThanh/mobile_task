package lesson07.Baitap;

import lesson07.House;

public class Animal {
    private final boolean flyAble;
    private final String speed;

    private Animal(Runner runner) {
        this.flyAble =  runner.flyAble;
        this.speed =  runner.speed;

    }

    public static class Runner {
        private boolean flyAble;
        private String speed;

        Runner() {
        }

        public Animal.Runner flyAble(boolean flyAble) {
            this.flyAble = flyAble;
            return this;
        }

        public Animal.Runner speed(String speed) {
            this.speed = speed;
            return this;
        }

        public Animal apply() {
            return new Animal(this);
        }
    }
}
