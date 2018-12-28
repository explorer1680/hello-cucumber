package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItFriday{
    static String isItFriday(String today){
        if(today.equals("Friday")){
            return "TGIF";
        }
        return "Nope";
    }
}

public class Stepdefs {

    private String today;
    private String actualAnswer;

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_Friday_yet(){
        this.actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("today is \"([^\"]*)\"$")
    public void today_is(String today){
        this.today = today;
    }
}
