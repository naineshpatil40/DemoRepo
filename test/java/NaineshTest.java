package kt_sessions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pagefactories.BasePage;

public class NaineshTest {

	public class Nainesh extends BasePage{
		@BeforeClass(alwaysRun = true)
		@Parameters("store")
		public void setUp(@Optional("null") String store) throws Exception {
			// init(store);
			preRequisiteForTest(this.getClass().getSimpleName());

		}
	
	}
}

