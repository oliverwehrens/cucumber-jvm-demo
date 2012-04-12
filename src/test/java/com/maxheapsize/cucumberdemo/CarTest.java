package com.maxheapsize.cucumberdemo;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;

public class CarTest {

  private Car car;

  @Given("I have a car")
  public void I_have_a_car() {
    car = new Car();
  }

  @When("^I add (\\d+) wheels")
  public void I_add_wheels(int wheels) {
     car.setWheels(wheels);
  }

  @Then("^It can drive$")
  public void iShouldBeAbleToDriveTheCar() {
    Assert.assertTrue(car.canDrive());
  }

}
