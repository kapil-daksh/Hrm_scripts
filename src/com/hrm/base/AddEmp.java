package com.hrm.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddEmp<driver> extends TestBase {
	
	
   @Test

    public void addEmployee() throws InterruptedException, IOException {
   	
	   
	   TestUtil.login();
	   
	 
   	 // Clicking on add Employee link
           
	   Reporter.log("Clicking on add Employee link");	
          
         driver.get("http://croissanceservices.com/hrm/admin/emp_add.php#");
          
 

       // Entering the first name
           Reporter.log("Entering the first name");
           Assert.assertTrue(TestUtil.setText("//input[@id='fname']","abhik"));
           
       
        // Entering the user name
           Reporter.log("Entering the user name");  
           Assert.assertTrue(TestUtil.setText("//input[@id='user_id']","Admin"));
             
    
        // Entering the email
           Reporter.log("Entering the email");  
           Assert.assertTrue(TestUtil.setText("//input[@id='email']","Abhik@gmail.com")); 
   
   
        // Selecting the Gender
           Reporter.log("Selecting gender");  
           Select select1 = new Select(driver.findElement(By.xpath("//select[@id='gender']")));
           select1.selectByVisibleText("Female");
           Assert.assertTrue(TestUtil.isObjPresent("//select[@id='gender']", 20), "message");
           Assert.assertTrue(TestUtil.click("//select[@id='gender']"), "not able to click on it");
  
         // Entering the Department name
            Reporter.log("Entering Department name");  
            Select select = new Select(driver.findElement(By.xpath("//select[@id='department']")));
            select.selectByVisibleText("Administration");
            Assert.assertTrue(TestUtil.isObjPresent("//select[@id='department']", 20)," message");
            Assert.assertTrue(TestUtil.click("//select[@id='department']"), "not able to click on it");
          
             
           // Entering the Position name
              
            Reporter.log("Entering the position name");  
              Select select11 = new Select(driver.findElement(By.xpath("//select[@id='position']")));
              select11.selectByVisibleText("Tester");
              Assert.assertTrue(TestUtil.isObjPresent("//select[@id='position']", 20), "message");
              Assert.assertTrue(TestUtil.setText("//select[@id='position']","bvkjgkj")); 
                            
       
          // Entering the Report to person
              Reporter.log("Entering the Repot to person");
              Select select12 = new Select(driver.findElement(By.xpath("//select[@name='report']")));
            select12.selectByVisibleText("kapil");  
            Assert.assertTrue(TestUtil.isObjPresent("//select[@name='report']", 20), "message");
              Assert.assertTrue(TestUtil.setText("//select[@name='report']","NOt selected")); 
        
              }}
              /*      
     
            // Entering the Experience 
              Reporter.log("Entering the Experience ");  
              Assert.assertTrue(TestUtil.setText("xpath=(//select[@id='department'])[2]","1 year")); 
              Assert.assertTrue(TestUtil.setText("xpath=(//select[@id='department'])[3]","6 month")); 
             
            // Entering the Password  
              Reporter.log("Entering the Password");  
              Assert.assertTrue(TestUtil.setText("//input[@id='password']","123456789"));   
              
            // Entering the Confirming Password  
              Reporter.log("Entering the Confirming Password ");  
              Assert.assertTrue(TestUtil.setText("//input[@id='password-check']","123456789"));   
              
        
            // Entering the current Address  
              Reporter.log("Entering the current Address");  
              Assert.assertTrue(TestUtil.setText("//textarea[@name='current_address']","bangalore"));   
            
            // Entering the Permanent Address  
              Reporter.log("Entering the Permanent Address ");  
              Assert.assertTrue(TestUtil.setText("//textarea[@name='permanant_address']","bangalore"));   
              
           //  on browse button to look up image 
              Reporter.log("Clicking on browse button to look up image  ");  
              Assert.assertTrue(TestUtil.setText("//input[@id='image_file']","C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg"));   
              
           //  Clicking on submit button
            
              Reporter.log("Clicking on submit button");	
              Assert.assertTrue(TestUtil.isObjPresent("//input[@id='submit']", 20), "Unable to click on view button");
              Assert.assertTrue(TestUtil.click("//input[@id='submit']"),"Unable to click on View button");
               
              //  Clicking on add employee button
              
              Reporter.log(" Clicking on add employee button");	
              Assert.assertTrue(TestUtil.isObjPresent("//a[contains(text(),'Add Employee')]", 20), "Unable to click on view button");
              Assert.assertTrue(TestUtil.click("//a[contains(text(),'Add Employee')]"),"Unable to click on View button");
               
         
      
    
      
      */

