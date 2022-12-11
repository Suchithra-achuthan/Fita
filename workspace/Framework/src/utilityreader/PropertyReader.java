package utilityreader;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws IOException {
		Properties objProp = new Properties();
		FileInputStream FIS = new FileInputStream("C:\\Users\\vbalasub\\workspace\\Framework\\src\\data\\staticdata.properties");
		objProp.load(FIS);
		System.out.println(objProp.getProperty("URL"));
	}

}
