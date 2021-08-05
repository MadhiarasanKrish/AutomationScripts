package TestCases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.AssgnBaseClass;
import Pages.LoginPage;

public class SecondAssgnCases extends AssgnBaseClass {
	
	
	@BeforeTest()
	public void SetData() {
		ExcelFileName = "SecondAssign";
		testName = "AssignmentCase";
		testDescriptionadded = "SecondAssignment Flow";
		testername = "Madhiarasan";
		testcategory = "General Flow Testing";
		
	}
	
	@Test(dataProvider="Assignment")
	public void AssgnCases(String Usn, String Pwd,String Data1, String Data2, String Data3) throws Exception {
		
		new LoginPage()
		.Username(Usn)
		.Password(Pwd)
		.Login()
		.Togglebt()
		.Viewall()
		.ServiceCons()
		.DD()
		.FileDD()
		.LastModifiedDate()
		.DD1()
		.PublicLink()
		.Privatelink()
		.DD2()
		.Download()
		.DD3()
		.Sharelink()
		.SearchUser(Data1,Data2,Data3)
		.UploadFile()
		.fileSelection()
		.Done()
		.DD4()
		.ViewFieDetails()
		.DD5()
		.Delete();
		
		
	}

}
