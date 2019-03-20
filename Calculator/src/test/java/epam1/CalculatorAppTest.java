package epam1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAppTest {

	@Test
	public void additionTest()
	{
		CalculatorApp ca=new CalculatorApp();
		assertEquals(5.0,ca.addition(2.0,3.0),"Add");
		assertEquals(2.2,ca.addition(1.1, 1.1),"Add");
	}
	@Test
	public void multiplicationTest()
	{
		CalculatorApp ca=new CalculatorApp();
		assertEquals(6.0,ca.multiplication(2.0,3.0),"Multiply");
		assertEquals(1.1,ca.multiplication(1.0,1.1),"Multiply");

	}
	@Test
	public void divisionTest()
	{
		CalculatorApp ca=new CalculatorApp();
		assertEquals(1.4,ca.division(3.5,2.5),"Division");
		assertEquals(1.0,ca.division(1.1, 1.1),"Division");
		Assertions.assertThrows(ArithmeticException.class,() -> ca.division(7.0,0));
	}


}
