package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class body {

    public body()
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

    @FindBy(xpath="//span[text()=' Outbox ']")
    public WebElement outbox;

    @FindBy(xpath="(//mat-checkbox//div)[2]")
    public WebElement checkbox;

    @FindBy(xpath="//span[text()='Move to Trash']")
    public WebElement moveToTrashButton;

    @FindBy(xpath="//span[text()=' Yes ']")
    public WebElement ConfirmButton;













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
