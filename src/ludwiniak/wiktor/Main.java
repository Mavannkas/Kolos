package ludwiniak.wiktor;

public class Main {

    public static void main(String[] args) {
	 calculateArray(new double[]{2, 4, 6, 21, 23.123 , 44});
     Person p1 = new Person("Wiktor", "Ludwiniak");
     Person p2 = new Person("Wiktor2", "Ludwiniak2");
     Person p3 = new Person("Wiktor3", "Ludwiniak3");
     Car car1 = new Car("Bran1", 123, p1);
     Car car2 = new Car("Bran2", 1223, p1);
     Car car3 = new Car("Bran3", 1213, p2);
     Car car4 = new Car("Bran4", 12133, p3);
     Car car5 = new Car("Bran5", 1423, p2);
     Car car6 = new Car("Bran6", 1273, p1);
     CarManager carManager = new CarManager();
     carManager.addCar(car1);
     carManager.addCar(car2);
     carManager.addCar(car3);
     carManager.addCar(car4);
     carManager.addCar(car5);
     carManager.addCar(car6);
     carManager.printCars();
        System.out.println();
        carManager.printCarsByOwner(p1);
        System.out.println();
        carManager.printCarsByOwner(p2);
        System.out.println();
        carManager.printCarsByOwner(p3);
    }

    public static void calculateArray(double[] numbers) {
        for(double number: numbers) {
            calculate(number);
        }
    }

    private static void calculate(double number) {
        double summary = 1;
        double numberSquare = number * number;
        double numberContainer = -numberSquare / 2;
        int iterator = 3;
        while (Math.abs(numberContainer) > 0.000000001) {
            summary += numberContainer;
            numberContainer *= -numberSquare / (iterator * (iterator + 1));
            iterator += 2;
        }

        System.out.printf("|%-10.2f|%10.3f| %n", number, summary);
    }
}
