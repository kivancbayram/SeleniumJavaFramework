package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.logging.log4j.core.net.ssl.StoreConfiguration;

import test.Test1_GoogleSearchTestNG;

public class PropertiesFile {

		static Properties prop = new Properties();
		public static void main(String[] args) {
			getProperties();
			setProperties();
			getProperties();
		}
		
		public static void getProperties() {
			
			
			try {
				
				InputStream input;
				input = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\src\\test\\java\\config\\config.properties");
				prop.load(input);
				
				String browser = prop.getProperty("browser"); // string bir degiskende tutal�m
				System.out.println(browser);
			} catch (Exception exp) {
				// TODO Auto-generated catch block
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
				// bu asag�daki sat�rla test class�m�z icin properties file�ndaki degiskenlerden yararlan�r�z
				// ona mgore bu asag�daki testng claas�nda if else vs herhangi bir islemle kullan�r�z
				// testng class�nda PropertiesFile.getProperties(); yazar�z ki bura cal�ss�n vs 17 videoda anlat�yor Raghav reis
				Test1_GoogleSearchTestNG.browserName= prop.getProperty("browser");
			}
			
			
		}
		
		public static void setProperties() {
			try {
				
				OutputStream output = new FileOutputStream("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\SeleniumJavaFramework\\\\src\\\\test\\\\java\\\\config\\\\config.properties");
				prop.setProperty("browser", "chrome");
				prop.store(output, null);
			} catch (Exception exp) {
				// TODO: handle exception
				
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			
		}
}
