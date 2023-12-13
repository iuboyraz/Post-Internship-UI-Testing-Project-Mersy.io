package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Methods;
import pages.body;
import pages.header;
import pages.loginPage;
import utilities.BaseDriver;

import java.time.Duration;

public class US006HamburgerMenuMessagingM03 {
    header hp = new header();
    body bd= new body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));
    @When("the student clicks on the Hamburger Menu")
    public void theStudentClicksOnTheHamburgerMenu() {
    mt.myClick(hp.hamburgerMenu);
    }

    @And("selects Messaging > Outbox")
    public void selectsMessagingOutbox() {
        mt.myClick(hp.messagingButton);
    }

    @Then("the student should be directed to the Outbox page")
    public void theStudentShouldBeDirectedToTheOutboxPage() {
        mt.myClick(hp.outboxButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Outbox ']")));
        Assert.assertTrue(bd.outbox.getText().toLowerCase().contains("outbox"));
    }

    @When("the student selects the message clicks the move to trash button and confirms")
    public void theStudentSelectsTheMessageClicksTheMoveToTrashButtonAndConfirms() {
        wait.until(ExpectedConditions.elementToBeClickable(bd.checkbox));
        bd.checkbox.click();
        mt.myClick(bd.moveToTrashButton);
        mt.myClick(bd.ConfirmButton);
    }

    @Then("a success message should appear confirming the deletion")
    public void aSuccessMessageShouldAppearConfirmingTheDeletion() {
    }


}
