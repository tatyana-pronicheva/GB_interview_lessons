package demo.gb.homework.task2;

    //наследуется от Car, а Movable и Stopable интерфейсы реализуются в Car
class Lorry extends Car {
    @Override
    public void stop(){
        System.out.println("Car is stopped");
    }

    //Метод open должен быть здесь реализован, т.к. класс наследуется от Car
    @Override
    void open() {}
}
