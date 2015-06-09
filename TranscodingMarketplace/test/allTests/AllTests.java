package allTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import IntegrationTests.IntegrationAllTests;
import controllers.ControllerTests;

@RunWith(Suite.class)
@SuiteClasses(
{IntegrationAlltests.class, ControllerTests.class})
public class AllTests
{

}
