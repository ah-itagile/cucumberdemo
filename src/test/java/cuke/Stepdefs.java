package cuke;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class Stepdefs {

    xpdays.Shop shop = new xpdays.Shop();


    @Given("^I add (\\d+) to my cart$")
    public void I_add_to_my_cart(int price) throws Throwable {
        shop.addItemToCart("xy", price);
    }

    @Then("^the sum of my shopping cart should be (\\d+)$")
    public void the_sum_of_my_shopping_cart_should_be(int expectedSum) throws Throwable {
        assertEquals(expectedSum, shop.getSum(), 0.001);
    }
}