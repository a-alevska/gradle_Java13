import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void additionActionTest(){
        //Given
        double a = 2.0;
        double b = 5.0;

        //Then
        assertEquals(a+b,calc.add(a,b));
    }

    @Test
    void subtractionActionTest(){
        //Given
        double a = 5.0;
        double b = 2.0;

        //When
        double result = calc.subtract(a,b);

        //Then
        assertEquals(3.0,result);
    }

    @Test
    void multiplyActionTest(){
        //Given
        double a = 2.0;
        double b = 8.0;

        //When
        double result = calc.multiply(a,b);

        //Then
        assertEquals(16.0,result);
    }

    @Test
    void divisionActionTest(){
        //Given
        double a = 16.0;
        double b = 8.0;

        //When
        double result = calc.divide(a,b);

        //Then
        assertEquals(2.0,result);
    }

    @Test
    public void testDivisionByZero() {
        // Given
        double a = 10.0;
        double b = 0.0;

        // When & Then
        assertThrows(ArithmeticException.class, () -> calc.divide(a, b));
    }
}
