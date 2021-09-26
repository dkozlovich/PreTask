package entity;

public class CustomNumber {
    private float number;

    public CustomNumber(float number) {
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomNumber that = (CustomNumber) o;

        return Float.compare(that.number, number) == 0;
    }

    @Override
    public int hashCode() {
        return (number != +0.0f ? Float.floatToIntBits(number) : 0);
    }

    public static void main(String[] args) {

    }
}
