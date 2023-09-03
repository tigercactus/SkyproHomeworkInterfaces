public class Car extends Bicycle {


   @Override
    public void serveMe() {
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}