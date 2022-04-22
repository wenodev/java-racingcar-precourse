package racingcar;

import java.util.Objects;

public class Car {
    private Position position;
    private Name name;

    public Car(Position position, Name name) {
        this.position = position;
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void move(MovableStrategy movableStrategy) {
        if (!movableStrategy.isMovable()){
            return;
        }
        position = position.add();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(position, car.position) && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, name);
    }
}
