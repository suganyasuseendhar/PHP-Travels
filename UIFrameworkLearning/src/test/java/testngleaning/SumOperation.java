package testngleaning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOperation {

	@Test(groups = { "smoke", "critical usecase" })
	public void sumOfTwo() {

		System.out.println(2 + 3);
		Assert.assertEquals(2 + 3, 5);

	}

	@Test(groups = { "smoke", "critical usecase" })
	public void subOfTwo() {

		System.out.println(3 - 6);

		Assert.assertEquals(7 - 2, 5);
	}

	@Test(groups = { "smoke" })
	public void mulOfTwo() {

		System.out.println(3 * 6);

		Assert.assertEquals(7 * 2, 14);

	}

	@Test(groups = { "smoke", "critical usecase" })
	public void SumOfThree() {

		System.out.println(2 + 3 + 7);
		Assert.assertEquals(2 + 3 + 7, 12);

	}

	@Test(groups = { "smoke", "critical usecase" })
	public void SubOfThree() {

		System.out.println(2 - 3 - 6);

		Assert.assertEquals(2 - 3 - 6, 1);
	}

	@Test(groups = { "smoke" })
	public void mulOfThree() {

		System.out.println(8 * 9 * 5);

		Assert.assertEquals(8 * 9 * 5, 9);

	}

}
