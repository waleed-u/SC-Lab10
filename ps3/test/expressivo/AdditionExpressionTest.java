package expressivo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionExpressionTest {

    @Test
    public void testAdditionExpressionToString() {
        // Create instances for testing
        Expression number1 = new NumberExpression(5);
        Expression number2 = new NumberExpression(10);
        Expression variableX = new VariableExpression("x");
        Expression variableY = new VariableExpression("y");

        // Test AdditionExpression creation
        Expression additionExpression1 = new AdditionExpression(number1, number2);
        Expression additionExpression2 = new AdditionExpression(variableX, variableY);

        // Test toString()
        assertEquals("(5.0 + 10.0)", additionExpression1.toString());
        assertEquals("(x + y)", additionExpression2.toString());
    }

    @Test
    public void testAdditionExpressionEquality() {
        // Create instances for testing
        Expression number1 = new NumberExpression(5);
        Expression number2 = new NumberExpression(10);
        Expression variableX = new VariableExpression("x");
        Expression variableY = new VariableExpression("y");

        // Test structural equality using equals()
        Expression additionExpression1 = new AdditionExpression(number1, number2);
        Expression additionExpression2 = new AdditionExpression(variableX, variableY);
        Expression additionExpression3 = new AdditionExpression(number1, number2);
        Expression additionExpression4 = new AdditionExpression(variableX, variableY);

        assertEquals(additionExpression1, additionExpression3);
        assertEquals(additionExpression2, additionExpression4);

        // Test non-equality
        assertNotEquals(additionExpression1, additionExpression2);
    }

    @Test
    public void testAdditionExpressionHashCode() {
        // Create instances for testing
        Expression number1 = new NumberExpression(5);
        Expression number2 = new NumberExpression(10);
        Expression variableX = new VariableExpression("x");
        Expression variableY = new VariableExpression("y");

        // Test hashCode()
        Expression additionExpression1 = new AdditionExpression(number1, number2);
        Expression additionExpression2 = new AdditionExpression(variableX, variableY);
        Expression additionExpression3 = new AdditionExpression(number1, number2);
        Expression additionExpression4 = new AdditionExpression(variableX, variableY);

        assertEquals(additionExpression1.hashCode(), additionExpression3.hashCode());
        assertEquals(additionExpression2.hashCode(), additionExpression4.hashCode());
    }
}
