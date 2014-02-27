package com.hrm.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class TestUtil extends TestBase {
	
	 public static boolean isElementEnabled(String xpathKey){
			
			try{

				sleep(1);
		        if(driver.findElement(By.xpath(xpathKey)).isEnabled()){
		        	
		        	return true;
		        	
		        }else{
		        	
		        	return false;
		        }
				
			}catch(Exception e){
				
				e.printStackTrace();
				return false;
			}
		}
			 
		    public static void sleep(int intSeconds){
			
			try{
				Thread.sleep(1000*intSeconds);
				
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
		    public static boolean isObjPresent(String xpathKey, int intSeconds){
			
			boolean flag = false;
			for(int iCount=0; iCount<=intSeconds; iCount++){
				
				try{
					Thread.sleep(1000);
					if(isElementPresent(xpathKey)){
						
						flag = true;
						break;
						
					}else{
						
						flag = false;
					}
					
				}catch(Exception e){
					
					e.printStackTrace();
				}
			}
			
			return flag;
		}
		     public static boolean isElementPresent(String xpathKey){
			
			try{
				WebElement webElement = getObject(xpathKey);
				if(!(webElement == null)){
					
					return true;
					
				}else{
					
					return false;
				}
				
			}catch(Exception e){
				
				e.printStackTrace();
				return false;
			}
		}
		     public static boolean selectValueFromDrpDwn(String xPathKey, String strValue){
		 		
		 		try{
		 			Select element;
		 			if(!strValue.equals("")){
		 				
		 				element = new Select(getObject(xPathKey));
		 				element.selectByVisibleText(strValue);
		 			}
		 			return true;
		 			
		 			
		 		}catch(Exception e){
		 			
		 			e.printStackTrace();
		 			return false;
		 		}
		 	
		 }
		     public static boolean click(String xpathKey){
		 		
		 		try{
		 			boolean blnElementPresent;
		 			
		 			// Check the element currently present or not 
		 			blnElementPresent = isElementPresent(xpathKey);
		 			
		 			if((blnElementPresent==true)){
		 				
		 				getObject(xpathKey).click();
		 				return true;
		 				
		 			}else{
		 				
		 				return false;
		 			}
		 			
		 			
		 		}catch(Exception e){
		 			
		 			e.printStackTrace();
		 			return false;
		 		}
		 	}

		 	public static boolean setText(String xpathKey, String value){
		 		
		 		try{
		 			boolean blnElementPresent;
		             blnElementPresent = isElementPresent(xpathKey);
		             if(blnElementPresent==true){
		             	
		             	//If this element is a text entry element, this will clear the value
		                  getObject(xpathKey).clear();
		                 //Typing into an element, which may set its value
		                 getObject(xpathKey).sendKeys(value);                          
		                 return true;
		                 
		             }else{
		             	
		             	return false;
		             }
		 			
		 		}catch(Exception e){
		 			
		 			e.printStackTrace();
		 			return false;
		 		}
		 	}
		 	
		 	public static void  login()
		 	{
		 		
		 		setText("//input[@name='username']","Admin");
		 		setText("//input[@name='password']","admin");
		 		click("//input[@name='commit']");
		 	}
         
         
         
     	
    	

   	
    		
    	}
         
         

