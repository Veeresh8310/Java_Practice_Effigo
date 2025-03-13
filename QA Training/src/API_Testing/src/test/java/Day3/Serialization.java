package Day3;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {
	
	@Test
	void convertPojo2Json() throws JsonProcessingException
	{
		POJO2JSON p=new POJO2JSON();
		
		p.setName("Veeresh");
		p.setCode("VA");
		
		ObjectMapper ob=new ObjectMapper();
		
		String data=ob.writerWithDefaultPrettyPrinter().writeValueAsString(p);
		
		System.out.println(data);
		
	}

}
