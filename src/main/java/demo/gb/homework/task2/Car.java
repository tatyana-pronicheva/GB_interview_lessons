package demo.gb.homework.task2;

// Создан интерфейс Startable, чтобы работало наподобие со Stopable
abstract class Car implements Moveable, Startable, Stopable{
    //поле engine лучше сделать приватным
    private Engine engine;
    private String color;
    private String name;
    public void start() {
        System.out.println("Car starting");
    }
    //метод move вынесен из Lorry и LightWeightCar в родителя, т.к. одинаково реализован
    public void move(){
        System.out.println("Car is moving");
    }
    abstract void open();
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}