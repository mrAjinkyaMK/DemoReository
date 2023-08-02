package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Demo1 {

	@Before
	public static void beforeDemo() {
		System.out.println("before Demo============================");
	}
	
	@After
	public static void afterDemo() {
		System.out.println("after Demo===============================");
	}
	
	@BeforeStep
	public static void beforeStepDemo() {
		System.out.println("Before Step Demo===========================");
	}
	
	@AfterStep
	public static void afterStepDemo() {
		System.out.println("After Step Demo============================");
	}
}
