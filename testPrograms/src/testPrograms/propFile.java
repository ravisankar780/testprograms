package testPrograms;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class propFile {

	@Test
	public void getdatafromPropFile() throws IOException {
		Properties OR = new Properties();
		File propFile = new File(System.getProperty("user.dir")+"/src/testPrograms/OR.properties");
		FileInputStream fis = new FileInputStream(propFile);
		OR.load(fis);
		System.out.println("username is: "+OR.getProperty("UserName"));
		System.out.println("Password is: "+OR.getProperty("Password"));
	}

}
