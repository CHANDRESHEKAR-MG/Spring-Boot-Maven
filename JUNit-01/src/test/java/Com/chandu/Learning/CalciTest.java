package Com.chandu.Learning;

import org.junit.Test;

public class CalciTest {

	@Test
	public void test() {
		calci c = new calci();
		int actual=c.divide(10,5);  
		int expectedRes=2;
		assertEquals(expectedRes,actual);
		//System.out.println("First junit test");
	}
 
	private void assertEquals(int expectedRes, int actual) {

		
	}

}
