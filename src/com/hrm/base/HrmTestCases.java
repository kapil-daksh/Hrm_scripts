package com.hrm.base;

import java.io.IOException;




import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrm.base.TestUtil;

public class HrmTestCases extends TestBase{
	

	@Test
	public void mangeLeaves() throws InterruptedException, IOException{
		
	
		
		// login to the application
		
		TestUtil.login();
		// Clicking on leave settings button
		Assert.assertTrue(TestUtil.isObjPresent("//span", 20), "Unable to click on view button");
		Assert.assertTrue(TestUtil.click("//span"),"Unable to click on View button");
        Reporter.log("Clicke on leave settings button");
	
     // Clicking on edit button
        Reporter.log("Clicking on edit button");	
         Assert.assertTrue(TestUtil.isObjPresent("//input[@id='leave_edit']", 20), "Unable to click on view button");
         Assert.assertTrue(TestUtil.click("//input[@id='leave_edit']"),"Unable to click on View button");
          
        
         // Entering the leave 
         Assert.assertTrue(TestUtil.setText("//input[@id='leave_change_count']","5"));
         Reporter.log("Entering the leave");
         
      // Clicking on change button
         Reporter.log("Clicking on change button");	
          Assert.assertTrue(TestUtil.isObjPresent("//input[@id='leave_change_button']", 10), "Unable to click on view button");
          Assert.assertTrue(TestUtil.click("//input[@id='leave_change_button']"),"Unable to click on View button");
           
	}
}

	
       
       
      




 




