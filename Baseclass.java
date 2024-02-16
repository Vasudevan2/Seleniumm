package org.freeTrial;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Baseclass {
	public static AndroidDriver driver;
	public static void main(String[] args) {
	    try {
	        openjosh();
	    } catch (Exception e) {
	        System.out.println(e.getCause());
	        System.out.println(e.getMessage());
	        e.printStackTrace();
	    }
	}
		@SuppressWarnings("deprecation")
		public static void openjosh() throws MalformedURLException, Exception {
			DesiredCapabilities cap = new DesiredCapabilities();
			 cap.setCapability("Devicename", "cr7");
			 cap.setCapability("udid","R58M3069G9R");
			 cap.setCapability("platformName", "Android");
			 cap.setCapability("platformVersion", "12");
			 cap.setCapability("appPackage","com.joshtalks.joshskills");
			 cap.setCapability("appActivity", "com.joshtalks.joshskills.ui.launch.LauncherActivity");
			 URL url=new URL("http://0.0.0.0:4723/wd/hub");
			 driver =new AndroidDriver(url,cap);  
				
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		public static void Touchaction() {
			TouchActions action = new TouchActions(driver);
				
		}
		public  void Startingfreetrialwithname() throws Exception  {
			 WebElement login = driver.findElement(By.id("com.joshtalks.joshskills:id/btnStartTrial"));	
			 login.click();
			 WebElement Hindilanguage = driver.findElement(By.xpath("//android.widget.TextView[@text='Hindi (हिन्दी)']"));
			 Hindilanguage.click();	
			// WebElement Reason = driver.findElement(By.xpath("//android.widget.TextView[@text='अन्य ...']"));
		//	 Reason.click();	
//			 WebElement others = driver.findElement(By.xpath("//android.widget.TextView[@text='Others ...']"));
//			 others.click();
			 WebElement Reason01 = driver.findElement(By.xpath("//android.widget.TextView[@text='USE ANOTHER METHOD']"));
			 Reason01.click();
//			 WebElement name = driver.findElement(By.xpath("//android.widget.TextView[@text='पढ़ाई के लिए']"));
//			name.click();
			
			
			WebElement Nameenter = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/name_edit_text']"));
			Nameenter.sendKeys("Vasu");
			WebElement Continue = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/btn_login']"));
			Continue.click();
//			 WebElement TC = driver.findElement(By.xpath("//*[@resource-id='com.truecaller:id/confirm']"));
//			    TC.click();
//			WebElement Continue = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/btn_login']"));
//			Continue.click();
			Thread.sleep(3000);

		}
		public void Lesson1() {
			WebElement Lesson1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Start Lesson']"));
			 Lesson1.click();
			 WebElement LessonStart = driver.findElement(By.className("android.widget.TextView"));
			 LessonStart.click();
			 
		}
		public void Lesson1grammarsection() throws Throwable  {
			 WebElement grammarstart = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/start_btn']"));
			 grammarstart.click();
			 
			//Question1
			WebElement I1 = driver.findElement(By.xpath("//android.widget.TextView[@text='I']"));
			I1.click();
			WebElement have = driver.findElement(By.xpath("//android.widget.TextView[@text='have']"));
			have.click();
			WebElement big = driver.findElement(By.xpath("//android.widget.TextView[@text='big']"));
			big.click();
			WebElement dreams = driver.findElement(By.xpath("//android.widget.TextView[@text='dreams']"));
			dreams.click();
			WebElement okbutton1 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton1.click();
			WebElement okbutton01 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton01.click();
			//Question2
			WebElement I2 = driver.findElement(By.xpath("//android.widget.TextView[@text='I']"));
			I1.click();
			WebElement want = driver.findElement(By.xpath("//android.widget.TextView[@text='want']"));
			want.click();
			WebElement some = driver.findElement(By.xpath("//android.widget.TextView[@text='some']"));
			some.click();
			WebElement milk = driver.findElement(By.xpath("//android.widget.TextView[@text='milk']"));
			milk.click();
			WebElement okbutton2 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton2.click();
			WebElement okbutton02 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton2.click();
			//Question3
			WebElement Ididnoteatrajmahforlunch = driver.findElement(By.xpath("//android.widget.RadioButton[@text='I did not eat rajmah for lunch']"));
			Ididnoteatrajmahforlunch.click();
			WebElement okbutton3 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton3.click();
			WebElement okbutton03 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton03.click();
			//Question4
			WebElement I3 = driver.findElement(By.xpath("//android.widget.TextView[@text='I']"));
			I3.click();
			WebElement ate = driver.findElement(By.xpath("//android.widget.TextView[@text='ate']"));
			ate.click();
			WebElement kachori = driver.findElement(By.xpath("//android.widget.TextView[@text='kachori']"));
			kachori.click();
			WebElement yesterday = driver.findElement(By.xpath("//android.widget.TextView[@text='yesterday']"));
			yesterday.click();
			WebElement okbutton4 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton3.click();
			WebElement okbutton04 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton03.click();
			//Question5
			WebElement peace = driver.findElement(By.xpath("//android.widget.RadioButton[@text='peace']"));
			peace.click();
			WebElement okbutton5 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton3.click();
			WebElement okbutton05 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton03.click();
			//Question6
			WebElement get = driver.findElement(By.xpath("//android.widget.RadioButton[@text='get']"));
			get.click();
			WebElement okbutton6 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton6.click();
			WebElement okbutton06 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton06.click();
			//Question7
			WebElement ought = driver.findElement(By.xpath("//android.widget.RadioButton[@text='ought']"));
			ought.click();
			WebElement okbutton7 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton7.click();
			WebElement okbutton07 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton07.click();
			//Question08
			WebElement Dharmendra = driver.findElement(By.xpath("//android.widget.TextView[@text='Dharmendra']"));
			Dharmendra.click();
			WebElement married = driver.findElement(By.xpath("//android.widget.TextView[@text='married']"));
			married.click();
			WebElement Sheetal = driver.findElement(By.xpath("//android.widget.TextView[@text='Sheetal']"));
			Sheetal.click();
			WebElement okbutton8 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton8.click();
			WebElement okbutton08 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton08.click();
			//Question09
			WebElement यह = driver.findElement(By.xpath("//android.widget.TextView[@text='यह']"));
			यह.click();
			WebElement मेरी = driver.findElement(By.xpath("//android.widget.TextView[@text='मेरी']"));
			मेरी.click();
			WebElement पहली = driver.findElement(By.xpath("//android.widget.TextView[@text='पहली']"));
			पहली.click();
			WebElement गाड़ी = driver.findElement(By.xpath("//android.widget.TextView[@text='गाड़ी']"));
			गाड़ी.click();
			WebElement है = driver.findElement(By.xpath("//android.widget.TextView[@text='है']"));
			है.click();
			WebElement okbutton9 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton9.click();
			WebElement okbutton09 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton09.click();
			//Question10
			WebElement on = driver.findElement(By.xpath("//android.widget.RadioButton[@text='on']"));
			on.click();
			WebElement okbutton10 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn']"));
			okbutton10.click();
			WebElement okbutton010 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/grammar_btn'][1]"));
			okbutton10.click();
			Thread.sleep(3000);
			WebElement cancel = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/close']"));
			cancel.click();
			WebElement sec1finish = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/score_start_btn']"));
		    sec1finish.click();
		    Thread.sleep(3000);
		}
		@SuppressWarnings("deprecation")
		public void Lesson1speakingsection() throws Exception 
		{
			WebElement P2P = driver.findElement(By.xpath("//android.widget.TextView[@text='Call Practice Partner']"));
			P2P.click();
			WebElement Audioaccess = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']"));
			Audioaccess.click();
			WebElement Bluetoothaccess = driver.findElement(By.xpath("//android.widget.Button[@text='Allow']"));
			Bluetoothaccess.click();
			WebElement Phonecallaccess = driver.findElement(By.xpath("//android.widget.Button[@text='Allow']"));
			Phonecallaccess.click();
			WebElement photosaccess = driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']"));
			photosaccess.click();
//			TouchActions action = new TouchActions(driver);
//			WebElement P2P01 = driver.findElement(By.xpath("//android.widget.TextView[@text='Call Practice Partner']"));
//			action.scroll(P2P01, 87, 902);
//			action.perform();
//			P2P01.click();
			Thread.sleep(12000);
			WebElement callend = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/btn_action']"));
			callend.click();
			WebElement Yes = driver.findElement(By.xpath("//android.widget.Button[@text='YES']"));
			Yes.click();
			//WebElement cancel = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/close']"));
			//cancel.click();
			WebElement Intermediate = driver.findElement(By.xpath("//android.widget.RadioButton[@text='Intermediate']"));
			Intermediate.click();
			WebElement Levelcontinue = driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']"));
			Levelcontinue.click();
			WebElement Teaching = driver.findElement(By.xpath("//android.widget.CompoundButton[@text='Teaching']"));
			Teaching.click();
			WebElement Save = driver.findElement(By.xpath("//android.widget.TextView[@text='Save']"));
			Save.click();
			Thread.sleep(4000);
			WebElement Scratchcard = driver.findElement(By.className("android.widget.FrameLayout"));
			TouchAction actionOne = new TouchAction(driver);
			actionOne.press(ElementOption.element(Scratchcard, 188, 1565));
			actionOne.moveTo(ElementOption.element(Scratchcard,873, 784));
			actionOne.release().perform();
			TouchAction actionTwo = new TouchAction(driver);
			actionTwo.press(ElementOption.element(Scratchcard, 888, 1579));
			actionTwo.press(ElementOption.element(Scratchcard, 185, 847));
			actionTwo.release().perform();
			WebElement markascorrect = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/mark_as_correct']"));
			markascorrect.click();
			WebElement Grammar = driver.findElement(By.xpath("//android.widget.TextView[@text='Grammar']"));
			Grammar.click();
			
		}
		public void Lesson1vocabularysection() throws Throwable {
			WebElement Recordoption = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/upload_practise_view']"));
			AndroidTouchAction touch = new AndroidTouchAction(driver);
			LongPressOptions longpress = new LongPressOptions();
			longpress.withDuration(Duration.ofSeconds(10)).withElement(ElementOption.element(Recordoption));
			WebElement recordaudio = driver.findElement(By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']"));
			recordaudio.click();
			touch.longPress(longpress).release().perform();
			WebElement vocabularysubmit = driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']"));
			vocabularysubmit.click();
			Thread.sleep(5000);
			WebElement cancel = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/close']"));
			cancel.click();
			WebElement continue03 = driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']"));
			continue03.click();
		}
		public void Lesson1readingsection() throws Throwable {
			WebElement Recordoption04 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/recording_view']"));
			AndroidTouchAction touch = new AndroidTouchAction(driver);
			LongPressOptions longpress = new LongPressOptions();
			longpress.withDuration(Duration.ofSeconds(10)).withElement(ElementOption.element(Recordoption04));
			touch.longPress(longpress).release().perform();	
			WebElement Submit04 = driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']"));
			Submit04.click();
			Thread.sleep(3000);
			WebElement cancel = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/close']"));
			cancel.click();
			WebElement continue04 = driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']"));
			continue04.click();
			Thread.sleep(3000);
		}
		public void blackscreen() throws Exception {
			Thread.sleep(8000);
			WebElement UnlockNextClass2 = driver.findElement(By.xpath("//android.widget.Button[@text='Unlock Next Class']"));
			UnlockNextClass2.click();
		}
		public void Lesson2unlock() {
			WebElement UnlockNextClass2 = driver.findElement(By.xpath("//android.widget.Button[@text='Unlock Next Class']"));
			UnlockNextClass2.click();
			//Lesson2
			WebElement Lesson2 = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/start_lesson_tv_shimmer']"));
			Lesson2.click();
			WebElement Lesson2back = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/iv_back']"));
			Lesson2back.click();
		}
		public void Lesson3unlock() {
			WebElement UnlockNextClass3 = driver.findElement(By.xpath("//android.widget.Button[@text='Unlock Next Class']"));
			UnlockNextClass3.click();
		}
		public void Chattoinbox() {
			WebElement Chatscreenback = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/iv_back']"));
			Chatscreenback.click();
		}
		public void Ultimatespokenenglish() {
			WebElement Ultisenglish = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/tv_name']"));
			Ultisenglish.click();
		}
		public void Buyingspokenenglishcourse() throws Throwable {
			WebElement BuyEnglishCourse = driver.findElement(By.xpath("//android.widget.TextView[@text='Buy English Course']"));
			BuyEnglishCourse.click();
			WebElement BuyTheUltimateSpokenEnglishCourse = driver.findElement(By.xpath("//android.widget.TextView[@text='English +65 Courses']"));
			BuyTheUltimateSpokenEnglishCourse.click();
			WebElement ProceedtoPayment = driver.findElement(By.xpath("//android.widget.TextView[@text='Proceed to Payment']"));
			ProceedtoPayment.click();
			Thread.sleep(10000);
			WebElement NetbankingAllIndianbanks = driver.findElement(By.xpath("//android.view.View[@text='Netbanking All Indian banks']"));
			NetbankingAllIndianbanks.click();
			WebElement Yesbank = driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']"));
			Yesbank.click();
			WebElement Pay999 = driver.findElement(By.xpath("//android.widget.Button[@text='PAY ₹ 999 PAY ₹ 999']"));
			Pay999.click();
			Thread.sleep(10000);
			WebElement Success = driver.findElement(By.xpath("//android.widget.Button[@text='Success']"));
			Success.click();
			Thread.sleep(10000);
		}
		public void Registraion() throws Throwable {
			WebElement RegisterNow = driver.findElement(By.xpath("//android.widget.TextView[@text='Register Now']"));
			RegisterNow.click();	
			WebElement MobileNumber = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/mobile_et']"));
			MobileNumber.click();
			MobileNumber.sendKeys("9176011967");
			WebElement SendOTP = driver.findElement(By.xpath("//android.widget.Button[@text='Send OTP']"));
			SendOTP.click();
			Thread.sleep(3000);
			WebElement OTPenter = (WebElement) driver.findElement(By.className("android.widget.EditText"));
			OTPenter.click();
			OTPenter.sendKeys("0000");
	        Thread.sleep(5000);
	        WebElement Name = driver.findElement(By.xpath("//android.widget.EditText[@text='Your Name']"));
			Name.click();
			Name.sendKeys("vasu");
			 WebElement DOB = driver.findElement(By.xpath("//android.widget.EditText[@text='e.g. 01 Jan 1990']"));
				DOB.click();
				WebElement DOBscroll = driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
				DOBscroll.click();
				WebElement Gender = driver.findElement(By.xpath("//android.widget.TextView[@text='Male']"));
				Gender.click();
				WebElement Occupation = driver.findElement(By.xpath("//android.widget.EditText[@text='e.g. Manager at Flipkart']"));
				Occupation.sendKeys("Manager");
				WebElement Aspiration = driver.findElement(By.xpath("//android.widget.EditText[@text='e.g. IAS Officer']"));
				Aspiration.sendKeys("IPS");
				WebElement Next = driver.findElement(By.xpath("//android.widget.Button[@text='Next']"));
				Next.click();
				Thread.sleep(3000);
				WebElement Photoskip = driver.findElement(By.xpath("//android.widget.TextView[@text='Skip']"));
				Photoskip.click();
				Thread.sleep(5000);
				WebElement Ultisenglish = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/tv_name']"));
				Ultisenglish.click();
		}
		public void Cohorts() throws Throwable {
			WebElement Continue = driver.findElement(By.xpath("//android.widget.Button[@text='Continue >']"));
			Continue.click();
			Thread.sleep(2000);
			WebElement Cohorts = driver.findElement(By.xpath("//*[@resource-id='com.joshtalks.joshskills:id/btn_continue']"));
			Cohorts.click();
			Thread.sleep(2000);
			WebElement Batchtime = driver.findElement(By.xpath("//android.widget.TextView[@text='05:00 PM - 06:00 PM']"));
			Batchtime.click();
			Thread.sleep(2000);
			WebElement Cohortscontinue = driver.findElement(By.xpath("//android.widget.Button[@text='Continue to course >']"));
			Cohortscontinue.click();
			
			
		}
}
