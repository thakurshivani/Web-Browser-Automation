package minor_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Testing_and_Automation extends JFrame implements ActionListener{
	static WebDriver driver;//
	JFrame f;  
	public Testing_and_Automation() {
		f=new JFrame();//creating instance of JFrame 
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible JButton b=new JButton("click");//creating instance of JButton  
		Container c = f.getContentPane();
		c.setBackground(Color.decode("#000000"));
		
		JLabel heading = new JLabel("AUTOMATION TESTING");
		//heading.setBounds(600,-50,800,200);
		heading.setBounds(320,50,750,100); 
		heading.setForeground(Color.decode("#CD853F"));//using hexadecimal
		heading.setFont(new Font("Courier New", Font.BOLD, 60));
		heading.setHorizontalAlignment(0);
		f.add(heading);//adding button in JFrame  
		
		JButton loginfb=new JButton("FB LOGIN");//creating instance of JButton  
		loginfb.setBounds(300,200,350,100); // adding coordinates of button
		loginfb.setForeground(Color.decode("#F5DEB3"));//adding foreground color using hexadecimal
		loginfb.setBackground(Color.decode("#006400"));//adding background color using hexadecimal
		loginfb.setFont(new Font("Courier New", Font.BOLD, 30));//adding font,font Size and Bold
		f.add(loginfb);//adding button in JFrame  
		loginfb.addActionListener(this); 
		
		JButton registerfb=new JButton("FB REGISTER"); 
		registerfb.setBounds(300,400,350,100);  
		registerfb.setForeground(Color.decode("#F5DEB3"));
		registerfb.setBackground(Color.decode("#006400"));
		registerfb.setFont(new Font("Courier New", Font.BOLD, 30));
		f.add(registerfb);//adding button in JFrame  
		registerfb.addActionListener(this); 
		
		JButton rgpvsignin=new JButton("RGPV SIGNIN");
		rgpvsignin.setBounds(750,200,350, 100); 
		rgpvsignin.setForeground(Color.decode("#F5DEB3"));
		rgpvsignin.setBackground(Color.decode("#006400"));
		rgpvsignin.setFont(new Font("Courier New", Font.BOLD, 30));
		f.add(rgpvsignin);
		rgpvsignin.addActionListener(this); 

		JButton railwayenquiry=new JButton("RAILWAY ENQUIRY"); 
		railwayenquiry.setBounds(750,400,350,100); 
		railwayenquiry.setForeground(Color.decode("#F5DEB3"));
		railwayenquiry.setBackground(Color.decode("#006400"));
		railwayenquiry.setFont(new Font("Courier New", Font.BOLD, 30));
		f.add(railwayenquiry);
		railwayenquiry.addActionListener(this); 

		f.setDefaultCloseOperation(EXIT_ON_CLOSE);//Enable "X" button of Frame
	}
	public static void indianRailways() throws Exception { 
		//Location of web driver in your system
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//creating instance of WebDriver class
		//URL of web page
		driver.get("http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=index.html");
		driver.manage().window().maximize();
		//URL of web page
		driver.get("http://www.indianrail.gov.in/enquiry/TBIS/TrainBetweenImportantStations.html?locale=en");
		driver.findElement(By.cssSelector("#sourceStation")).clear();//clearing previous values
		driver.findElement(By.cssSelector("#sourceStation")).sendKeys("BHOPAL");//adding new values
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ARROW_DOWN);//adding keys
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ARROW_DOWN);//adding new keys
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ENTER);//adding new keys
		driver.findElement(By.cssSelector("#destinationStation")).clear();
		driver.findElement(By.cssSelector("#destinationStation")).sendKeys("MUMBAI");
		driver.findElement(By.id("destinationStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("destinationStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("destinationStation")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("modal1")).click();//clicking button
		Thread.sleep(10000);//program pause
		driver.findElement(By.id("test")).click();//clicking button
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;//instantiation for scrolling down
		jse1.executeScript("scroll(0,900)");//scrolling down by 600 rows
		Thread.sleep(5000);
		driver.get("http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html?locale=en");
		driver.findElement(By.id("trainNo")).sendKeys("12137 - PUNJAB MAIL");
		driver.findElement(By.cssSelector("#sourceStation")).clear();
		driver.findElement(By.cssSelector("#sourceStation")).sendKeys("BHOPAL");
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#destinationStation")).clear();
		driver.findElement(By.cssSelector("#destinationStation")).sendKeys("NDLS");
		driver.findElement(By.id("destinationStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("destinationStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("destinationStation")).sendKeys(Keys.ENTER);
		Select clas = new Select(driver.findElement(By.xpath("//*[@id=\"class\"]")));//inspecting the textfield name using xpath 
		clas.selectByIndex(4);//drop down selection 
		Select quota = new Select(driver.findElement(By.xpath("//*[@id=\"quota\"]")));
		quota.selectByIndex(4);
		driver.findElement(By.id("modal1")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("test")).click();
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("scroll(0,900)");
		Thread.sleep(1000);
		driver.get("http://www.indianrail.gov.in/enquiry/FARE/FareEnquiry.html?locale=en");
		driver.findElement(By.id("trainNo")).sendKeys("12137 - PUNJAB MAIL");
		driver.findElement(By.cssSelector("#sourceStation")).clear();
		driver.findElement(By.cssSelector("#sourceStation")).sendKeys("BHOPAL");
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("sourceStation")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#destinationStation")).clear();
		driver.findElement(By.cssSelector("#destinationStation")).sendKeys("NDLS");
		driver.findElement(By.id("destinationStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("destinationStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("destinationStation")).sendKeys(Keys.ENTER);
		Select clas1 = new Select(driver.findElement(By.xpath("//*[@id=\"class\"]")));
		clas1.selectByIndex(4);
		Select quota1 = new Select(driver.findElement(By.xpath("//*[@id=\"quota\"]")));
		quota1.selectByIndex(4);
		driver.findElement(By.id("modal1")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("test")).click();
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(700);
		driver.get("http://www.indianrail.gov.in/enquiry/SCHEDULE/TrainSchedule.html?locale=en");
		driver.findElement(By.id("trainNo")).sendKeys("12137 - PUNJAB MAIL");
		driver.findElement(By.id("modal1")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("test")).click();
		JavascriptExecutor jse4 = (JavascriptExecutor)driver;
		jse4.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(700);
		driver.get("http://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en");
		driver.findElement(By.id("inputPnrNo")).sendKeys("1234567891");
		driver.findElement(By.id("modal1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("test")).click();
		JavascriptExecutor jse5 = (JavascriptExecutor)driver;
		jse5.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(200);
		driver.findElement(By.xpath("[@id=\"myModal\"]/div/div/div[1]/button")).click();
		JavascriptExecutor jse6 = (JavascriptExecutor)driver;
		jse6.executeScript("window.scrollBy(0,600)", "");
		driver.close();
		}
	public static void fbRegister() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.findElement(By.id("u_0_k")).sendKeys("Lakshmi");
		driver.findElement(By.id("u_0_m")).sendKeys("Narain");
		driver.findElement(By.id("u_0_p")).sendKeys("9111635795");
		driver.findElement(By.id("u_0_w")).sendKeys("Lakshmi@123");
		Select date = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		date.selectByIndex(15);
		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		month.selectByIndex(1);
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		year.selectByIndex(22);
	    WebElement radio = driver.findElement(By.id("u_0_c"));
	    radio.click();
		driver.findElement(By.id("u_0_12")).click();
		Thread.sleep(5000);
		driver.close();
	}
	public static void fbLogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("harry.putter.9693");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Harry@123");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		driver.close();
	}
	public static void rgpvSignin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rgpv.ac.in/");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/a/span")).click();
		driver.findElement(By.id("UserLogin1_txtUserName")).sendKeys("0157CS151144");
		driver.findElement(By.id("UserLogin1_txtPassword")).sendKeys("shivan");
		Thread.sleep(30000);
		driver.findElement(By.id("UserLogin1_btnLogin")).click();
		Thread.sleep(60000);
		Thread.sleep(5000);
		driver.close();
	}
	public static void main(String[] args){	
			new Testing_and_Automation();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if (str.equals("FB LOGIN")) {
			try {//try block
				Testing_and_Automation.fbLogin();
			} catch (Exception e) {
				// catch block
				e.printStackTrace();
			}
		}	
		else if (str.equals("FB REGISTER")) {
			try {
				Testing_and_Automation.fbRegister();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (str.equals("RGPV SIGNIN")) {
			try {
				Testing_and_Automation.rgpvSignin();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (str.equals("RAILWAY ENQUIRY")) {
			try {
				Testing_and_Automation.indianRailways();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
















