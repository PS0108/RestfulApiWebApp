package springbootstarter.processor;

import java.io.BufferedReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class GetRequest {
	
	@RequestMapping()
	public JsonNode getUsers() throws JsonProcessingException, IOException{
		
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("./contents.json").getAbsoluteFile();
		JsonNode jsonNode = objectMapper.readTree(file);
		return (jsonNode);
	}
	
	@RequestMapping("/{userId}")
	public JsonNode getId(@PathVariable("userId") int userId)  throws IOException{
		
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("./contents.json").getAbsoluteFile();
		JsonNode jsonNode = objectMapper.readTree(file);
//		List<String> list = new ArrayList<String>();
//		String json ="";
//		String fnameNode="", lnameNode="", phoneNumberNode="", emailAddressNode="", userIdNode="";
//		Map<String, String> map = new HashMap<String, String>();
		for(JsonNode root : jsonNode) {	
			if(userId == root.path("userId").asInt()) {	
				return root;
				
//				userIdNode = root.path("userId").asText();
//				 fnameNode = root.path("firstName").asText();
//				 lnameNode = root.path("lastName").asText();
//				 phoneNumberNode = root.path("phoneNumber").asText();
//				 emailAddressNode = root.path("emailAddress").asText();
//				 JsonNode ordersNode = root.path("orders");	
//				 map.put("userId",userIdNode);
//				 map.put("firstName",fnameNode);
//				 map.put("lastName",lnameNode);
//				 map.put("phoneNumber",phoneNumberNode);
//				 map.put("emailAddress",emailAddressNode);
//				 for(JsonNode node : ordersNode) {
//					 int i=0;
//					 int y = i+1;
//					 map.put("orders"+y,node.get(i).asText());
//					 i++;
//				 }
//				 
			} 
//			
//			json = new ObjectMapper().writeValueAsString(map);
//			System.out.println(json);
		}
		return (jsonNode);
	}
	
	@RequestMapping("/{userId}/orders")
	public JsonNode getUserOrders(@PathVariable("userId") int userId)  throws IOException{
		
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("./contents.json").getAbsoluteFile();
		//File file = new File(getClass().getResource("contents.json").getFile());
		JsonNode jsonNode = objectMapper.readTree(file);
		JsonNode ordersNode = objectMapper.createObjectNode();
		for(JsonNode root : jsonNode) {	
			if(userId == root.path("userId").asInt()) {	

				 ordersNode = root.path("orders");
			}	
			System.out.println(ordersNode);
		}
		return (ordersNode);
	}
	
	@RequestMapping("/{userId}/orders/{orderId}")
	public JsonNode getUserOrders(@PathVariable("userId") int userId,
			@PathVariable("orderId") String orderId)  throws IOException{
		
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("./contents.json").getAbsoluteFile();
		JsonNode jsonNode = objectMapper.readTree(file);
		JsonNode orderIdNode = objectMapper.createObjectNode();

		for(JsonNode root : jsonNode) {	
			if(userId == root.path("userId").asInt()) {	
				 JsonNode ordersNode = root.path("orders");
				 Iterator<Entry<String, JsonNode>> fields = ordersNode.fields();				
				 while(fields.hasNext()) {
					 Entry<String, JsonNode> jsonField = fields.next();					 
					 if(jsonField.getKey().equals(orderId)) {	
						 orderIdNode = jsonField.getValue();
						 break;
					 }
				 }	
			}				
		}
		return (orderIdNode);
	}
	
}
