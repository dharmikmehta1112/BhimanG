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
	
	public static WebDriver driver;
	public static WebElement element;
	public static String dir = System.getProperty("user.dir");
	public static WebDriverWait wait;
	public static FileInputStream fis;	
	public static Properties prop ;
	public static AShot shot;
	public static Actions actions;
	public static Select select;

}
