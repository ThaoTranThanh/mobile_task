package lesson08;

public class Tiger extends Animal {
    public Tiger( double speed, boolean flyAble) {
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
