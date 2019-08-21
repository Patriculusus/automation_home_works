package home_work_1;

public class Car {
    String model;
    private double weight;
    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    public void increasePower(int power) {
        this.power += power;
    }

    public void decreasePower(int power) {
        this.power -= power;
    }
}
