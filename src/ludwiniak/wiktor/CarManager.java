package ludwiniak.wiktor;

public class CarManager {
    private Car[] cars;
    public CarManager() {
        cars = new Car[0];
    }
    public Car addCar(Car car) {
        Car[] extendedCars = getExtendedArray();
        extendedCars[extendedCars.length - 1] = car;
        this.cars = extendedCars;
        return car;
    }

    private Car[] getExtendedArray() {
        Car[] resultCars = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            resultCars[i] = cars[i];
        }
        return resultCars;
    }

    public void printCars() {
        printCars(cars);
    }

    public void printCars(Car[] cars) {
        for(Car car: cars) {
            System.out.println(car);
        }
    }

    public void printCarsByOwner(Person person) {
        for(Car car: cars) {
            if(car.getOwner().equals(person)) {
                System.out.println(car);
            }
        }
    }


}
