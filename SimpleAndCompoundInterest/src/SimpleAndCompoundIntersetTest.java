package interest;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
/**
 * 
 * @author SowmyaReddy
 *
 */
public class SimpleAndCompoundIntersetTest {
	@Test
	/**
	 * testing simple interest
	 */
	public void simpleInterestTest()
	{
		SimpleAndCompoundInterest sci;
		sci=new SimpleAndCompoundInterest(1000.0,2,3.0);
		assertEquals(60.0,sci.calculateSimpleInterest(),"simpleinterest");		
	}
	public void compoundInterestTest()
	{
		SimpleAndCompoundInterest sci;
		sci=new SimpleAndCompoundInterest(1000.0,2,3.0);
		assertEquals(1060.90,sci.calculateCompoundInterest(),"compoundinterest");	
	}
	public void test() {
		fail("Not yet implemented");
	}

}
