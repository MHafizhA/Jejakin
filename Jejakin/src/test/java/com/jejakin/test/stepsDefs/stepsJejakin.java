package com.jejakin.test.stepsDefs;

import com.jejakin.base.baseSetup;
import com.jejakin.pages.Jejakin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsJejakin extends baseSetup {

    Jejakin jejakin;

    // @TCJ-01-Jejakin
    // Scenario: User Start Jejakin
    @Given("User navigate to Jejakin")
    public void userNavigateToJejakin() {
        initialization();
        jejakin = new Jejakin();
    }

    @When("user click button Start")
    public void userClickButtonStart() {
        jejakin.clickBtnStartJejakin();
    }

    @Then("User successfully Start Jejakin")
    public void userSuccessfullyStartJejakin() throws Exception {
        jejakin.verifyStartJejakin();
        Thread.sleep(3000);
        driver.quit();
    }

    // @TCJ-02-Jejakin
    // Scenario: User Calculate Carbon Footprint Jejakin
    @Given("User navigate to Jejakin Carbon Page")
    public void userNavigateToJejakinCarbonPage() {
        initialization();
        jejakin = new Jejakin();
    }


    @When("User click icon Pencil")
    public void userClickIconPencil() {
        jejakin.clickBtnStartJejakin();
        jejakin.clickBtnIconPencilJejakin();
    }

    @And("User input Departure airport")
    public void userInputDepartureAirport() {
        jejakin.inputSearchDepatureJejakin();
    }

    @And("User click the result Departure")
    public void userClickTheResultDeparture() {
        jejakin.clickTextResultDepatureJejakin();
    }

    @And("User input Arrival airport")
    public void userInputArrivalAirport() {
        jejakin.inputSearchArrivalJejakin();
    }

    @And("User click the result Arrival")
    public void userClickTheResultArrival() {
        jejakin.clickTextResultArrivalJejakin();
    }

    @Then("Summary Flight Route appear and the result Carbon Footprint appear")
    public void summaryFlightRouteAppearAndTheResultCarbonFootprintAppear() throws Exception {
        Thread.sleep(1500);
        jejakin.verifyResultYourCarbonFootprintJejakin();
        Thread.sleep(1500);
        jejakin.verifyResultCalculateYourCarbonFootprintJejakin();
        Thread.sleep(1500);
        jejakin.verifyNoteInfoCarbonFootprintCalculationJejakin();
        Thread.sleep(2000);
        driver.quit();
    }

    // @TCJ-03-Jejakin-User-Edit-Flight-Route
    // Scenario: User Edit Flight Route
    @When("User click icon Pencil Flight Route")
    public void userClickIconPencilFlightRoute() {
        jejakin.clickBtnIconPencilJejakin();
    }

    @And("User input Departure airport Edit")
    public void userInputDepartureAirportEdit() {
        jejakin.inputSearchDepartureAirportEditJejakin();
    }

    @And("User click the result Departure Edit")
    public void userClickTheResultDepartureEdit() {
        jejakin.clickTextResultArrivalJejakin();
    }

    @And("User input Arrival airport Edit")
    public void userInputArrivalAirportEdit() {
        jejakin.inputSearchArrivalAirportEditJejakin();
    }

    @And("User click the result Arrival Edit")
    public void userClickTheResultArrivalEdit() {
        jejakin.clickTextResultDepatureJejakin();
    }

    @Then("User Successfully Edit Flight Route")
    public void userSuccessfullyEditFlightRoute() throws Exception {
        jejakin.verifyResultCalculateYourCarbonFootprintJejakin();
        Thread.sleep(1500);
        driver.quit();
    }

    @Then("Summary Flight Route appear and the result Carbon Footprint appear Edit")
    public void summaryFlightRouteAppearAndTheResultCarbonFootprintAppearEdit() throws Exception {
        Thread.sleep(1500);
        jejakin.verifyResultYourCarbonFootprintJejakin();
        Thread.sleep(1500);
        jejakin.verifyResultCalculateYourCarbonFootprintJejakin();
        Thread.sleep(1500);
        jejakin.verifyNoteInfoCarbonFootprintCalculationJejakin();
    }

    // @TCJ-04-Jejakin-User-can-Edit-Passenger-Info-after-summary-calculate-carbon-footprint-appear
    // Scenario: User can Edit Passenger Info after summary calculate carbon footprint appear
    @When("User click icon pencil Passenger Info")
    public void userClickIconPencilPassengerInfo() {
        jejakin.clickBtnIconPencilPassengerInfoJejakin();
    }

    @Then("Summary Flight Route appear and the result Carbon Footprint appear Passenger Info")
    public void summaryFlightRouteAppearAndTheResultCarbonFootprintAppearPassengerInfo() throws Exception {
        Thread.sleep(1000);
    }

    @And("User select Business in Cabin Class")
    public void userSelectBusinessInCabinClass() {
        jejakin.selectBusinessCabinClassJejakin();
    }


    @And("User click button Save")
    public void userClickButtonSave() throws Exception {
        Thread.sleep(2000);
        jejakin.clickBtnSavePassengerInfoJejakin();
    }

    @Then("User Successfully Edit Passenger info to Business Class")
    public void userSuccessfullyEditPassengerInfoToBusinessClass() throws Exception {
        Thread.sleep(1000);
        jejakin.verifySuccessfullyEditPassengerInfoBusinessClassJejakin();
    }

    @And("User can see the result Carbon footprint")
    public void userCanSeeTheResultCarbonFootprint() {
    }

    @When("User click icon pencil Passenger info - Economy Class")
    public void userClickIconPencilPassengerInfoEconomyClass() {
        jejakin.clickBtnIconPencilPassengerInfoJejakin();
    }

    @And("User select Economy in Cabin Class")
    public void userSelectEconomyInCabinClass() {
        jejakin.selectEconomyCabinClassJejakin();
    }

    @Then("User Successfully Edit Passenger info to Economy Class")
    public void userSuccessfullyEditPassengerInfoToEconomyClass() throws Exception {
        Thread.sleep(1000);
        jejakin.verifySuccessfullyEditPassengerInfoEconomyClassJejakin();
    }

    @When("User click icon pencil Passenger info - First Class")
    public void userClickIconPencilPassengerInfoFirstClass() {
        jejakin.clickBtnIconPencilPassengerInfoJejakin();
    }

    @And("User select First Class in Cabin Class")
    public void userSelectFirstClassInCabinClass() {
        jejakin.selectFirstCabinClassJejakin();
    }

    @Then("User Successfully Edit Passenger info to First Class")
    public void userSuccessfullyEditPassengerInfoToFirstClass() throws Exception {
        Thread.sleep(1000);
        jejakin.verifySuccessfullyEditPassengerInfoFirstClassJejakin();
        Thread.sleep(1000);
        driver.quit();
    }

    @And("User select {int} in Number of Passenger - Seat two")
    public void userSelectInNumberOfPassengerSeatTwo(int arg0) {
        jejakin.select2NumberOfPassengerJejakin();
    }

    @And("User select {int} in Number of Passenger - Seat three")
    public void userSelectInNumberOfPassengerSeatThree(int arg0) {
        jejakin.select3NumberOfPassengerJejakin();
    }

    @And("User select {int} in Number of Passenger - Seat four")
    public void userSelectInNumberOfPassengerSeatFour(int arg0) {
        jejakin.select4NumberOfPassengerJejakin();
    }


    // @TCJ-05-Jejakin-User-can-Edit-Travel-Purpose-after-summary-calculate-carbon-footprint-appear
    // Scenario: User can Edit Travel Purpose after summary calculate carbon footprint appear
    @When("User click icon Pencil Travel Purpose - Leisure trip")
    public void userClickIconPencilTravelPurposeLeisureTrip() {
        jejakin.clickBtnIconPencilTravelPurposeJejakin();
    }

    @Then("User Successfully Edit Travel Purpose - Leisure trip")
    public void userSuccessfullyEditTravelPurposeLeisureTrip() throws Exception {
        Thread.sleep(2000);
        jejakin.verifySuccessfullyEditTravelPurpose_LeisureTripJejakin();
    }

    @When("User click icon Pencil Travel Purpose - Family trip")
    public void userClickIconPencilTravelPurposeFamilyTrip() {
        jejakin.clickBtnIconPencilTravelPurposeJejakin();

    }

    @Then("User Successfully Edit Travel Purpose - Family trip")
    public void userSuccessfullyEditTravelPurposeFamilyTrip() throws Exception {
        Thread.sleep(2000);
        jejakin.verifySuccessfullyEditTravelPurposeFamilytripJejakin();
    }

    @When("User click icon Pencil Travel Purpose - Business trip")
    public void userClickIconPencilTravelPurposeBusinessTrip() {
        jejakin.clickBtnIconPencilTravelPurposeJejakin();

    }

    @Then("User Successfully Edit Travel Purpose - Business trip")
    public void userSuccessfullyEditTravelPurposeBusinessTrip() throws Exception {
        Thread.sleep(2000);
        jejakin.verifySuccessfullyEditTravelPurposeBusinesstripJejakin();
    }

    @When("User click icon Pencil Travel Purpose - Custom trip")
    public void userClickIconPencilTravelPurposeCustomTrip() {
        jejakin.clickBtnIconPencilTravelPurposeJejakin();

    }

    @And("User select Hotel Star - {int}\\(two) Stars")
    public void userSelectHotelStarTwoStars(int arg0) {
        jejakin.selectHotel2StarsCustomTripJejakin();
    }

    @And("User select How long are you stay - {int}\\(three) Days")
    public void userSelectHowLongAreYouStayThreeDays(int arg0) {
        jejakin.selectStay3DaysCustomTripJejakin();
    }

    @And("User select Average car distance per trip - {int}\\(five) Km")
    public void userSelectAverageCarDistancePerTripFiveKm(int arg0) {
        jejakin.selectDistanceCustomTripJejakin();
    }

    @And("User click button save Custom Trip")
    public void userClickButtonSaveCustomTrip() {
        jejakin.clickBtnSaveCustomTripJejakin();
    }

    @Then("User Successfully Edit Travel Purpose - Custom trip")
    public void userSuccessfullyEditTravelPurposeCustomTrip() throws Exception {
        Thread.sleep(2000);
        jejakin.verifySuccessfullyEditTravelPurposeCustomTripJejakin();
        driver.quit();
    }

    @And("User click button text Leisure trip")
    public void userClickButtonTextLeisureTrip() throws Exception {
        Thread.sleep(1000);
        jejakin.clickBtnTextLeisureTripJejakin();
    }

    @And("User click button text Family trip")
    public void userClickButtonTextFamilyTrip() throws Exception {
        Thread.sleep(1000);
        jejakin.clickBtnTextFamilyTripJejakin();
    }

    @And("User click button text Business trip")
    public void userClickButtonTextBusinessTrip() throws Exception {
        Thread.sleep(1000);
        jejakin.clickBtnTextBusinessTripJejakin();
    }

    @And("And User click button text Custom trip")
    public void andUserClickButtonTextCustomTrip() throws Exception {
        Thread.sleep(1000);
        jejakin.clickBtnTextCustomTripJejakin();
    }

    @Then("Summary Flight Route appear and the result Carbon Footprint appear Travel Purpose")
    public void summaryFlightRouteAppearAndTheResultCarbonFootprintAppearTravelPurpose() throws Exception {
        Thread.sleep(1500);
        jejakin.verifyResultYourCarbonFootprintJejakin();
        Thread.sleep(1500);
        jejakin.verifyResultCalculateYourCarbonFootprintJejakin();
        Thread.sleep(1500);
        jejakin.verifyNoteInfoCarbonFootprintCalculationJejakin();
        Thread.sleep(2000);
    }

    // Prototype
    @When("User click Take Action")
    public void userClickTakeAction() {
        jejakin.clickBtnTakeActionTotalSpendJejakin();
    }

    @Then("User can see the summary total order")
    public void userCanSeeTheSummaryTotalOrder() throws Exception {
        jejakin.verifyTotalSpendJejakin();
        Thread.sleep(3000);
        driver.quit();
    }

    @Then("Summary Flight Route appear and the result Carbon Footprint appear test")
    public void summaryFlightRouteAppearAndTheResultCarbonFootprintAppearTest() throws Exception {
        Thread.sleep(2000);
    }
}
