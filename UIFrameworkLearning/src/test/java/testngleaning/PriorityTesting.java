package testngleaning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTesting {

	@Test(priority = 3)
	public void Sum1OfTwo() {

		System.out.println(2 + 3);

	}

	@Test(priority = 1)
	public void Sub1OfThree() {

		System.out.println(2 - 3 - 6);

	}

	@Test(priority = 2)
	public void mul1OfFour() {

		System.out.println("2*3*6*8");

	}

}

