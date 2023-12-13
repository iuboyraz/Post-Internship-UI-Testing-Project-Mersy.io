package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class header {

    public header()
    {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    //////////////////////Aygül/////////////////////





    ///////////////////Senol/////////////////////////






    //////////////////////Musab///////////////////////










    //////////////////////Göksah///////////////////////













    //////////////////////Enes///////////////////////











    //////////////////////Talat///////////////////////












    //////////////////////Ümit///////////////////////

    @FindBy(xpath="//button[@class='mat-mdc-menu-trigger mat-button-wrapper mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']")
    public WebElement hamburgerMenu;

    @FindBy(xpath="//span[text()='Messaging']")
    public WebElement messagingButton;

    @FindBy(xpath="//span[text()='Outbox']")
    public WebElement outboxButton;








    //////////////////////Talip///////////////////////












    //////////////////////Sokol///////////////////////














    //////////////////////Rustam///////////////////////










    public WebElement getWebelement(String stringElement)
    {switch (stringElement)
    {




    }

        return null;
    }



}
