package com.bhiman.test.materials;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.pages.materials.MaterialsPage;
import com.bhiman.test.BaseTest;
import com.bhiman.utility.PropertyReader;

public class MaterialsTest extends BaseTest {
  
	private static final Logger LOG = Logger.getLogger(MaterialsTest.class);
  
	  
		@Test(groups = "Regression",description = "To verify and validate Material tab ")

		public void toverifyClickOnMaterial() {
			MaterialsPage material = new MaterialsPage();
			material.clickonMaterials();
			Constants.expected = "http://103.50.162.196/testing/material.php";
			Constants.actual = UIKeywords.getPageUrl();
			Assert.assertEquals(Constants.actual, Constants.expected);
		}

	  
		@Test(groups = "Regression",description = "To verify and validate Text of Material  ")

		public void toVrifynameofmaterial() {
			MaterialsPage material = new MaterialsPage();
			Constants.expected="Materials";
			Constants.actual=material.getTextofMaterial();
			Assert.assertEquals(Constants.actual, Constants.expected);	
		}

	  
		@Test(groups = "Regression",description = "To verify and validate Text of copy on material page  ")

		public void toVerifytextofCopyTabforMaterialPage() {
			MaterialsPage material = new MaterialsPage();
			material.clickonMaterials();
			String Materialpage_copy_expected="Copy";
			String Material_Copy_actual=material.getTextofCopyonMaterialPage();
			Assert.assertEquals(Material_Copy_actual, Materialpage_copy_expected);
		}
		
		//test case for Excel, csv, pdf, print and Search box*************
		@Test(groups = "Regression",description = "To verify and validate add material tab is clickable  ")
		public void toVerifyaddMaterialTabisclickable() {
			MaterialsPage material = new MaterialsPage();
			material.clickonMaterials();
			material.clickonaddMaterial();
			String Materials_expectedUrl = "http://103.50.162.196/testing/material.php#";
			String Materials_actualUrl = UIKeywords.getPageUrl();
			Assert.assertEquals(Materials_actualUrl, Materials_expectedUrl);
		}


		
		
	  
		@Test(groups = "Regression",description = "To verify and validate view material tab is clickable   ")
		public void toverifyviewMaterialTabisclickable() {
			MaterialsPage material = new MaterialsPage();
			material.clickonMaterials();
			material.clickonaddMaterial();
			material.clickonViewMaterial();
			String Materials_expectedUrl = "http://103.50.162.196/testing/material.php#";
			String Materials_actualUrl = UIKeywords.getPageUrl();
			Assert.assertEquals(Materials_actualUrl, Materials_expectedUrl);
			
		}
		@Test
		public void EndtoEndTestofMaterial() {
			MaterialsPage material = new MaterialsPage();
			Constants.flag = false;
			material.clickonMaterials();
			material.clickonaddMaterial();
			material.entertoMaterialDate("01-01-2020");
			material.selectProjectName("DEFENCE COLONY");
			material.enterMaterialName("Iron Rod");
			material.enterAmountforMaterial("3999");
			material.uploadmaterialBill("C:\\Users\\ingalkar\\Desktop\\up load only\\material.rtf");
			material.clickonsubmit();
			
			String Materials_expectedUrl = "http://103.50.162.196/testing/material.php";
			String Materials_actualUrl = UIKeywords.getPageUrl();
			Assert.assertEquals(Materials_actualUrl, Materials_expectedUrl);

		}


		
		@Test(groups = "Regression",description = "To verify and validate Date format is valid  ")

		public void toVerifyDateTabonMatrialPage() {
			MaterialsPage material = new MaterialsPage();
			Constants.flag = false;
			material.clickonMaterials();
			material.clickonaddMaterial();

			String value=PropertyReader.getLocatorValue("Material_purchase_date");
			if (value !=null && value.matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$")) {
				material.entertoMaterialDate(value);
				Constants.flag=true;
			}
			LOG.error("this test case is fail");
			Assert.assertTrue(true, "Date format is valid");	
		}
		
		@Test(groups = "Regression",description = " verify and validate material name format ")
		public void toVerifyvalidmaterialname() {
			MaterialsPage material = new MaterialsPage();
			Constants.flag = false;
			material.clickonMaterials();
			material.clickonaddMaterial();
			String value=PropertyReader.getLocatorValue("Material_purchese_name");
			if (value !=null && value.matches("^[a-zA-Z ]*$")) {
				material.enterMaterialName(value);
				Constants.flag=true;
			}
			Assert.assertTrue(true, "valid material name enter");
		}
		
		@Test(groups = "Regression",description = " verify and in validate material name format  ")
		public void toVerifyinvalidMaterialNameformat() {
			MaterialsPage material = new MaterialsPage();
			Constants.flag = false;
			material.clickonMaterials();
			material.clickonaddMaterial();
			String value=PropertyReader.getLocatorValue("Material_purchase_name");
			if (value !=null && !value.matches("^[a-zA-Z ]*$")) {
				material.enterMaterialName(value);
				Constants.flag=true;
			}
			LOG.error("invalid format accepte ");
			Assert.assertFalse(false, "invalid format Accpted");
		}


  
}