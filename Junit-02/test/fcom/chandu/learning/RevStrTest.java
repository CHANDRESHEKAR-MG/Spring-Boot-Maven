package fcom.chandu.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RevStrTest {


	@Test
	void test() {
		ReverseString rev = new ReverseString();
		assertaEquals("avaj",rev.reverse("java"));
	}

	private void assertaEquals(String expected, String actualRes) {
		// TODO Auto-generated method stub
		
	}

}
