package demo.gb.homework.task2;

class LightWeightCar extends Car implements Moveable {
    @Override
    void open() {
        System.out.println("Car is open");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}