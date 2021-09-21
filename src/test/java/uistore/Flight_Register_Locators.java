package uistore;

import org.openqa.selenium.By;

public class Flight_Register_Locators {
	protected By Flight_page=By.partialLinkText("Flights");
	protected By Passenger=By.name("passCount");
	protected By Departure=By.name("fromPort");
	protected By Month=By.name("fromMonth");
	protected By Day=By.name("fromDay");
	protected By Arriving=By.name("toPort");
	protected By Returning=By.name("toMonth");
	protected By ReturnDay=By.name("toDay");
    protected By ServiceClass=By.xpath("//input[@value='First']");
    protected By Airline=By.name("airline");
    protected By ContinueButton=By.xpath("//input[@type='image']");
    protected By DepartFlight=By.xpath("//input [@value = 'Blue Skies Airlines$361$271$7:10']");
    protected By ReturnFlight=By.xpath("//input [@value='Unified Airlines$633$303$18:44']");
    protected By FlightContiueButton=By.xpath("//input [@src='/images/forms/continue.gif']");
    protected By Passenger1First=By.xpath("//input [@name='passFirst0']");
    protected By Passenger1Last=By.xpath("//input [@name='passLast0']");
    protected By Meal1=By.xpath("//select [@name='pass.0.meal']");
    protected By Passenger2First=By.xpath("//input [@name='passFirst1']");
    protected By Passenger2Last=By.xpath("//input [@name='passLast1']");
    protected By Meal2=By.xpath("//select [@name='pass.1.meal']");

}
