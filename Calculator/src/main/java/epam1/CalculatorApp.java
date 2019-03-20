package epam1;
/**
 * 
 * @author SowmyaReddy
 *
 */
public class CalculatorApp {
	/**
	 * addition of two numbers
	 * @param num1
	 * @param num2
	 * @return sum of two numbers
	 */
public double addition(double num1,double num2)
{
	return num1+num2;
}
/**
 * multiplication of two numbers
 * @param num1
 * @param num2
 * @return product of two numbers
 */
public double multiplication(double num1,double num2)
{
	return num1*num2;
}
/**
 * division of two numbers
 * @param num1
 * @param num2
 * @return 
 */
public double division(double num1,double num2)
{
	if(num2==0)
			throw new ArithmeticException("cannot divide by zero");
	else
		return num1/num2;
		
}
}
