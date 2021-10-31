package lesson08;

public class Squirrel extends Animal {
    public Squirrel(double speed, boolean flyAble) {
        this.speed = speed;
        this.flyAble = flyAble;
    }
    @Override
    public double getSpeed() {
        return this.speed;
    }
    @Override
    public boolean isFlyAble() {
        return this.flyAble;
    }



}
