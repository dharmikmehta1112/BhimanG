package com.bhiman.test.materials;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.main.UIKeywords;
import com.bhiman.main.materials.Materials;
import com.bhiman.test.BaseTest;
import com.bhiman.test.masters.UsersTest;

public class MaterialsTest extends BaseTest {
  
	private static final Logger LOG = Logger.getLogger(UsersTest.class);
  
	@Test(description = "To verify and validate Material tab ")
	public void toverifyClickOnMaterial() {
		Materials material = new Materials();
		material.clickonMaterials();
		String Materials_expectedUrl = "http://103.50.162.196/testing/material.php";
		String Materials_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Materials_actualUrl, Materials_expectedUrl);
	}
  
	@Test(description = "To verify and validate Text of Material  ")
	public void toVrifynameofmaterial() {
		Materials material = new Materials();
		String Material_name_expected="Materials";
		String Material_Name_actual=material.getTextofMaterial();
		Assert.assertEquals(Material_Name_actual, Material_name_expected);	
	}
  
	@Test(description = "To verify and validate Text of copy on material page  ")
	public void toVerifytextofCopyTabforMaterialPage() {
		Materials material = new Materials();
		material.clickonMaterials();
		String Materialpage_copy_expected="Copy";
		String Material_Copy_actual=material.getTextofCopyonMaterialPage();
		Assert.assertEquals(Material_Copy_actual, Materialpage_copy_expected);
	}
	
	//test case for Excel, csv, pdf, print and Search box*************
	@Test
	public void toVerifyaddMaterialTabisclickable() {
		Materials material = new Materials();
		material.clickonMaterials();
		material.clickonaddMaterial();
		String Materials_expectedUrl = "http://103.50.162.196/testing/material.php#";
		String Materials_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Materials_actualUrl, Materials_expectedUrl);
	}
  
	@Test
	public void toverifyviewMaterialTabisclickable() {
		Materials material = new Materials();
		material.clickonMaterials();
		material.clickonaddMaterial();
		material.clickonViewMaterial();
		String Materials_expectedUrl = "http://103.50.162.196/testing/material.php#";
		String Materials_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Materials_actualUrl, Materials_expectedUrl);

	}
  
	public void toVerifyDateTabonMatrialPage() {
		Materials material = new Materials();
		material.clickonMaterials();
		material.clickonaddMaterial();
		
	}

  
}