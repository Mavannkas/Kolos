package ludwiniak.wiktor;

import java.util.Objects;

public class Car {
    private String brand;
    private int engineCapacity;
    private Person owner;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Car(String brand, int engineCapacity, Person owner) {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("%20s %8d %20s", brand, engineCapacity, owner.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Car))
            return false;

        Car car = (Car) obj;


        return Objects.equals(toString(), car.toString());
    }
}
