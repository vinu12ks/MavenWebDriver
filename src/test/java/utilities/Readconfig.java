package utilities;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Readconfig {
	public static Properties Readconfi() {
		Properties pro=new Properties();
		File src=new File("E:\\WorkBench\\Bookings\\ConfigProperties\\Data.properties");
		FileReader reader;
		try {
			reader=new FileReader(src);
			pro.load(reader);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return pro;

}
}
