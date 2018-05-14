package exercises.comparizon;

import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private Integer pesel;

    public Human(String name, String surname, Integer pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getPesel() {
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(pesel, human.pesel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, pesel);
    }
}
