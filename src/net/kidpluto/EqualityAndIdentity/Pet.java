package net.kidpluto.EqualityAndIdentity;

import java.util.Objects;

public class Pet {

    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public Pet() {};

    public Pet (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
