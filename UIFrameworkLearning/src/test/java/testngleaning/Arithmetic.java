package testngleaning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Arithmetic {

	@Test(groups = { "smoke", "critical usecase" })
	public void addOfTwo() {

		System.out.println(2 + 3);
		Assert.assertEquals(2 + 3, 5);

	}

	@Test(groups = { "smoke" })
	public void subOfTwo() {

		System.out.println(2 - 3);

		Assert.assertEquals(2 - 3, 1);
	}

	@Test(groups = { "smoke" })
	public void mulOfTwo() {

		System.out.println(2 * 3);

		Assert.assertEquals(2 * 3, 6);

	}

	@Test(groups = { "smoke", "critical usecase" })
	public void addOfThree() {

		System.out.println(2 + 3 + 6);
		Assert.assertEquals(2 + 3 + 6, 11);

	}

	@Test(groups = { "smoke" })
	public void subOfThree() {

		System.out.println(2 - 3 - 6);

		Assert.assertEquals(2 - 3 - 6, 5);
	}

	@Test(groups = { "smoke" })
	public void mulOfThree() {

		System.out.println(3 * 4 * 5);

		Assert.assertEquals(3 * 4 * 5, 75);

	}
}
