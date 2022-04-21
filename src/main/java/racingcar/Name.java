package racingcar;

import java.util.Objects;

public class Name {
    private static final String INVALID_NAME_MESSAGE = "5자 이하의 값을 입력하세요.";
    private static final int MAX_NAME_SIZE = 5;
    private final String name;

    public Name(String name) {
        if (name.length() > MAX_NAME_SIZE){
            throw new IllegalArgumentException(INVALID_NAME_MESSAGE);
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
