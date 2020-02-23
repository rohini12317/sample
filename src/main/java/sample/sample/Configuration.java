package sample.sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Configuration {

	/*
	 * public static void main(String[] args) {
	 * 
	 * }
	 */

	@BeforeTest
	public static void beforetest() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public static void beforemethod() {
		System.out.println("Before method");
	}

	@AfterMethod
	public static void aftermethod() {
		System.out.println("After method");
	}

	@AfterTest
	public static void aftertest() {
		System.out.println("After  Test");
	}
}
