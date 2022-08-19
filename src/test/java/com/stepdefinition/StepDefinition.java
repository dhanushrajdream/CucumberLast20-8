package com.stepdefinition;


import com.Maven_Cucumber.BaseClass; 
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends BaseClass {
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		
     String name = s.getName();
     System.out.println(name);

	}
	@After
	public void afterhooks(Scenario d) {
		String status = d.getStatus();
		System.out.println(status);
	
		
	}//Page one
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();  
        urlLaunch(url);
	}

	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
		sendKeys(pom.getInstanceLoginPage().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		sendKeys(pom.getInstanceLoginPage().getPassword(), password);
	}

	@Then("^user Click The Login Key It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Key_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickElement(pom.getInstanceLoginPage().getLogin());
	}
	//Search hotel Page
	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
		
		selectValue(pom.getInstancePageOne().getLocation(), "Paris");

	}

	@When("^user Select The Hotels In The Hotels Field$")
	public void user_Select_The_Hotels_In_The_Hotels_Field() throws Throwable {
		
		selectvisibletext(pom.getInstancePageOne().getHotels(), "Hotel Sunshine"); 
	}

	@When("^user Select The Room In The Room Field$")
	public void user_Select_The_Room_In_The_Room_Field() throws Throwable {
		 
		selectindex(pom.getInstancePageOne().getRoom_type(), 4);
	}

	@When("^user Select The Number Of Rooms In The Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
		
		selectindex(pom.getInstancePageOne().getRoom_nos(), 5);
	}

	@When("^user Enter The Check In Date In The Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {
		
		clear(pom.getInstancePageOne().getDatepick_in());                                                           //fromdate.clear(); //fromdate in hotel
	    String fromdate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFromDate();
	    sendKeys(pom.getInstancePageOne().getDatepick_in(),fromdate);
	}

	@When("^user Enter The Check Out Date In The Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {
		
		clear(pom.getInstancePageOne().getDatepick_out());                                                          //todate.clear();
	    String toDate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getToDate();                          //frm-cr
	    sendKeys(pom.getInstancePageOne().getDatepick_out(), toDate);
	}

	@When("^user Select The Adults Per Room In The Adults Per Room Field$")
	public void user_Select_The_Adults_Per_Room_In_The_Adults_Per_Room_Field() throws Throwable {
		
		 selectValue(pom.getInstancePageOne().getAdult_room(), "4");                                                  //people in rooms
	}

	@When("^user Select The Children Per Room In The Children Per Room Field$")
	public void user_Select_The_Children_Per_Room_In_The_Children_Per_Room_Field() throws Throwable {
		
		 selectindex(pom.getInstancePageOne().getChild_room(), 4);                                                   //child in rooms
	}

	@Then("^user Click The Search Key It Navigate To The Select Hotel Page$")
	public void user_Click_The_Search_Key_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
		
		clickElement(pom.getInstancePageOne().getSubmit());                                                         //search option
	}

	//Page Two Select Hotel page
	
	@When("^user Select Hotel In The Select Hotel Field$")
	public void user_Select_Hotel_In_The_Select_Hotel_Field() throws Throwable {
		
		clickElement(pom.getInstancePageTwo().getRadiobutton_0());                                                   //radiobutton
	}

	@Then("^user Click The Continue Key It Navigate To The Book Hotel Page$")
	public void user_Click_The_Continue_Key_It_Navigate_To_The_Book_Hotel_Page() throws Throwable {
		
	    clickElement(pom.getInstancePageTwo().getCont());                                                            //continue button
	}
 
	//Page three Book Hotel Functionality
	
	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		
		 String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();                                                                                               //syntax                                                      
	     sendKeys(pom.getInstancePageThree().getFirst_name(), firstname);                                               //first name
	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
        sendKeys(pom.getInstancePageThree().getLast_name(), lastname);                                                    //last name
	}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		
		 String addres = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddres();
	     sendKeys(pom.getInstancePageThree().getAddress(), addres);                                                  //billing adress
	}

	@When("^user Enter The Credit Card Number In The Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {
		
		 String ccnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcNumber();
	     sendKeys(pom.getInstancePageThree().getCc_num(), ccnumber);                                          //credit card number
	}

	@When("^user Select The Credit Card Type In The Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
		
		 selectValue(pom.getInstancePageThree().getCc_type(), "VISA");                                                  //cc.selectByValue("VISA"); 
	}

	@When("^user Select Expiry Month And Year In The Expiry Date Field$")
	public void user_Select_Expiry_Month_And_Year_In_The_Expiry_Date_Field() throws Throwable {
		
		 selectValue(pom.getInstancePageThree().getCc_exp_month(), "5");                                                //cc expire month
		 selectValue(pom.getInstancePageThree().getCc_exp_year(), "2022");                                              //cc expire year
	}

	@When("^user Enter The Cvv Number In The Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
		
		String cvvnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvvNumber();
        sendKeys(pom.getInstancePageThree().getCc_cvv(), cvvnumber);                                                       //cvv number
	}

	@When("^user Click The Book Now Key And Hotel Is Booked$")
	public void user_Click_The_Book_Now_Key_And_Hotel_Is_Booked() throws Throwable {
		
		clickElement(pom.getInstancePageThree().getBook_now());                                                        //booknow button
	}

	@Then("^user Click The Logout Key And It Navigate To First Page$")
	public void user_Click_The_Logout_Key_And_It_Navigate_To_First_Page() throws Throwable {
		
		Thread.sleep(10000);
        clickElement(pom.getInstancePageThree().getLogout());                                                          // final logout button
        
		
	}

	
	
	
	
	

}
