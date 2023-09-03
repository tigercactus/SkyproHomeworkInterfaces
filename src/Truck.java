public class Truck extends Car{

    @Override
    public void serveMe() {
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}