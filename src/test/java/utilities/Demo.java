package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
	public FileInputStream data() throws FileNotFoundException {
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\utilities\\team.properties");
return ip;
}
}