package homework2.task5;

import java.util.ArrayList;

public class DogKennel {
    private ArrayList<Dog> dogs;

    public DogKennel() {
        this.dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    @Override
    public String toString() {
        return "DogKennel { " +
                "dogs=" + dogs +
                " }";
    }
}

