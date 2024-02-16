package org.freeTrial;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class Namefreetrial extends Baseclass {
	
	
	
	
@Test(priority=1)	
public void open()  {
	try {
        openjosh();
    } catch (Exception e) {0-0-
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
	 driver.manage( ).timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

@Test(priority=2)
public void TC1() throws Throwable  {
	    Startingfreetrialwithname();
	    Lesson1();
	    Lesson1speakingsection();
		Lesson1grammarsection();
		Lesson1vocabularysection();
		Lesson1readingsection();
		blackscreen();
		Lesson2unlock();
		Lesson3unlock();
	}
@Test(priority=3)
	private void TC2() throws Throwable {
	    Chattoinbox();
	    Ultimatespokenenglish();
	    Chattoinbox();
		Buyingspokenenglishcourse();
		
	}
	}

