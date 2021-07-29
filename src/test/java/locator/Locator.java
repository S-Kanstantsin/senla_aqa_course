package locator;

import org.openqa.selenium.By;

public class Locator {
    //public static final By  = By.id("");
   // public static final By  = By.className("");
    //public static final By  = By.cssSelector("");

    public static final By ADDRESS_BUTTON_HEADER = By.xpath("//a[@data-test ='addresses']");
    public static final By NEW_ADDRESS_BUTTON = By.xpath("//a[@data-test ='create']");
    public static final By EDIT_BUTTON = By.xpath("//a[contains(text(),'Edit')]");
    public static final By DESTROY_BUTTON = By.xpath("//a[contains(text(),'Destroy')]");
    public static final By LIST_BUTTON = By.xpath("//a[@data-test ='list']");
    public static final By SING_OUT_BUTTON = By.xpath("//a[@data-test ='sign-out']");
    public static final By EMAIL_USER = By.xpath("//input[@type='email']");
    public static final By PASSWORD_USER = By.xpath("//input[@type='password']");
    public static final By SING_IN_BUTTON = By.xpath("//input[@type='submit']");

    //
    public static final By ADDRESS_FIRST_NAME = By.xpath("//input[@id='address_first_name']");
    public static final By ADDRESS_LAST_NAME = By.xpath("//input[@id='address_last_name']");
    public static final By ADDRESS_ONE = By.xpath("//input[@name='address[address1]']");
    public static final By ADDRESS_TWO = By.xpath("//input[@name='address[address2]']");
    public static final By ADDRESS_CITY = By.xpath("//input[@id='address_city']");
    public static final By ADDRESS_STATE = By.name("address[state]");
    public static final By ADDRESS_ZIP_CODE = By.xpath("//input[@id='address_zip_code']");
    public static final By ADDRESS_USA = By.xpath("//input[@value ='us']");
    public static final By ADDRESS_CANADA = By.xpath("//input[@value ='canada']");
    public static final By ADDRESS_BIRTHDAY = By.xpath("//input[@type='date']");
    public static final By ADDRESS_AGE = By.xpath("//input[@type='number']");
    public static final By ADDRESS_WEB = By.xpath("//input[@type='url']");
    public static final By ADDRESS_DOWNLOAND_FILE = By.xpath("//input[@type='file']");
    public static final By ADDRESS_PHONE = By.xpath("//input[@type='tel']");
    public static final By ADDRESS_INTEREST_CLIMB = By.xpath("//input[@id ='address_interest_climb']");
    public static final By ADDRESS_INTEREST_DANCE = By.xpath("//input[@id ='address_interest_dance']");
    public static final By ADDRESS_INTEREST_READ = By.xpath("//input[@id ='address_interest_read']");
    public static final By ADDRESS_NOTE = By.xpath("//textarea[@id='address_note']");

    public static final By ADDRESS_CREAT_BUTTON = By.xpath("//input[@data-test ='submit']");


}
