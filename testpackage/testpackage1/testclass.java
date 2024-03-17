package testpackage1;
import static org.junit.jupiter.api.Assertions.assertEquals; 

import org.junit.jupiter.api.Test;

import Calculator.Calculatorclass;

public class testclass {


	
	    @Test
	    public void testsum() {
	    assertEquals(5,Calculatorclass.sum(2, 3));
	    }

	    @Test
	    public void testsubtract() {
	    assertEquals(-1,Calculatorclass.subtract(2, 3));
	    }

	    @Test
	    public void testmultiply() {
	    assertEquals(6,Calculatorclass.multiply(2, 3));
	    }

	    @Test
	    public void testdivide() {
	    assertEquals(2,Calculatorclass.divide(6, 3));
	    }
	

}