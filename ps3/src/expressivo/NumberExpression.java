package expressivo;
import java.util.Objects;

public class NumberExpression implements Expression {
    private final double value;

    public NumberExpression(double value) {
        this.value = value;
    }

    // Standard observer method toString()
    @Override
    public String toString() {
        return Double.toString(value);
    }

    // Standard observer method equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof NumberExpression)) return false;

        NumberExpression other = (NumberExpression) obj;
        return this.value == other.value;
    }

    // Standard observer method hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
