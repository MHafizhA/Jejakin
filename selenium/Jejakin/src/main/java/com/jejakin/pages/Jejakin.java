package com.jejakin.pages;

import com.jejakin.base.baseSetup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jejakin extends baseSetup {

    WebDriverWait wait = new WebDriverWait(driver, 5, 5);

    public Jejakin() {
        PageFactory.initElements(driver, "https://dev.jejak.travel/");
    }

    // -- ELEMENT CODE --
    // @TCJ-01-Jejakin-User-Start-Jejakin
    // Scenario: User Start Jejakin
    By btn_Start_Jejakin = By.xpath("//a[@href = '/carbon' and (text() = 'Start')]");
    By verify_Start_Jejakin = By.xpath("//h3[@class = 'tp-headline-welcome tx-white tx-center tx-redhat plr-15' and (text() = 'Lets Calculate Your Carbon Footprint')]");


    // @TCJ-02-Jejakin-User-Calculate-Carbon-Footprint-Jejakin
    // Scenario: User Calculate Carbon Footprint Jejakin
    By btn_Icon_Pencil_Jejakin = By.xpath("//span[@class= 'board-departure board board-green']");
    By input_Search_Airport_Depature_Jejakin = By.xpath("//input[@type= 'text' and (@placeholder)]");
    By input_Search_Airport_Arrival_Jejakin = By.xpath("//input[@type= 'text' and (@placeholder)]");
    By text_Result_Departure_Jejakin = By.xpath("//div[@class= 'column-free tp-title-small tx-darkgrey' and (text()= 'Bandar Udara Internasional Soekarno Hatta')]");
    By text_Result_Arrival_Jejakin = By.xpath("//div[@class= 'column-free tp-title-small tx-darkgrey' and (text()= 'Bandar Udara Internasional Ngurah Rai')]");
    By verify_Result_Your_Carbon_Footprint_Jejakin = By.xpath("//h3[@class= 'tp-title-large tx-white tx-center tx-redhat plr-15 mb-30' and (text()= 'Your carbon footprint')]");
    By verify_Result_Calculate_Your_Carbon_Footprint_Jejakin = By.xpath("//div[@class= 'box-footprint']");
    By verify_Note_Info_Carbon_Footprint_Calculation_Jejakin = By.xpath("//span[@class= 'tp-body-supersmall font-inter' and (text() = 'Carbon footprint calculation and mangrove absorption value has been adjusted with reference from IPCC and indonesian government regulations')]");


    // @TCJ-03-Jejakin-User-Edit-Flight-Route
    // Scenario: User Edit Flight Route
    By btn_Icon_Pencil_Flight_Route_Jejakin = By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/span/svg\n");


    // @TCJ-03-Jejakin-User-can-Edit-Passenger-Info-after-summary-calculate-carbon-footprint-appear
    // Scenario: User can Edit Passenger Info after summary calculate carbon footprint appear
    By btn_Icon_Pencil_Passenger_Info_Jejakin = By.xpath("//span[@class= 'board-passenger ger board board-green']");
    By select_Business_Cabin_Class_Jejakin = By.xpath("//div[@class= 'badge-jejakin mx-auto null' and (text() = 'Business')]");
    By select_2_Number_Of_Passenger_Jejakin = By.xpath("//div[@class= 'badge-jejakin mx-auto null' and (text() = '2')]");
    By btn_Save_Passenger_Info_Jejakin = By.xpath("//button[@class= 'dflex mt-auto mx-auto mb-10 Button_btn___hqnz Button_btnBlock__2xQWD Button_btnGreen__k7VCG' and (text() = 'Save')]");
    By verify_Successfully_Edit_Passenger_Info_Business_Class = By.xpath("//h2[@class= 'tx-subtitle font-redhat mt-15' and (text() = 'Business class')]");
    By select_Economy_Class_Jejakin = By.xpath("//div[@class= 'badge-jejakin mx-auto null' and (text() = 'Economy')]");
    By select_3_Number_Of_Passenger_Jejakin = By.xpath("//div[@class= 'badge-jejakin mx-auto null' and (text() = '3')]");
    By verify_Successfully_Edit_Passenger_Info_Economy_Class = By.xpath("//h2[@class= 'tx-subtitle font-redhat mt-15' and (text() = 'Economy class')]");
    By select_First_Class_Jejakin = By.xpath("//div[@class= 'badge-jejakin mx-auto null' and (text() = 'First Class')]");
    By select_4_Number_Of_Passenger_Jejakin = By.xpath("//div[@class= 'badge-jejakin mx-auto null' and (text() = '4')]");
    By verify_Successfully_Edit_Passenger_Info_First_Class = By.xpath("//h2[@class= 'tx-subtitle font-redhat mt-15' and (text() = 'First class')]");

    // @TCJ-05-Jejakin-User-can-Edit-Travel-Purpose-after-summary-calculate-carbon-footprint-appear
    // Scenario: User can Edit Travel Purpose after summary calculate carbon footprint appear
    By btn_Icon_Pencil_Travel_Purpose_Jejakin = By.xpath("//span[@class= 'board-purpose ger board board-green']");
    By btn_Text_Leisure_Trip_Jejakin = By.xpath("//h3[@class= 'tp-title-small' and (text() = 'Leisure trip')]");
    By verify_Successfully_Edit_Travel_Purpose_Leisure_Trip = By.xpath("//h2[@class= 'tx-subtitle font-redhat mt-10 mb-10' and (text() = 'Leisure trip')]");
    By btn_Text_Family_Trip_Jejakin = By.xpath("//h3[@class= 'tp-title-small' and (text() = 'Family trip')]");
    By verify_Successfully_Edit_Travel_Purpose_Family_Trip_Jejakin = By.xpath("//h2[@class= 'tx-subtitle font-redhat mt-10 mb-10' and (text() = 'Family trip')]");
    By btn_Text_Business_Trip_Jejakin = By.xpath("//h3[@class= 'tp-title-small' and (text() = 'Business trip')]");
    By verify_Successfully_Edit_Travel_Purpose_Business_Trip_Jejakin = By.xpath("//h2[@class= 'tx-subtitle font-redhat mt-10 mb-10' and (text() = 'Business trip')]");
    By btn_Text_Custom_Trip_Jejakin = By.xpath("//h3[@class= 'tp-title-small tx-green' and (text() = 'Custom trip')]");
    By select_Hotel_2_Stars_Custom_Trip_Jejakin = By.xpath("//div[@class= 'badge-jejakin mx-auto null' and (text() = '2 Stars')]");
    By select_Stay_3_Days_Custom_Trip_Jejakin = By.xpath("//div[@class= 'badge-jejakin mx-auto null' and (text() = '3 Days')]");
    By select_Distance_Custom_Trip_Jejakin = By.xpath("//div[@class= 'badge-jejakin mx-auto null' and (text() = '5 km')]");
    By btn_Save_Custom_Trip_Jejakin = By.xpath("//button[@class= 'dflex mt-auto mx-auto mb-10 Button_btn___hqnz Button_btnBlock__2xQWD Button_btnGreen__k7VCG' and (text() = 'Save')]");
    By verify_Successfully_Edit_Travel_Purpose_Custom_Trip_Jejakin = By.xpath("//h2[@class= 'tx-subtitle font-redhat mt-10 mb-10' and (text() = 'Custom trip')]");

    // TCJ-06-Jejakin - Prototype
    By btn_Take_Action_Total_Spend_Jejakin = By.xpath("//button[@class= 'dflex mt-auto mx-auto Button_btn___hqnz Button_btnBlock__2xQWD Button_btnGreen__k7VCG Button_btnBlock__2xQWD' and (text() = 'Take Action')]");
    By verify_Total_Spend_Jejakin = By.xpath("//span[@class= 'mr-auto' and (text() = 'Pay & Offset -')]");

    public void verifyTotalSpendJejakin() {
        Actions action = new Actions(driver);
        WebElement totalSpend = wait.until(ExpectedConditions.presenceOfElementLocated(verify_Total_Spend_Jejakin));
        action.moveToElement(totalSpend).perform();
    }
    public void clickBtnTakeActionTotalSpendJejakin() {
        WebElement btnTakeActionTotalSpendJejakin = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Take_Action_Total_Spend_Jejakin));
        btnTakeActionTotalSpendJejakin.click();
    }

    // -- METHOD CODE --
    // @TCJ-05-Jejakin-User-can-Edit-Travel-Purpose-after-summary-calculate-carbon-footprint-appear
    // Scenario: User can Edit Travel Purpose after summary calculate carbon footprint appear
    public void clickBtnTextCustomTripJejakin() {
        WebElement btnTextCustomTrip = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Text_Custom_Trip_Jejakin));
        btnTextCustomTrip.click();
    }
    public void verifySuccessfullyEditTravelPurposeCustomTripJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Successfully_Edit_Travel_Purpose_Custom_Trip_Jejakin)).isDisplayed());
    }
    public void clickBtnSaveCustomTripJejakin() {
        WebElement btnSaveCustomTrip = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Save_Custom_Trip_Jejakin));
        btnSaveCustomTrip.click();
    }
    public void selectDistanceCustomTripJejakin() {
        WebElement selectDistanceCustomTrip = wait.until(ExpectedConditions.presenceOfElementLocated(select_Distance_Custom_Trip_Jejakin));
        selectDistanceCustomTrip.click();
    }
    public void selectStay3DaysCustomTripJejakin() {
        WebElement selectStay3DaysCustomTrip = wait.until(ExpectedConditions.presenceOfElementLocated(select_Stay_3_Days_Custom_Trip_Jejakin));
        selectStay3DaysCustomTrip.click();
    }
    public void selectHotel2StarsCustomTripJejakin() {
        WebElement selectHotel2StarsCustomTrip = wait.until(ExpectedConditions.presenceOfElementLocated(select_Hotel_2_Stars_Custom_Trip_Jejakin));
        selectHotel2StarsCustomTrip.click();
    }
    public void verifySuccessfullyEditTravelPurposeBusinesstripJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Successfully_Edit_Travel_Purpose_Business_Trip_Jejakin)).isDisplayed());
    }
    public void clickBtnTextBusinessTripJejakin() {
        WebElement btnTextFamilyTrip = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Text_Business_Trip_Jejakin));
        btnTextFamilyTrip.click();
    }
    public void verifySuccessfullyEditTravelPurposeFamilytripJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Successfully_Edit_Travel_Purpose_Family_Trip_Jejakin)).isDisplayed());
    }
    public void clickBtnTextFamilyTripJejakin() {
        WebElement btnTextFamilyTrip = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Text_Family_Trip_Jejakin));
        btnTextFamilyTrip.click();
    }
    public void clickBtnTextLeisureTripJejakin() {
        WebElement btnTextLeisureTrip = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Text_Leisure_Trip_Jejakin));
        btnTextLeisureTrip.click();
    }
    public void verifySuccessfullyEditTravelPurpose_LeisureTripJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Successfully_Edit_Travel_Purpose_Leisure_Trip)).isDisplayed());
    }
    public void clickBtnIconPencilTravelPurposeJejakin() {
        WebElement btnIconPencilTravelPurpose = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Icon_Pencil_Travel_Purpose_Jejakin));
        btnIconPencilTravelPurpose.click();
    }




    // @TCJ-04-Jejakin-User-can-Edit-Passenger-Info-after-summary-calculate-carbon-footprint-appear
    // Scenario: User can Edit Passenger Info after summary calculate carbon footprint appear
    public void verifySuccessfullyEditPassengerInfoFirstClassJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Successfully_Edit_Passenger_Info_First_Class)).isDisplayed());
    }
    public void select4NumberOfPassengerJejakin() {
        WebElement select4NumberOfPassenger = wait.until(ExpectedConditions.presenceOfElementLocated(select_4_Number_Of_Passenger_Jejakin));
        select4NumberOfPassenger.click();
    }
    public void selectFirstCabinClassJejakin() {
        WebElement selectFirstCabinClass = wait.until(ExpectedConditions.presenceOfElementLocated(select_First_Class_Jejakin));
        selectFirstCabinClass.click();
    }
    public void verifySuccessfullyEditPassengerInfoEconomyClassJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Successfully_Edit_Passenger_Info_Economy_Class)).isDisplayed());
    }
    public void select3NumberOfPassengerJejakin() {
        WebElement select3NumberOfPassenger = wait.until(ExpectedConditions.presenceOfElementLocated(select_3_Number_Of_Passenger_Jejakin));
        select3NumberOfPassenger.click();
    }
    public void selectEconomyCabinClassJejakin() {
        WebElement selectEconomyCabinClass = wait.until(ExpectedConditions.presenceOfElementLocated(select_Economy_Class_Jejakin));
        selectEconomyCabinClass.click();
    }
    public void verifySuccessfullyEditPassengerInfoBusinessClassJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Successfully_Edit_Passenger_Info_Business_Class)).isDisplayed());
    }
    public void clickBtnSavePassengerInfoJejakin() {
        WebElement btnSavePassengerInfo = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Save_Passenger_Info_Jejakin));
        btnSavePassengerInfo.click();
    }
    public void select2NumberOfPassengerJejakin() {
        WebElement select2NumberOfPassenger = wait.until(ExpectedConditions.presenceOfElementLocated(select_2_Number_Of_Passenger_Jejakin));
        select2NumberOfPassenger.click();
    }
    public void selectBusinessCabinClassJejakin() {
        WebElement selectBusinessCabinClass = wait.until(ExpectedConditions.presenceOfElementLocated(select_Business_Cabin_Class_Jejakin));
        selectBusinessCabinClass.click();
    }
    public void clickBtnIconPencilPassengerInfoJejakin() {
        WebElement btnIconPencilInfo = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Icon_Pencil_Passenger_Info_Jejakin));
        btnIconPencilInfo.click();
    }


    // @TCJ-03-Jejakin-User-Edit-Flight-Route
    // Scenario: User Edit Flight Route
    public void inputSearchArrivalAirportEditJejakin() {
        WebElement inputSearchArrival = wait.until(ExpectedConditions.presenceOfElementLocated(input_Search_Airport_Arrival_Jejakin));
        while (!inputSearchArrival.getAttribute("value").equals("")) {
            inputSearchArrival.sendKeys(Keys.BACK_SPACE);
        }
        inputSearchArrival.sendKeys("Soekarno Hatta");
    }
    public void inputSearchDepartureAirportEditJejakin() {
        WebElement inputSearchArrival = wait.until(ExpectedConditions.presenceOfElementLocated(input_Search_Airport_Arrival_Jejakin));
        while (!inputSearchArrival.getAttribute("value").equals("")) {
            inputSearchArrival.sendKeys(Keys.BACK_SPACE);
        }
        inputSearchArrival.sendKeys("Ngurah rai");
    }
    public void clickBtnIconPencilFlightRouteJejakin() {
        WebElement btnIconPencilFlightRoute = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Icon_Pencil_Flight_Route_Jejakin));
        btnIconPencilFlightRoute.click();
    }


    // @TCJ-02-Jejakin-User-Calculate-Carbon-Footprint-Jejakin
    // Scenario: User Calculate Carbon Footprint Jejakin
    public void verifyNoteInfoCarbonFootprintCalculationJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Note_Info_Carbon_Footprint_Calculation_Jejakin)).isDisplayed());
    }
    public void verifyResultCalculateYourCarbonFootprintJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Result_Calculate_Your_Carbon_Footprint_Jejakin)).isDisplayed());
    }
    public void verifyResultYourCarbonFootprintJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Result_Your_Carbon_Footprint_Jejakin)).isDisplayed());
    }

    public void clickTextResultArrivalJejakin() {
        WebElement textResultArrival = wait.until(ExpectedConditions.presenceOfElementLocated(text_Result_Arrival_Jejakin));
        textResultArrival.click();
    }
    public void clickTextResultDepatureJejakin() {
        WebElement textResultDepature = wait.until(ExpectedConditions.presenceOfElementLocated(text_Result_Departure_Jejakin));
        textResultDepature.click();
    }
    public void inputSearchArrivalJejakin() {
        WebElement inputSearchArrival = wait.until(ExpectedConditions.presenceOfElementLocated(input_Search_Airport_Arrival_Jejakin));
        while (!inputSearchArrival.getAttribute("value").equals("")) {
            inputSearchArrival.sendKeys(Keys.BACK_SPACE);
        }
        inputSearchArrival.sendKeys("Ngurah rai");
    }
    public void inputSearchDepatureJejakin() {
        WebElement inputSearchDepature = wait.until(ExpectedConditions.presenceOfElementLocated(input_Search_Airport_Depature_Jejakin));
        inputSearchDepature.sendKeys("Soekarno Hatta");
    }
    public void clickBtnIconPencilJejakin() {
        WebElement btnIconPencil = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Icon_Pencil_Jejakin));
        btnIconPencil.click();
    }


    // @TCJ-01-Jejakin-User-Start-Jejakin
    // Scenario: User Start Jejakin
    public void verifyStartJejakin() {
        Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(verify_Start_Jejakin)).isDisplayed());
    }
    public void clickBtnStartJejakin() {
        WebElement btnStart = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Start_Jejakin));
        btnStart.click();
    }

}
