package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
	
	public static RemoteWebDriver driver;
public static Properties prop;
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
	
		try {
			if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
		
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched with the url "+url+" successfully");
			reportStep("The browser "+browser+" is launched with the url "+url+" successfully", "PASS");
			
			} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched with the url "+url+" due to session not created error");
			reportStep("The browser "+browser+" is not launched with the url "+url+" due to session not created error", "FAIL");
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched as the url "+url+" does not contain http/https");
            reportStep("The browser "+browser+" is not launched as the url "+url+" does not contain http/https", "FAIL");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "FAIL");
		
		}
		}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data+"");
			reportStep("The element with id "+idValue+" is entered with data "+data+"", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "FAIL");
			}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
				reportStep("The element with id "+idValue+" is not visible in the application", "FAIL");
			}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
				reportStep("The element with id "+idValue+" is not interactable in the application", "FAIL");
			}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
				reportStep("The element with id "+idValue+" is not stable in the application", "FAIL");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" as unexpected alert opened");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" as unexpected alert opened", "FAIL");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "PASS");
			} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
				reportStep("The element with name "+nameValue+" is not found in the DOM", "FAIL");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" as unexpected alert opened");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to an unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		 try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			
			//System.out.println("The element with xpath "+xpathValue+" is entered with the data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with the data "+data, "PASS");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.out.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.out.println("The element with xpath "+xpathValue+" is not entered with data "+data+" as unexpected alert opened");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to an unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is matched with expected title "+title);
				reportStep("The title of the page "+actualTitle+" is matched with expected title "+title, "PASS");
			} else {
				//System.err.println("The title of the page "+actualTitle+" is not matched with expected title"+title);
				reportStep("The title of the page "+actualTitle+" is not matched with expected title"+title, "FAIL");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+title+" is not verified due to unknown error");
			reportStep("The title of the page "+title+" is not verified due to unknown error", "FAIL");
		} finally {
			takeSnap();
		}
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementById(id).getText();
			
			if(actualText.equals(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is matched with expected text "+text, "PASS");
			} else {
				//System.err.println("The element with id "+id+" is holding the text "+actualText+" is not matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is not matched with expected text "+text, "FAIL");
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is holding the text "+text+" is not found in the DOM");
			reportStep("The element with id "+id+" is holding the text "+text+" is not found in the DOM", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is holding the text "+text+" is not verified as an unknown alert opened");
			reportStep("The element with id "+id+" is holding the text "+text+" is not verified as an unknown alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is holding the text "+text+" is not verified due to an unknown error");
			reportStep("The element with id "+id+" is holding the text "+text+" is not verified due to an unknown error", "FAIL");
		} finally {
			takeSnap();
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			
			if(actualText.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is matched with the expected text "+text, "PASS");
			}else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with the expected text "+text, "FAIL");
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is holding the text "+text+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is holding the text "+text+" is not found in the DOM", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" holding the text "+text+" is not verified as un unknown alert opened");
			reportStep("The element with xpath "+xpath+" holding the text "+text+" is not verified as un unknown alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" holding the text "+text+" is not verified due to an unknown error");
			reportStep("The element with xpath "+xpath+" holding the text "+text+" is not verified due to an unknown error", "FAIL");
		} finally {
			takeSnap();
		}
		}
	

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			
			if(actualText.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" holding the text "+actualText+" contains the expected text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualText+" contains the expected text "+text, "PASS");
			} else {
				//System.err.println("The element with xpath "+xpath+" holding the text "+actualText+" does not contain the expected text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualText+" does not contain the expected text "+text, "FAIL");
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" contains the text "+text+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" contains the text "+text+" is not found in the DOM", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" contains the text "+text+" is not verfied as an unknown alert opened");
			reportStep("The element with xpath "+xpath+" contains the text "+text+" is not verfied as an unknown alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" contains the text "+text+" is not verified due to an unknown error");
			reportStep("The element with xpath "+xpath+" contains the text "+text+" is not verified due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
		
		
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
			try {
				driver.findElementById(id).click();
				//System.out.println("The element with id "+id+" is clicked");
				reportStep("The element with id "+id+" is clicked", "PASS");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with id "+id+" is not found in the DOM");
				reportStep("The element with id "+id+" is not found in the DOM", "FAIL");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not visible in the application");
				reportStep("The element with id "+id+" is not visible in the application", "FAIL");
			}catch (ElementClickInterceptedException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is disabled in the application");
				reportStep("The element with id "+id+" is disabled in the application", "FAIL");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not interactable in the application");
				reportStep("The element with id "+id+" is not interactable in the application", "FAIL");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not stable in the application");
				reportStep("The element with id "+id+" is not stable in the application", "FAIL");
			}catch (UnhandledAlertException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not clicked as unknown alert opened");
				reportStep("The element with id "+id+" is not clicked as unknown alert opened", "FAIL");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not clicked due to an unknown error");
				reportStep("The element with id "+id+" is not clicked due to an unknown error", "FAIL");
			}finally {
				takeSnap();
			}
			}


	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with className "+classVal+" is clicked");
			reportStep("The element with className "+classVal+" is clicked", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with className "+classVal+" is not found in DOM");
			reportStep("The element with className "+classVal+" is not found in DOM", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with className "+classVal+" is not visible in the application");
			reportStep("The element with className "+classVal+" is not visible in the application", "FAIL");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with className "+classVal+" is disabled in the application");
			reportStep("The element with className "+classVal+" is disabled in the application", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with className "+classVal+" is not interactable in the application");
			reportStep("The element with className "+classVal+" is not interactable in the application", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with className "+classVal+" is not stable in the application");
			reportStep("The element with className "+classVal+" is not stable in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with className "+classVal+" is not clicked as an unknown alert opened");
			reportStep("The element with className "+classVal+" is not clicked as an unknown alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with className "+classVal+" is not clicked due to an unknown error");
			reportStep("The element with className "+classVal+" is not clicked due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked");
			reportStep("The element with name "+name+" is clicked", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in DOM");
			reportStep("The element with name "+name+" is not found in DOM", "FAIL");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is disabled in the application");
			reportStep("The element with name "+name+" is disabled in the application", "FAIL");
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible");
			reportStep("The element with name "+name+" is not visible", "FAIL");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not interactable in the application");
				reportStep("The element with name "+name+" is not interactable in the application", "FAIL");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not stable in the application");
				reportStep("The element with name "+name+" is not stable in the application", "FAIL");
			}catch (UnhandledAlertException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not clicked as unexpected alert opened");
				reportStep("The element with name "+name+" is not clicked as unexpected alert opened", "FAIL");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not clicked due to an unknown error");
				reportStep("The element with name "+name+" is not clicked due to an unknown error", "FAIL");
			}finally {
				takeSnap();
			}
		
		}
	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link "+name+" is clicked");
			reportStep("The element with link "+name+" is clicked", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not found in the DOM");
			reportStep("The element with link "+name+" is not found in the DOM", "FAIL");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is disabled in the application");
			reportStep("The element with link "+name+" is disabled in the application", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the application");
			reportStep("The element with link "+name+" is not visible in the application", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not interactable in the application");
			reportStep("The element with link "+name+" is not interactable in the application", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in the application");
			reportStep("The element with link "+name+" is not stable in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clicked as unexpected alert opened");
			reportStep("The element with link "+name+" is not clicked as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clicked due to an unknown error");
			reportStep("The element with link "+name+" is not clicked due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link "+name+" is clicked");
			reportStep("The element with link "+name+" is clicked", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not found in the DOM");
			reportStep("The element with link "+name+" is not found in the DOM", "FAIL");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is disabled in the application");
			reportStep("The element with link "+name+" is disabled in the application", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the application");
			reportStep("The element with link "+name+" is not visible in the application", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not interactable in the application");
			reportStep("The element with link "+name+" is not interactable in the application", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in the application");
			reportStep("The element with link "+name+" is not stable in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clicked as unknown alert opened");
			reportStep("The element with link "+name+" is not clicked as unknown alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clicked due to an unknown error");
			reportStep("The element with link "+name+" is not clicked due to an unknown error", "FAIL");
		}
	
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "FAIL");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is disabled in the application");
			reportStep("The element with xpath "+xpathVal+" is disabled in the application", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as unknown alert opened");
			reportStep("The element with xpath "+xpathVal+" is not clicked as unknown alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to an unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to an unknown error", "FAIL");
			} finally {
				takeSnap();
			}
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "PASS",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "FAIL");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is disabled in the application");
			reportStep("The element with xpath "+xpathVal+" is disabled in the application", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "FAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"  is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+"  is not interactable in the application", "FAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as unknown alert opened");
			reportStep("The element with xpath "+xpathVal+" is not clicked as unknown alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to an unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to an unknown error", "FAIL");
		}
		
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String txt = null;
			try {
				 txt = driver.findElementById(idVal).getText();
				//System.out.println("The element with id "+idVal+" has the text "+txt+"");
				 reportStep("The element with id "+idVal+" has the text "+txt+"", "PASS");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with id "+idVal+" is not found in the DOM");
				reportStep("The element with id "+idVal+" is not found in the DOM", "FAIL");
				}catch (ElementNotVisibleException e) {
					// TODO: handle exception
					//System.err.println("The element with id "+idVal+" is not visible in the application");
					reportStep("The element with id "+idVal+" is not visible in the application", "FAIL");
				}catch (UnhandledAlertException e) {
					// TODO: handle exception
					//System.err.println("The element with id "+idVal+" is not found as an unexpected alert opened");
					reportStep("The element with id "+idVal+" is not found as an unexpected alert opened", "FAIL");
				}catch (WebDriverException e) {
					// TODO: handle exception
					//System.err.println("The element with id "+idVal+" is not found due to an unknown error");
					reportStep("The element with id "+idVal+" is not found due to an unknown error", "FAIL");
				}
			finally {
				takeSnap();
					}
			return txt;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String gettxt = null;
		try {
			gettxt = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" has the text "+gettxt);
			reportStep("The element with xpath "+xpathVal+" has the text "+gettxt, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "FAIL");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "FAIL");
			}catch (UnhandledAlertException e) {
			// TODO: handle exception
				//System.err.println("The element with xpath "+xpathVal+" is not found as an unknown alert opened");
				reportStep("The element with xpath "+xpathVal+" is not found as an unknown alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not found due to an unknown error");
			reportStep("The element with xpath "+xpathVal+" is not found due to an unknown error", "FAIL");
		}
		finally {
			takeSnap();
		}
		return gettxt;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement vistxt = driver.findElementById(value);
			Select sel = new Select(vistxt);
			sel.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is selected using visible text "+vistxt);
			reportStep("The element with id "+id+" is selected using visible text "+vistxt, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected in the application");
			reportStep("The element with id "+id+" is not selected in the application", "FAIL");
			}catch (UnhandledAlertException e) {
			// TODO: handle exception
				//System.err.println("The element with id "+id+" is not selected as unexpected alert opened");
				reportStep("The element with id "+id+" is not selected as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected due to an unknown error");
			reportStep("The element with id "+id+" is not selected due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement ind = driver.findElementById(id);
			Select sel = new Select(ind);
			sel.selectByIndex(value);
			//System.out.println("The element with id "+id+" is selected using index "+ind);
			reportStep("The element with id "+id+" is selected using index "+ind, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected in the application");
			reportStep("The element with id "+id+" is not selected in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected as unexpected alert opened");
			reportStep("The element with id "+id+" is not selected as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected due to an unknown error");
			reportStep("The element with id "+id+" is not selected due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> winId = driver.getWindowHandles();
			System.out.println(winId);
			for(String eachId : winId) {
				driver.switchTo().window(eachId);
				break;
			}
			//System.out.println("The driver is now active in the Parent Window");
			reportStep("The driver is now active in the Parent Window", "PASS");
		} catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The window is not found");
			reportStep("The window is not found", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The window is not found due to an unknown error");
			reportStep("The window is not found due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> winId = driver.getWindowHandles();
			System.out.println(winId);
			for(String eachId : winId) {
				
				driver.switchTo().window(eachId);
			}
			//System.out.println("The driver is now active in the Last Window");
			reportStep("The driver is now active in the Last Window", "PASS");
		}catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The window is not found");
			reportStep("The window is not found", "FAIL");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("The session is not created while opening the window");
			reportStep("The session is not created while opening the window", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The window is not found due to an unknown error");
			reportStep("The window is not found due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}
	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			 driver.switchTo().alert().accept();
			//System.out.println("The alert is accepted");
			 reportStep("The alert is accepted", "PASS", false);	 
			 
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alert is not present in the application");
			reportStep("The alert is not present in the application", "FAIL");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert is not present in the application");
			//reportStep("The alert is not present in the application", "FAIL");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not accepted due to an unknown error");
			reportStep("The alert is not accepted due to an unknown error", "FAIL");
		}
		}
	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is dismissed");
			reportStep("The alert is dismissed", "PASS");
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alert is not present in the application");
			reportStep("The alert is not present in the application", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not dismissed due to an unknown error");
			reportStep("The alert is not dismissed due to an unknown error", "FAIL");
		}
		}
	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String altxt = null;
		try {
			 altxt = driver.switchTo().alert().getText();
			System.out.println(altxt);
			//System.out.println("The element with "+altxt+" retuns the visible text");
			reportStep("The element with "+altxt+" retuns the visible text", "PASS", false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element is not found in DOM");
			reportStep("The element is not found in DOM", "FAIL", false);
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element is not found due as unexpected alert opened");
			reportStep("The element is not found due as unexpected alert opened", "FAIL", false);
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alert is not present in the application");
			reportStep("The alert is not present in the application", "FAIL", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element is not found due to an unknown error");
			reportStep("The element is not found due to an unknown error", "FAIL", false);
		}
		return altxt;
	}
	
	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		long number=0;
		try {
			number=(long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./Results/screenshots/"+number+".png");
			
			FileUtils.copyFile(tmp, dest);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The browser window is closed");
			reportStep("The browser window is closed", "PASS", false);
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window is not found");
			reportStep("The window is not found", "FAIL", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The window is not found due to an unknown error");
			reportStep("The window is not found due to an unknown error", "FAIL", false);
		}	}

	@Override
	public void closeAllBrowsers() {
		
		try {
			driver.quit();
			//System.out.println("The browsers are closed");
			reportStep("The browsers are closed", "PASS", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The windows are not closed due to an unknown error");
			reportStep("The windows are not closed due to an unknown error", "FAIL", false);
		}
	}

	@Override
	public void waitproperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void selectVisibleTextByXpath(String xpath, String data) {
		// TODO Auto-generated method stub
		try {
			 
			WebElement txt = driver.findElementByXPath(xpath);
			Select sel1 = new Select(txt);
			sel1.selectByVisibleText(data);
			//System.out.println("The element with xpath "+xpath+" is selected using visible text" +txt);
			reportStep("The element with xpath "+xpath+" is selected using visible text" +data, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected in the application");
			reportStep("The element with xpath "+xpath+" is not selected in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected as unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not selected as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected due to an unknown error");
			reportStep("The element with xpath "+xpath+" is not selected due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}
	@Override
	public void selectIndexByXpath(String xpath, int data) {
		// TODO Auto-generated method stub
		try {
			WebElement indx = driver.findElementByXPath(xpath);
			Select sel2 = new Select(indx);
			sel2.selectByIndex(data);
			//System.out.println("The element with xpath "+xpath+" is selected using index" +indx);
			reportStep("The element with xpath "+xpath+" is selected using index" +data, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected in the application");
			reportStep("The element with xpath "+xpath+" is not selected in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not select as unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not select as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not selected due to an unknown error");
			reportStep("The element with xpath "+xpath+" is not selected due to an unknown error", "FAIL");
		}
		finally {
			takeSnap();
		}
	}

	@Override
	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement vxpath =  driver.findElementByXPath(xpath);
			Select sel3 = new Select(vxpath);
			sel3.selectByValue(value);
			//System.out.println("The element with xpath "+xpath+" is selected using value"+vxpath);
			reportStep("The element with xpath "+xpath+" is selected using value" +value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected in the application");
			reportStep("The element with xpath "+xpath+" is not selected in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected as unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not selected as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected due to an unknown error");
			reportStep("The element with xpath "+xpath+" is not selected due to an unknown error", "FAIL");
		}
		finally {
			takeSnap();
		}
	}
	public void selectValueById(String id, String value) {
		try {
			WebElement sval = driver.findElementById(id);
			Select sel4 = new Select(sval);
			sel4.selectByValue(value);
			//System.out.println("The element with id "+id+" is selected using value " +sval);
			reportStep("The element with id "+id+" is selected using value " +value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected in the application");
			reportStep("The element with id "+id+" is not selected in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected as unexpected alert opened");
			reportStep("The element with id "+id+" is not selected as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with is "+id+" is not selected due to an unknown error");
			reportStep("The element with is "+id+" is not selected due to an unknown error", "FAIL");
		}
		finally {
			takeSnap();
		}
	}
	
	public void selectValueByClassName(String className, String value){
		
		try {
			WebElement calnam = driver.findElementByClassName(className);
			Select sel5 = new Select(calnam);
			sel5.selectByValue(value);
			//System.out.println("The element with classname "+className+" is selected using value " +value);
			reportStep("The element with classname "+className+" is selected using value " +value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with classname "+className+" is not found in the DOM");
			reportStep("The element with classname "+className+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+className+" is not selected in the appplication");
			reportStep("The element with classname "+className+" is not selected in the appplication", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+className+" is not selected as unexpected alert opened");
			reportStep("The element with classname "+className+" is not selected as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+className+" is not selected due to an unknown error");
			reportStep("The element with classname "+className+" is not selected due to an unknown error", "FAIL");
		}
		finally {
			takeSnap();
		}
	}
	
	public void selectVisibleTextByClassName(String className, String value) {
		try {
			WebElement vcalname = driver.findElementByClassName(className);
			Select sel6 = new Select(vcalname);
			sel6.selectByVisibleText(value);
			//System.out.println("The element with classname "+className+" is selected using value " +value);
			reportStep("The element with classname "+className+" is selected using value " +value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with classname "+className+" is not found in the DOM");
			reportStep("The element with classname "+className+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+className+" is not selected in the application");
			reportStep("The element with classname "+className+" is not selected in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+className+" is not selected as unexpected alert opened");
			reportStep("The element with classname "+className+" is not selected as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+className+" is not selected due to an unknown error");
			reportStep("The element with classname "+className+" is not selected due to an unknown error", "FAIL");
		}
		finally {
			takeSnap();
		}
	}
	public void selectIndexByClassName(String className, int value) {
		try {
			WebElement indname = driver.findElementByClassName(className);
			Select sel7 = new Select(indname);
			sel7.selectByIndex(value);
			//System.out.println("The element with classname "+className+" is selected using value " +value);
			reportStep("The element with classname "+className+" is selected using value " +value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with classname "+className+" is not found in the DOM");
			reportStep("The element with classname "+className+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+className+" is not selected in the application");
			reportStep("The element with classname "+className+" is not selected in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+className+" is not selected as an unexpected alert opened");
			reportStep("The element with classname "+className+" is not selected as an unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+className+" is not found due to an unknown error");
			reportStep("The element with classname "+className+" is not found due to an unknown error", "FAIL");
		}
		takeSnap();
	}

	@Override
	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement vname = driver.findElementByName(name);
			Select sel8 = new Select(vname);
			sel8.selectByValue(value);
			//System.out.println("The element with name "+name+" is selected using value " +value);
			reportStep("The element with name "+name+" is selected using value " +value, "PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM", "FAIL");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selected in the application");
			reportStep("The element with name "+name+" is not selected in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selected as an unexpected alert opened");
			reportStep("The element with name "+name+" is not selected as an unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not found due to an unknown error");
			reportStep("The element with name "+name+" is not found due to an unknown error", "FAIL");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void switchToFrame(int value) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().frame(value);
			//System.out.println("The frame is now active in the current frame");
			reportStep("The frame is now active in the current frame", "PASS");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame is not present in the application");
			reportStep("The frame is not present in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The frame is not active as unexpected alert opened");
			reportStep("The frame is not active as unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The frame is not present due to an unknown error");
			reportStep("The frame is not present due to an unknown error", "FAIL");
		}
		
	}

	@Override
	public void switchToFrame(String nameOrid) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(nameOrid);
			//System.out.println("The driver focus is on the given frame");
			reportStep("The driver focus is on the given frame", "PASS");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame is not present in the application");
			reportStep("The frame is not present in the application", "FAIL");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The frame is not present as an unexpected alert opened");
			reportStep("The frame is not present as an unexpected alert opened", "FAIL");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The frame is not present due to an unknown error");
			reportStep("The frame is not present due to an unknown error", "FAIL");
		}
	}

	@Override
	public void switchToDefaultContent() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().defaultContent();
			//System.out.println("The driver focus is now in the first frame");
			reportStep("The driver focus is now in the first frame", "PASS");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The driver focus is not present due to an unknown error");
			reportStep("The driver focus is not present due to an unknown error", "FAIL");
		}
		
	}

	@Override
	public void sendAlertKeys(String data) {
		// TODO Auto-generated method stub
		try {
			Alert alt = driver.switchTo().alert();
			alt.sendKeys(data);
			//System.out.println("The data "+data+" has been sent to the alert box");
			reportStep("The data "+data+" has been sent to the alert box", "PASS", false);
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("The data has not been sent as an unexpected alert opened");
			reportStep("The data has not been sent as an unexpected alert opened", "FAIL", false);
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The data has not been sent as there is no alert present in the application");
			reportStep("The data has not been sent as there is no alert present in the application", "FAIL", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The data has not been sent due to an unknown error");
			reportStep("The data has not been sent due to an unknown error", "FAIL", false);
		}
		
	}
	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
			//System.out.println("The page is now refreshed");
			reportStep("The page is now refreshed", "PASS");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void mouseHoverByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			Actions act = new Actions(driver);
			WebElement element = driver.findElementByXPath(xpathVal);
			act.moveToElement(element).perform();
			//System.out.println("The mouse pointer has been moved to the element with the xpath" +xpathVal);
			reportStep("The mouse pointer has been moved to the element with the xpath" +xpathVal, "PASS");
		} catch (NoSuchElementException e) {
			//System.err.println("The element is not found in the DOM");
			reportStep("The element is not found in the DOM", "FAIL");
		}catch (WebDriverException e) {
			//System.err.println("The element is not found due to an unknown error");
			reportStep("The element is not found due to an unknown error", "FAIL");
		}
		
	}

	@Override
	public void sendTab() {
		// TODO Auto-generated method stub
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
	}
	
	public void loadobject() {
		 prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void unloadobjects() {
		prop=null;
	}
	
}

	




