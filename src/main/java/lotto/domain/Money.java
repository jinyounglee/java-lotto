package lotto.domain;

import java.util.Objects;

public class Money {

    public static final Money ZERO_MONEY = new Money(0);

    private final int value;

    public Money(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("돈은 음수 일수 없습니다.");
        }
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public Money add(Money money) {
        return new Money(value + money.intValue());
    }

    public Money divide(Money money) {
        return new Money(value / money.intValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return value == money.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
