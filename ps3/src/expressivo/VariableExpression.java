package expressivo;
import java.util.Objects;

public class VariableExpression implements Expression {
    private final String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }


    // Standard observer method toString()
    @Override
    public String toString() {
        return variableName;
    }

    // Standard observer method equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof VariableExpression)) return false;

        VariableExpression other = (VariableExpression) obj;
        return this.variableName.equals(other.variableName);
    }

    // Standard observer method hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(variableName);
    }
}
