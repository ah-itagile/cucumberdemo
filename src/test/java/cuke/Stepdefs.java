package cuke;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import xpdays.Basket;

import static org.junit.Assert.assertEquals;

public class Stepdefs {

    Basket basket = new Basket();


    @Given("^I add item for (\\d+) EUR to my cart$")
    public void I_add_to_my_cart(int price) throws Throwable {
        basket.addItemToCart("xy", price);
    }

    @Then("^the sum of my shopping cart should be (\\d+)$")
    public void the_sum_of_my_shopping_cart_should_be(int expectedSum) throws Throwable {
        assertEquals(expectedSum, basket.getSum(), 0.001);
    }
}