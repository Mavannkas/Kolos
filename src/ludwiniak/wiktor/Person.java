package ludwiniak.wiktor;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;


        if (!(obj instanceof Person))
            return false;

        Person person = (Person) obj;


        return Objects.equals(toString(), person.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
