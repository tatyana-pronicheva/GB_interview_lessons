package demo.gb.homework.task2;

//наследуется от Car, а Movable и Stopable интерфейсы реализуются в Car
class LightWeightCar extends Car {
    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void stop() {}
}