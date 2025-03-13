package Day3;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization {

	public class DeSerialization {
		
		@Test
		void convertJson2Pojo() throws JsonProcessingException
		{
			
			String d="{\n"
					+ "  \"name\" : \"Veeresh\",\n"
					+ "  \"code\" : \"VA\"\n"
					+ "}";
			ObjectMapper ob=new ObjectMapper();
			
			POJO2JSON poj=ob.readValue(d,POJO2JSON.class);
			
			System.out.println("Name: "+poj.getName());
			System.out.println("Code: "+poj.getCode());
			
		}

	}

}
