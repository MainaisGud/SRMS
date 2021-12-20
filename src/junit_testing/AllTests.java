package junit_testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ arrivalsTest.class, customersTest.class, departuresTest.class, stationMasterTest.class,
		stationTest.class, superAdminTest.class, systemUserTest.class, timeTableTest.class })
public class AllTests {

}
