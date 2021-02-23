package com.bhiman.main;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;

public class Constants {
	
	public static WebDriver driver = null;
	public static WebElement element = null;
	public static String dir = System.getProperty("user.dir");
	public static WebDriverWait wait = null;
	public static FileInputStream fis = null;	
	public static Properties prop = null;
	public static AShot shot = null;
	public static Actions actions = null;
	public static Select select = null;

}
