package expressivo;
import java.util.Objects;


public class AdditionExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }



@Override
public String toString() {
    return "(" + left.toString() + " + " + right.toString() + ")";
}


@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof AdditionExpression)) return false;

    AdditionExpression other = (AdditionExpression) obj;
    return this.left.equals(other.left) && this.right.equals(other.right);
}

@Override
public int hashCode() {
    return Objects.hash(left, right);
}

}

