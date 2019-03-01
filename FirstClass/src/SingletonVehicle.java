public class SingletonVehicle {
    private static SingletonVehicle instance = new SingletonVehicle();

    private SingletonVehicle() {
    }

    public static SingletonVehicle getInstance() {
        return instance;
    }


    public void helloWorld(){
        System.out.println("Hello World!");
    }
}
