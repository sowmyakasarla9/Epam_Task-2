package standardproblem;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
/**
 * 
 * @author SowmyaReddy
 *
 */

public class StandardMaterialTest {

	@Test
	public void costTest()
	{
		StandardMaterial sm;
		sm=new StandardMaterial(1,1,true);
		assertEquals(1500,sm.FindCost());
		sm=new StandardMaterial(2,1,false);
		assertEquals(1800,sm.FindCost());
		
	}

}
